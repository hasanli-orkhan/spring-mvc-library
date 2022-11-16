package com.example.libraryproject;

import com.example.libraryproject.model.Book;
import com.example.libraryproject.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class LibraryProjectApplication {
    private final BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(LibraryProjectApplication.class, args);
    }

    CommandLineRunner runner = new CommandLineRunner() {
        @Override
        public void run(String... args) throws Exception {
            Book book1 = new Book();

        }
    };
}
