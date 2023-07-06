package com.philslibrary;

import jakarta.persistence.*;

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String year;

    @Enumerated(EnumType.ORDINAL)
    private Movie.MovieType movieType;

    public enum MovieType
    {
        SCIFI,
        ANIME,
        HORROR,
        ACTION
    }

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
