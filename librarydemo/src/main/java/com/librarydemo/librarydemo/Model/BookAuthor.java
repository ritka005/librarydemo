package com.librarydemo.librarydemo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "BookAuthor")
public class BookAuthor {

    @EmbeddedId
    private BookAuthorId id;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "idBook", nullable = false)
    private Book book;

    @ManyToOne
    @MapsId("authorId")
    @JoinColumn(name = "idAuthor", nullable = false)
    private Author author;

    // Геттеры и сеттеры (если нужно)
}