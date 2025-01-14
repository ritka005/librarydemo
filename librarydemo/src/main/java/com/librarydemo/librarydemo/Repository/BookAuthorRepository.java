package com.librarydemo.librarydemo.Repository;

import com.librarydemo.librarydemo.Model.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {

}