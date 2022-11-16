package com.example.libraryproject.controller;

import com.example.libraryproject.model.Book;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String home(Model model) {
        model.addAttribute("book", new Book());
        return "index";
    }
}
