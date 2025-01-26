package com.librarydemo.librarydemo.Controller;

import com.librarydemo.librarydemo.Service.LibraryService;
import jakarta.validation.Valid;
import com.librarydemo.librarydemo.Model.Author;
import com.librarydemo.librarydemo.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import java.util.Optional;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private LibraryService libraryService;

    // Метод для отображения списка авторов
    @GetMapping
    public String listAuthors(Model model) {
        model.addAttribute("authors", authorService.findAllAuthors());
        return "authors/list"; // Убедитесь, что эта строка соответствует вашему шаблону
    }

    // Метод для отображения формы добавления нового автора
    @GetMapping("/add")
    public String showAddAuthorForm(Model model) {
        model.addAttribute("author", new Author());
        return "authors/add"; // Убедитесь, что эта строка соответствует вашему шаблону
    }

    // Метод для сохранения нового автора
    @PostMapping("/add")
    public String createAuthor(@Valid @ModelAttribute Author author, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "books/add"; // Возвращаем к форме, если есть ошибки
        }
        authorService.saveAuthor(author);
        return "redirect:/authors"; // Переход к списку авторов после успешного сохранения
    }

//    // Метод для редактирования существующего автора
//    @GetMapping("/{id}/edit")
//    public String showEditAuthorForm(@PathVariable Long id, Model model) {
//        Optional<Author> authorOptional = authorService.findAuthorById(id);
//        if (authorOptional.isPresent()) {
//            model.addAttribute("author", authorOptional.get());
//            return "author/edit"; // Укажите название вашего шаблона для формы редактирования
//        }
//        return "redirect:/authors"; // Если автор не найден, перенаправляем на список
//    }
//
//    // Метод для обновления автора
//    @PostMapping("/{id}")
//    public String updateAuthor(@PathVariable Long id, @Valid @ModelAttribute Author author, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "author/edit"; // Возвращаем к форме, если есть ошибки
//        }
//        author.setIdAuthor(id); // Устанавливаем ID автора для обновления
//        authorService.saveAuthor(author);
//        return "redirect:/authors"; // Переход к списку авторов после успешного обновления
//    }
//
//    @PostMapping("/{id}/delete")
//    public String deleteAuthor(@PathVariable Long id) {
//        authorService.deleteAuthor(id);
//        return "redirect:/authors"; // Переход к списку авторов после удаления
//    }
}
