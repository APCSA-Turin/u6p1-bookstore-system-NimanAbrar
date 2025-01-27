package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[0];
    private User[] users = new User[10];
    //requires 1 empty constructor
    public BookStore() {}
    // public getUsers(){}
    public User[] getUsers() {
        return users;
    }
    // public setUsers(){}
    public void setUsers(User[] newUsers) {
        users = newUsers;
    }
    // public  getBooks(){}
    public Book[] getBooks() {
        return books;
    }
    // public void addUser(User user){} 
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return;
            }
        }
        consolidateUsers();
    }
    // public void removeUser(User user){}
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null;
                consolidateUsers();
                return;
            }
        }
    }
    // public void consolidateUsers(){}
    public void consolidateUsers() {
    int idx = 0;
    for (int i = 0; i < users.length; i++) {
        if (users[i] != null) {
            if (i != idx) {
                users[idx] = users[i];
                users[i] = null;
            }
            idx++;
        }
    }
    }
    // public void addBook(Book book){}
    public void addBook(Book book) {
       Book[] newBooks = new Book[books.length+1];
       for (int i = 0; i < books.length; i++) {
        newBooks[i] = books[i];
       }
       newBooks[books.length] = book;
       books = newBooks;
    }
    // public void insertBook(Book book, int index){}
    public void insertBook(Book book, int index) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        for (int i = index + 1; i < books.length + 1; i++) {
            newBooks[i] = books[i - 1];
        }
        newBooks[index] = book;
        books = newBooks;
    }

    // public void removeBook(Book book){}
       public void removeBook(Book book) {
            int bookIndex = 0;
            // a for loop is executed to find the index where the book to be removed is
            for (int i = 0; i < books.length; i++) {
                if (books[i] == book) {
                    bookIndex = i;
                }
            }
            // checking if the book to be removed has a quantity of one
            if (books[bookIndex].getQuantity() == 1) {
            // creating a new array with one less element than the original
                Book[] newBook = new Book[books.length - 1];
            // copying each book before the index to the new array utilizing a for loop
                for (int i = 0; i < bookIndex; i++) {
                    newBook[i] = books[i];
                }
            // copying each book after the index utilizing a for loop
                for (int i = bookIndex + 1; i < books.length; i++) {
                    newBook[i - 1] = books[i];
                }
            // setting the original array to the new array
                books = newBook;
            } else {
            // decreasing the books quantity by one because there are multiple
                books[bookIndex].setQuantity(books[bookIndex].getQuantity() - 1);
            }  
       }
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes
    public static void main(String[] args) {
    }
}