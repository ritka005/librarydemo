package com.librarydemo.librarydemo.Repository;

import com.librarydemo.librarydemo.Model.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.librarydemo.librarydemo.Model.BookAuthorId;

@Repository
public interface BookAuthorRepository extends JpaRepository<BookAuthor, BookAuthorId> {
}