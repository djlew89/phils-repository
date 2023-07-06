package com.philslibrary.POJOS;

import jakarta.persistence.*;

/**
 * @Author Dan Lewis
 * @Date 2023-07-06
 * Descriptive class for a Book Object
 */
@Entity(name = "book")
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String edition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Enumerated(EnumType.ORDINAL)
    private Book.BookType bookType;

    public enum BookType
        {
            MANGA,
            COMIC,
            NOVEL
        }
}
