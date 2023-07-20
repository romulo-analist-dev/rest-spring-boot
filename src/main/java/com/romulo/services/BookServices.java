package com.romulo.services;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romulo.controllers.BookController;
import com.romulo.data.vo.v1.BookVO;
import com.romulo.exceptions.RequiredObjectIsNullException;
import com.romulo.exceptions.ResourceNotFoundException;
import com.romulo.mapper.DozerMapper;
import com.romulo.mapper.custom.PersonMapper;
import com.romulo.model.Book;
import com.romulo.repositories.BookRepository;

@Service
public class BookServices {

	private Logger logger = Logger.getLogger(BookServices.class.getName());

	@Autowired
	BookRepository repository;

	@Autowired
	PersonMapper mapper;

	public List<BookVO> findAll() {
		logger.info("Finding all books...");

		var books = DozerMapper.parseListObjects(repository.findAll(), BookVO.class);

		books.stream()
				.forEach(p -> p.add(linkTo(methodOn(BookController.class).findById(p.getKey())).withSelfRel()));

		return books;
	}

	public BookVO findById(Long id) {
		logger.info("Finding one book...");

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));
		var vo = DozerMapper.parseObject(entity, BookVO.class);
		vo.add(linkTo(methodOn(BookController.class).findById(id)).withSelfRel());

		return vo;
	}

	public BookVO create(BookVO book) {
		logger.info("Creating one book...");

		if (book == null) {
			throw new RequiredObjectIsNullException();
		}

		var entity = DozerMapper.parseObject(book, Book.class);

		var vo = DozerMapper.parseObject(repository.save(entity), BookVO.class);

		vo.add(linkTo(methodOn(BookController.class).findById(vo.getKey())).withSelfRel());

		return vo;
	}

	public BookVO update(BookVO book) {
		logger.info("Updating one book...");
		
		if (book == null) {
			throw new RequiredObjectIsNullException();
		}

		var entity = repository.findById(book.getKey())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

		entity.setAuthor(book.getAuthor());
		entity.setLaunchDate(book.getLaunchDate());
		entity.setPrice(book.getPrice());
		entity.setTitle(book.getTitle());

		var vo = DozerMapper.parseObject(repository.save(entity), BookVO.class);

		vo.add(linkTo(methodOn(BookController.class).findById(vo.getKey())).withSelfRel());

		return vo;
	}

	public void delete(Long id) {
		logger.info("Deleting one book...");

		var entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID!"));

		repository.delete(entity);
	}
}
