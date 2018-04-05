package com.example.statickeyword;

public class StaticCarParts {

    public StaticCarParts(){
        System.out.println("Car Object are Created");
    }

    public static class Wheel{
        public Wheel() {
            System.out.println("Wheel Object are Created ");
        }
    }


}
class App{
    public static void main(String[] args) {
StaticCarParts staticCarParts=new StaticCarParts();
StaticCarParts.Wheel wheel= new StaticCarParts.Wheel();
    }
}
