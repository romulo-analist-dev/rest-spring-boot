package com.romulo.unittests.mapper.mocks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.romulo.data.vo.v1.BookVO;
import com.romulo.model.Book;

public class MockBook {
	
	public Book mockEntity() {
        return mockEntity(0);
    }
    
    public BookVO mockVO() {
        return mockVO(0);
    }
    
    public List<Book> mockEntityList() {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            books.add(mockEntity(i));
        }
        return books;
    }

    public List<BookVO> mockVOList() {
        List<BookVO> books = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            books.add(mockVO(i));
        }
        return books;
    }
    
    public Book mockEntity(Integer number) {
        Book book = new Book();
        book.setAuthor("Stephen Hawking" + number);
        book.setLaunchDate(LocalDate.now());
        book.setPrice(100.0 + number);
        book.setId(number.longValue());
        book.setTitle("A Brief History of Time" + number);
        return book;
    }

    public BookVO mockVO(Integer number) {
        BookVO book = new BookVO();
        book.setAuthor("Stephen Hawking" + number);
        book.setLaunchDate(LocalDate.now());
        book.setPrice(100.0 + number);
        book.setKey(number.longValue());
        book.setTitle("A Brief History of Time" + number);
        return book;
    }
}