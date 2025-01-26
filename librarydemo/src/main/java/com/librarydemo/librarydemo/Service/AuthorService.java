package com.librarydemo.librarydemo.Service;

import com.librarydemo.librarydemo.Model.Author;
import com.librarydemo.librarydemo.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    // Метод для получения всех авторов
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    // Метод для поиска автора по ID
    public Optional<Author> findAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    // Метод для сохранения автора
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    // Метод для удаления автора по ID
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
