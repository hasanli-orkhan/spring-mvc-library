package com.example.libraryproject.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books" )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long bookID;

    private String name;

    private String genre;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "book_authors",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    protected List<Author> authors = new ArrayList<>();

    public void addAuthor(Author author) {
        authors.add(author);
    }
}
