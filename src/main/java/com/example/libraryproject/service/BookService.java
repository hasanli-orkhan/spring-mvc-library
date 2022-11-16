package com.example.libraryproject.service;

import com.example.libraryproject.model.Book;
import com.example.libraryproject.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

//    public Book addBook(Book book) {
//        return bookRepository.save(book);
//    }

    public Book findByName(String name) {
        return bookRepository.findByName(name).orElseThrow(() -> {
            throw new RuntimeException(String.format("%s named book was not found", name));

        }
        );
    }

    public void createBook(Book book) {
        bookRepository.save(book);
    }
}
