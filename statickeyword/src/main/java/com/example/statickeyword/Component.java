package com.example.statickeyword;

public class Component {
    private static String StringName = "Chaitanya";
    private int factoryID=12;

    public static class A{
        private void SinClass(){
            System.out.println("This is Static Class with nonStaticMethod : " + StringName);
            System.out.println("This is Static Class with nonStaticMethod : " + "We cannot use nonStatic Variable in Static Class");
        }
        private static void inClass(){
            System.out.println("This is Static Class with StaticMethod : " + StringName);
            System.out.println("This is Static Class with StaticMethod : " + "We cannot use nonStatic Variable in Static Class");
        }
    }
    public class B{
        private void SinClass1(){
            System.out.println("This is Static Class with nonStaticMethod : " + StringName);
            System.out.println("This is Static Class with nonStaticMethod : " + factoryID);
        }
    }
}
class C{
    public static void main(String[] args) {
        Component.A component = new Component.A();

    }
}
