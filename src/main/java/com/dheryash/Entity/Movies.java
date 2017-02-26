package com.dheryash.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by dheryash on 22/02/2017.
 */
@Document(collection = "movies")
public class Movies {

    private String title;
    private double year;
    private String imdb;

    public Movies(){}
    public Movies(String title, double year, String imdb) {
        this.title = title;
        this.year = year;
        this.imdb = imdb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }
}
