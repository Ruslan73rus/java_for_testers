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

    @Test
    void cannotCreateTriangleWithNegativeSideA(){
        try {
            new Triangle(-5.0,5.0,5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
        }
    }

    @Test
    void cannotCreateTriangleWithNegativeSideB(){
        try {
            new Triangle(5.0,-5.0,5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
        }
    }

    @Test
    void cannotCreateTriangleWithNegativeSideC(){
        try {
            new Triangle(5.0,5.0,-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
        }
    }
    @Test
    void cannotCreateTriangleWithViolationOfIlnequalityAB(){
        try {
            new Triangle(1.0,1.0,3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
        }
    }

    @Test
    void cannotCreateTriangleWithViolationOfIlnequalityAC(){
        try {
            new Triangle(1.0,3.0,1.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
        }
    }

    @Test
    void cannotCreateTriangleWithViolationOfIInequalityBC(){
        try {
            new Triangle(3.0,1.0,1.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
        }
    }
    @Test
    void testEquality(){
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(3.0, 4.0, 5.0);
        Assertions.assertEquals(t1,t2);
    }

    @Test
    void testEquality2(){
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(4.0, 5.0, 3.0);
        Assertions.assertEquals(t1,t2);
    }

    @Test
    void testEquality3(){
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(5.0, 4.0, 3.0);
        Assertions.assertEquals(t1,t2);
    }
    @Test
    void testEquality4(){
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(4.0, 3.0, 5.0);
        Assertions.assertEquals(t1,t2);
    }
}
