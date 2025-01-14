package com.librarydemo.librarydemo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "BookAuthor")

public class BookAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "book_author_seq", sequenceName = "book_author_sequence", allocationSize = 1)
    private Long idbookauthor;

    @ManyToOne
    @JoinColumn(name = "idBook")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "idAuthor")
    private Author author;

    // Геттеры и сеттеры
    public Long getIdBookAuthor() {
        return idbookauthor;
    }

    public void setIdBookAuthor(Long idBookAuthor) {
        this.idbookauthor = idBookAuthor;
    }

    // Остальные геттеры и сеттеры
}