package com.example.statickeyword;


//Hey... I am in static method...
//STATIC-STRING
//Hey i am in non-static method
//STATIC-STRING
//Name: Java2novice

public class MyStaticMethods {
    private String stringName;
    private static String msg = "STATIC-STRING";

    public MyStaticMethods(String stringName) {
        this.stringName = stringName;
    }

    public static void printMessage(){
        System.out.println("Hey... I am in static method...");
        System.out.println(msg);

    }
    public void displayMessage(){
        System.out.println("Hey i am in non-static method");
        System.out.println(msg);
        System.out.println("Name : " + this.stringName);
    }

    public static void main(String[] args) {
        MyStaticMethods.printMessage();
        MyStaticMethods nonstatic=new MyStaticMethods("Chaitanya Is Very Good");
        nonstatic.displayMessage();
    }
}
