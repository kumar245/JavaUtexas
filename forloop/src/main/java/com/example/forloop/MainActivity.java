package com.example.forloop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args) {
        printStars();
    }

    static void printStars() {

        int i,j,k;
      for (i=1;i<=7;i++){
          for (j=1;j<=i;j++)
              System.out.println(j);
          for (k=7-i;k>=1;k--)
              System.out.println("*");
          System.out.println(" ");
      }
    }
}
