package com.example.project;

public class Book{ //initialize variables
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    public Book(String title, String author, int year, String isbn, int quantity) { //constructor that initalizes the attributes
        this.title = title;
        this.author = author;
        yearPublished = year;
        this.isbn = isbn;
        this.quantity = quantity;
    }
    // get title
    public String getTitle() {
        return title;
    }
    // update title
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    // get author
    public String getAuthor() {
        return author;
    }
    // update author
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }
    // get year published
    public int getYearPublished() {
        return yearPublished;
    }
    // update year published
    public void setYearPublished(int newYear) {
        yearPublished = newYear;
    }
    // get isbn
    public String getIsbn() {
        return isbn;
    }
    // update isb
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }
    // get quantity
    public int getQuantity() {
        return quantity;
    }
    // update quantity
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    // returns author, title, year, isbn, and quantity in a single string.
    public String bookInfo() {
        String str = "";
        str += "Title: " + title + ", ";
        str += "Author: " + author + ", ";
        str += "Year: " + yearPublished + ", ";
        str += "ISBN: " + isbn + ", ";
        str += "Quantity: " + quantity;
        return str;
    }
}