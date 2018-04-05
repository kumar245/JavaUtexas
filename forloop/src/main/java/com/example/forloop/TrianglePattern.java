package com.example.forloop;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        int i,j,n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Input Number : ");
        n=scanner.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println("");
        }

    }
}
