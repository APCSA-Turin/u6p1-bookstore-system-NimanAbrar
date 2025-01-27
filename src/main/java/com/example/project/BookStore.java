package com.example.project;

public class BookStore{

    //initalize variables
    private Book[] books = new Book[0];
    private User[] users = new User[10];
    //requires 1 empty constructor
    public BookStore() {} //empty constructor
    public User[] getUsers() { //get users
        return users;
    }
    //update users
    public void setUsers(User[] newUsers) {
        users = newUsers;
    }
    //get books
    public Book[] getBooks() {
        return books;
    }
    //add a user by determining the first index with null and replace it with user
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return; //terminate loop
            }
        }
        consolidateUsers(); //consolidate users
    }
   //remove user by determining a match and replacing it with null
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null;
                consolidateUsers(); //consolidate
                return; //terminate loop
            }
        }
    }
    //places all elements together with no values of null in between
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
    public void addBook(Book book) {
       Book[] newBooks = new Book[books.length+1]; //copy all elements of books to another list with an extra empty value at the end
       for (int i = 0; i < books.length; i++) {
        newBooks[i] = books[i];
       }
       newBooks[books.length] = book; //last value = book
       books = newBooks; 
    }
    // public void insertBook(Book book, int index){}
    public void insertBook(Book book, int index) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];// copy all elements of books to new ist
        }
        for (int i = index + 1; i < books.length + 1; i++) {
            newBooks[i] = books[i - 1]; //increment index of elements by 1
        }
        newBooks[index] = book;
        books = newBooks;
    }
       public void removeBook(Book book) {
            int bookIndex = 0;
            for (int i = 0; i < books.length; i++) {
                if (books[i] == book) {
                    bookIndex = i; //determine index of book
                }
            }
            if (books[bookIndex].getQuantity() == 1) { //check if quantity = 1
                Book[] newBook = new Book[books.length - 1];
                for (int i = 0; i < bookIndex; i++) {
                    newBook[i] = books[i]; //copy values
                }
                for (int i = bookIndex + 1; i < books.length; i++) {
                    newBook[i - 1] = books[i]; //increment indices by 1
                }
                books = newBook;
            } else {
                books[bookIndex].setQuantity(books[bookIndex].getQuantity() - 1); //decrease quantity by 1 if quantity > 1
            }  
       }
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes
    public static void main(String[] args) {
    }
}