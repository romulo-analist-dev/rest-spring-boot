package com.romulo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romulo.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
