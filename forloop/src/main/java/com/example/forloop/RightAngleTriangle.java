package com.example.forloop;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        int i,j,n;
        System.out.println("Enter Input Number : ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++) {
                System.out.print(j);
            }
                System.out.println(" ");

        }
    }
}
