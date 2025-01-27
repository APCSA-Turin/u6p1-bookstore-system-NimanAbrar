package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    private static String currentId = "99"; //initialize variables
    public IdGenerate() {} //empty constructor

    // public  getCurrentId(){}
    public static String getCurrentId() { //getter methods
        return currentId; 
    }
    public static void reset() { //resets id to 99
        currentId = "99";
    }
    public static void generateID() { //converts the string to an integer and then increments it by one. convert back to string
        int generate = Integer.parseInt(currentId);
        generate++;
        currentId = "" + generate;
    }
}