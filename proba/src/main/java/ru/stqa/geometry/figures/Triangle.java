package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle (double side1, double side2, double side3){

//    private double side1; double side2; double side3;
//
//    public Triangle(double side1, double side2, double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }

    public static void printAreaTriangle(Triangle s) {
        String text = String.format("площадь треугольника со сторонами %f и %f и %f =%f", s.side1, s.side2, s.side3, s.area());
        System.out.println(text);
    }

//    public static double area(double a, double b, double c) {
//        return sqrt(((a + b + c) / 2) * (((a + b + c) / 2) - a) * (((a + b + c) / 2) - b) * (((a + b + c) / 2) - c));
//    }

//    public static double perimetr(double a, double b, double c) {
//        return a + b + c;
//    }

    public double area() {
        return sqrt(((this.side1 + this.side2 + this.side3) / 2) * (((this.side1 + this.side2 + this.side3) / 2) - this.side1) * (((this.side1 + this.side2 + this.side3) / 2) - this.side2) * (((this.side1 + this.side2 + this.side3) / 2) - this.side3));

    }

    public double perimetr() {
        return this.side1 + this.side2 + this.side3;
    }
//
//    public static void printPerimetrTriangle(double a, double b, double c){
//       var text = String.format("периметр треугольника со сторонами %f и %f и %f =%f", a, b, c, perimetrTriangle(a, b, c));
//        System.out.println(text);
//    }
//
//    private static double perimetrTriangle(double a, double b, double c) {
//        return a + b + c;
//    }
}

