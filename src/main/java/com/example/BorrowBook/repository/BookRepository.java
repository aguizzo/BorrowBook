package com.example.BorrowBook.repository;

import com.example.BorrowBook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
