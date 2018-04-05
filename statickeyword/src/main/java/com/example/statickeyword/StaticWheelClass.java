package com.example.statickeyword;

public class StaticWheelClass {
    private static int factoryID=123;
    private String stringName="Chaitanya";

    public void Wheel(){
        System.out.println("We can use both non static and static in non static method ");
        System.out.println("This is non static Class String : " + stringName);
        System.out.println("This is non static Class Integer :" + factoryID);
    }
    public static void Part(){
        System.out.println("This is Static Class String : " + " We can not use non static variable in static method" );
        System.out.println("This is Static Class Integer : " + factoryID);
    }
}
class Apps{
    public static void main(String[] args) {
        StaticWheelClass.Part();
        StaticWheelClass wheelClass = new StaticWheelClass();
        wheelClass.Wheel();
    }
}
