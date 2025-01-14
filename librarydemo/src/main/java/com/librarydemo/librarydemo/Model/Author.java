package com.librarydemo.librarydemo.Model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Author")

public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "author_seq", sequenceName = "author_sequence", allocationSize = 1)
    private Long idauthor;

    private String fullName;
    private java.util.Date dateOfBirth;
    private String biography;

    @OneToMany(mappedBy = "author")
    private Set<BookAuthor> bookAuthors;

    // Геттеры и сеттеры
    public Long getIdAuthor() {
        return idauthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idauthor = idAuthor;
    }

    // Остальные геттеры и сеттеры
}