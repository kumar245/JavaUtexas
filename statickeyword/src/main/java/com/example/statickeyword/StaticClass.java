package com.example.statickeyword;

public class StaticClass {
   private static String msg = "Chaitanya Is Very Good";

    public static class NestedInnerClass{
public void printMessage(){
    System.out.println("Static Inner Class : " + msg);
}
 }
 public class NonStaticClass{
        public void displayMessage(){
            System.out.println("NonStatic Inner Class : " + msg);
        }
 }

}

class Main{

    public static void main(String[] args) {
        StaticClass.NestedInnerClass outer = new StaticClass.NestedInnerClass();
        outer.printMessage();

        StaticClass.NonStaticClass inner = new StaticClass().new NonStaticClass();
       inner.displayMessage();

       StaticClass staticClass=new StaticClass();
       StaticClass.NonStaticClass nonStaticClass=staticClass.new NonStaticClass();
       nonStaticClass.displayMessage();
    }

}
