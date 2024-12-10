package com.sparta.jpaquiz;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/category")
    public String addCategoryWithBooks(@RequestParam String categoryName, String bookTitle1, String bookTitle2) {
        libraryService.addCategoryWithBooks(categoryName, bookTitle1, bookTitle2);
        return "Category and Books created successfully!";
    }
}
