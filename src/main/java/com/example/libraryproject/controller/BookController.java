package com.example.libraryproject.controller;

import com.example.libraryproject.model.Book;
import com.example.libraryproject.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
@Controller
public class BookController {

    private final BookService bookService;

    @GetMapping
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        model.addAttribute("book", new Book());
        return "books";
    }

    @GetMapping("/byname")
    public Book findByName(String name) {
        return bookService.findByName(name);
    }

//    @GetMapping("/test-book")
//    public String getAllBook(Model model) {
//        List<Book> allBooks = bookService.getAllBooks();
//        model.addAttribute("books", allBooks);
//        return "index.html";
//    }
//
//    @PostMapping("/test-book")
//    public String postAllBook(@ModelAttribute Book book, Model model) {
//        List<Book> allBooks = bookService.getAllBooks();
//        model.addAttribute("books", allBooks);
//        return "index.html";
//    }
//
//    @GetMapping("/book-form")
//    public String bookForm(Model model) {
//        model.addAttribute("book", new Book());
//        return "index.html";
//    }

    @PostMapping("/add")
    public String bookPost(@ModelAttribute("book") Book book, BindingResult bindingResult) {
        bookService.createBook(book);
        return "redirect:/books";
    }

}
