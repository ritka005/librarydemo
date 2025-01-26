package com.librarydemo.librarydemo.Model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    @SequenceGenerator(name = "book_seq", sequenceName = "book_seq", allocationSize = 1)
    private Long idbook;
    private String name;
    private Integer yearofpublication;
    private String publisher;
    private String genre;
    private Integer numberofcopies;
    private Boolean availability;

    @OneToMany(mappedBy = "book")
    private Set<BookAuthor> bookAuthors;

    // Геттеры и сеттеры
    public Long getIdBook() {
        return idbook;
    }

    public void setIdBook(Long idBook) {
        this.idbook = idBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearOfPublication() {
        return yearofpublication;
    }

    public void setYearOfPublication(Integer yearofpublication) {
        this.yearofpublication = yearofpublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNumberOfCopies() {
        return numberofcopies;
    }

    public void setNumberOfCopies(Integer numberofcopies) {
        this.numberofcopies = numberofcopies;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public Set<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(Set<BookAuthor> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }
}