package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
       Rectangle rectangle = new Rectangle(10, 10);
       Triangle triangle = new Triangle(10, 10);
       Circle circle = new Circle(5, 0);

        output("------ Flächen ------");
         output("Fläche Rechteck: " + rectangle.area());
         output("Fläche Dreieck: " + triangle.area());
         output("Fläche Kreis: " + circle.area());

       rectangle.area();
    }

  

   


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

