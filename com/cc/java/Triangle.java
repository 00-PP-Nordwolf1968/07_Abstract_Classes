package com.cc.java;

public class Triangle extends Shape {
    
    private double basline, hight;

    public Triangle(double basline, double hight) {
        this.basline = basline;
        this.hight = hight;
    }

    @Override
    public double area() {
        // return Math.PI * radius * radius;
        return basline * hight;
}
}