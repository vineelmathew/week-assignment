package org.dxctraining.book.entities;

import org.dxctraining.author.entities.Author;

public class Book {
    private String id;
    private String name;
    private Author author;
    private double cost;

    private boolean rented;


    public Book(String name, double cost,Author author) {
        this.name = name;
        this.cost = cost;
        this.author=author;
    }
    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
