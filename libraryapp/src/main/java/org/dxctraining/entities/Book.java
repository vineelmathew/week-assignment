package org.dxctraining.entities;

public class Book {
    private String id;
    private String name;
    private int pages;
    private Author author;
    private double cost;

    private boolean rented;


    public Book(String name, int pages, double cost,Author author) {
        this.name = name;
        this.pages = pages;
        this.cost = cost;
        this.author=author;
    }
    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
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
