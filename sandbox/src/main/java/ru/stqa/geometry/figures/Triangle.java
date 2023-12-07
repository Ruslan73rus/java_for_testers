package ru.stqa.geometry.figures;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.aSide, triangle.aSide) == 0 && Double.compare(this.bSide, triangle.bSide) == 0 && Double.compare(this.cSide, triangle.cSide) == 0)
                || (Double.compare(this.bSide, triangle.aSide) == 0 && Double.compare(this.aSide, triangle.bSide) == 0 && Double.compare(this.cSide, triangle.cSide) == 0)
                || (Double.compare(this.cSide, triangle.aSide) == 0 && Double.compare(this.bSide, triangle.bSide) == 0 && Double.compare(this.aSide, triangle.cSide) == 0)
                || (Double.compare(this.aSide, triangle.aSide) == 0 && Double.compare(this.cSide, triangle.bSide) == 0 && Double.compare(this.bSide, triangle.cSide) == 0)
                || (Double.compare(this.bSide, triangle.aSide) == 0 && Double.compare(this.cSide, triangle.bSide) == 0 && Double.compare(this.aSide, triangle.cSide) == 0)
                || (Double.compare(this.cSide, triangle.aSide) == 0 && Double.compare(this.aSide, triangle.bSide) == 0 && Double.compare(this.bSide, triangle.cSide) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aSide, bSide, cSide);
    }
}