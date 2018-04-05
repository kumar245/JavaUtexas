package com.example.statickeyword;

public class CallingMethodInSameClass {
    public static void main(String[] args) {
        printOne();
        printTwo();

    }
    private static void printOne(){
        System.out.println("Hello World");
    }
    private static void printTwo(){
        printOne();
        printOne();
    }
}
