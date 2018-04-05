package com.example.forloop;

import java.util.Scanner;

public class NumberisPositive {
    public static void main(String[] args) {
        System.out.println("Enter Input Number : ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input > 0 ){
            System.out.println("Number is positive");
        }
        else if (input < 0){
            System.out.println("Number is Negative ");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
