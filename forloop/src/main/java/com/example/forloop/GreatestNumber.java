package com.example.forloop;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Number 2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter Number 3 : ");
        int number3 = scanner.nextInt();
        if (number1 > number2){
            if (number1 > number3){
                System.out.println("The greatest Number is : " + number1);
            }
        }
         if (number2>number1){
            if (number2>number3){
                System.out.println("The greatest Number is : " + number2);
            }
        }
         if (number3>number1){
            if (number3>number2){
                System.out.println("The greatest Number is : " + number3);
            }
        }

    }
}
