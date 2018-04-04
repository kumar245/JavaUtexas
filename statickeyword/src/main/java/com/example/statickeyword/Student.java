package com.example.statickeyword;

public class Student {
int a;
static int b;

     Student() {
        b++;
    }

public void displayShow(){
    System.out.println("Value of a = " + a);
    System.out.println("Value of a = " + b);

}

}
