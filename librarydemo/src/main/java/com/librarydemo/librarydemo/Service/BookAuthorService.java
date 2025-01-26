package com.librarydemo.librarydemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.librarydemo.librarydemo.Repository.BookAuthorRepository;
import com.librarydemo.librarydemo.Model.BookAuthor;
import com.librarydemo.librarydemo.Model.BookAuthorId;


import java.util.List;
import java.util.Optional;

@Service
public class BookAuthorService {
    @Autowired
    private BookAuthorRepository bookAuthorRepository;

    public List<BookAuthor> getAllBookAuthors() {
        return bookAuthorRepository.findAll();
    }

    public Optional<BookAuthor> getBookAuthorById(Long bookId, Long authorId) {
        return bookAuthorRepository.findById(new BookAuthorId(bookId, authorId));
    }

    public BookAuthor saveBookAuthor(BookAuthor bookAuthor) {
        return bookAuthorRepository.save(bookAuthor);
    }

    public void deleteBookAuthor(Long bookId, Long authorId) {
        bookAuthorRepository.deleteById(new BookAuthorId(bookId, authorId));
    }
}
