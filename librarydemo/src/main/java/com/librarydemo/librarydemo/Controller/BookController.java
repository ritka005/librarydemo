package com.librarydemo.librarydemo.Controller;

import com.librarydemo.librarydemo.Model.Book;
import com.librarydemo.librarydemo.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Optional;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired

    private LibraryService libraryService;

    @GetMapping("")
    public String listBooks(Model model) {
        model.addAttribute("books", libraryService.findAllBooks());
        return "list";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute Book book) {
        libraryService.saveBook(book);
        return "redirect:/books";
    }

//    @GetMapping("/add")
//    public String showAddForm(Model model) {
//        model.addAttribute("book", new Book());
//        return "add";
//    }

//    @GetMapping("/edit/{id}")
//    public String showEditForm(@PathVariable Long id, Model model) {
//        Optional<Book> book = libraryService.findBookById(id);
//        if (book.isPresent()) {
//            model.addAttribute("book", book.get());
//            return "edit";
//        }
//        return "redirect:/books";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String editBook(@PathVariable Long id, @ModelAttribute Book book) {
//        book.setIdBook(id);
//        libraryService.saveBook(book);
//        return "redirect:/books";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteBook(@PathVariable Long id) {
//        libraryService.deleteBook(id);
//        return "redirect:/books";
//    }
}