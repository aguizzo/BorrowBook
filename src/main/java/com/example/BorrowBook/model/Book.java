package com.example.BorrowBook.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    String id;
    String name;

    @JsonIgnore
    @JoinTable(name = "borrow_book",
            joinColumns = {@JoinColumn(name = "BOOK_FK")},
            inverseJoinColumns = {@JoinColumn(name = "USER_LIBRARY_FK")})
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<UserLibrary> users = new ArrayList<>();

    public Book( String id, String name) {
        this.name = name;
        this.id = id;
    }
}
