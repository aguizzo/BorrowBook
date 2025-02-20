package com.example.BorrowBook;


import com.example.BorrowBook.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.example.BorrowBook.repository.BookRepository;
import com.example.BorrowBook.repository.UserLibraryRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class BorrowBookTest {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserLibraryRepository userLibraryRepository;

    @Test
    public void shouldCreateBooks() {
        Book b1 = new Book("b1", "Design Patterns");
        Book b2 = new Book("b2", "Clean Code");

        bookRepository.save(b1);
        bookRepository.save(b2);

        assertThat(bookRepository.count()).isEqualTo(2);
    }

}
