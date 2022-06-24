package tests;

import org.junit.jupiter.api.Test;
import shapeAreaCalculator.CalculateArea;
import shapeAreaCalculator.UserIn;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAreaTest {
    private final CalculateArea calculateArea;

    public CalculateAreaTest(){
        UserIn userIn = new UserIn();
        this.calculateArea = new CalculateArea(userIn);
    }

    @Test
    void setAndGetShapeType() {
        this.calculateArea.setShapeType("Square");
        assertEquals("Square", this.calculateArea.getShapeType());
        this.calculateArea.setShapeType("Rhombus");
        assertNotEquals("Square", this.calculateArea.getShapeType());
    }

    @Test
    void callTheCorrectShapeAreaCalculator() {

    }

    @Test
    void squareArea() {

    }

    @Test
    void rectangleArea() {

    }

    @Test
    void circleArea() {

    }
}