package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var t = new Triangle(5.0,5.0,5.0);
        double result = t.area();
        Assertions.assertEquals(10.825317547305483, result);
    }
    @Test
    void canCalculatePerimeter() {
        var t = new Triangle(5.0,5.0,5.0);
        double result = t.perimeter();
        Assertions.assertEquals(15, new Triangle( 5.0, 5.0, 5.0).perimeter());
    }
}