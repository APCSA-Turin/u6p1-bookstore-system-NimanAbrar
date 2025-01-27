package com.example.project;

public class User{
    private String name; //initialize variables
    private String Id;
    private Book[] books = new Book[5];

    public User(String name, String Id) { //constructor that initializes the variables
        this.name = name;
        this.Id = Id;
    }
     //get name
    public String getName() {
        return name;
    }
    public void setName(String newName) { //update name
        name = newName;  
    }
    public String getId() { //get id
        return Id;
    }
    public void setId(String newId) { //update id
        Id = newId;
    }
    public Book[] getBooks() { //get books
        return books;
    }
    public void setBooks(Book[] newBooks) { //update books
        books = newBooks;
    }
    public String bookListInfo() { //prints book list and prints empty if element is null
        String info = "";
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                info += "empty\n";
            } else {
                info += books[i].bookInfo() + "\n";
            }
        }
        return info;
    }
    public String userInfo() { //get user info
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    }   
    public static void main(String[] args) {
        User user = new User("John", IdGenerate.getCurrentId());
        System.out.println(user.userInfo());
    }
}