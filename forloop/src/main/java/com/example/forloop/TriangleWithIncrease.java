package com.example.forloop;

import java.util.Scanner;

public class TriangleWithIncrease {
    public static void main(String[] args) {
        int i,j,n,k=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Input Number : ");
        n=scanner.nextInt();
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j++){
                System.out.print(k++);
            }
            System.out.println("");
        }
    }
}
