package com.example.BorrowBook.repository;

import com.example.BorrowBook.model.UserLibrary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLibraryRepository extends JpaRepository<UserLibrary, String> {
}
