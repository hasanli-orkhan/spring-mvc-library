package com.example.libraryproject.controller;

import com.example.libraryproject.model.Author;
import com.example.libraryproject.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/authors")
@RequiredArgsConstructor
@Controller
public class AuthorController {
    private final AuthorService authorService;
    @GetMapping
    public String getAllAuthors(Model model) {
        List<Author> authors = authorService.getAllAuthors();
        model.addAttribute("authors", authors);
        return "index.html";
    }
}
