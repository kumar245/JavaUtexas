package com.example.forloop;

import java.util.Scanner;

public class CubeOfANumber {

    public static void main(String[] args) {
        int i,n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Input Number : ");
         n= scanner.nextInt();
        for ( i =1;i <=n ;i++){
            System.out.println("Number is :  " + i + " and " + i + "of cube is : " + (i*i*i));
        }

    }
}
