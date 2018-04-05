package com.example.forloop;

import java.util.Scanner;

public class FloatingNumbe {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Input Number : ");
        double input = scanner.nextDouble();

        if (input > 0){
            if (input < 1){
                System.out.println("The Input Number is Positive Small Number");

            }
            else if (input > 10000){
                System.out.println("The Input Number is Positive Large Number");
            }
            else {
                System.out.println("The Input Number is Positive Number");
            }
        }
        else if (input < 0){
            double less = Math.abs(input);
            System.out.println(less);
            if (less< 1)
            {
                System.out.println();
                System.out.println("Negative small number");
            }
            else if (less> 1000000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else {
            System.out.println("The Number is Zero");
        }
    }
}
