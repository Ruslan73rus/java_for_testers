package ru.stqa.geometry.figures;

public record Triangle (
    double aSide,
    double bSide,
    double cSide)
{

    public Triangle {
        if (aSide < 0 || bSide < 0 || cSide < 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        if (aSide + bSide < cSide || aSide + cSide < bSide || cSide + bSide < aSide) {
            throw new IllegalArgumentException("Triangle should not be with violation of ilnequality");
        }
    }
    public static void printTrianglePerimeter(Triangle x) {
        String text = String.format("Периметр треугольника со сторонами %f + %f + %f = %f", x.aSide, x.bSide, x.cSide, x.perimeter());
        System.out.println(text);
    }
    public double perimeter() {
        return this.aSide + this.bSide + this.cSide;
    }
    public static void printTriangleArea(Triangle x) {
        String text = String.format("Площадь треугольникп со сторонами %f + %f + %f = %f",  x.aSide, x.bSide, x.cSide, x.area());
        System.out.println(text);
    }
    public double area()
    {double p = (this.perimeter()) / 2;
        return Math.sqrt(p * (p - this.aSide) * (p - this.bSide) * (p - this.cSide)); }
    }