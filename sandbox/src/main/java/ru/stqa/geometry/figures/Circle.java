package ru.stqa.geometry.figures;

public class Circle {
    public static void printCircle(double r) {
        String text = String.format("Площадь круга с радиусом %f = %f", r, Circle(r));
        System.out.println(text);
    }
    private static double Circle(double r) {
        return Math.PI * r * 2;
    }
    public static void main(String[] args) {
        Circle.printCircle (5.0);
    }
}