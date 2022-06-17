package tests;

import org.junit.jupiter.api.Test;
import shapeAreaCalculator.CalculateArea;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateAreaTest {
    CalculateArea calculateArea;

    public CalculateAreaTest(){
        this.calculateArea = new CalculateArea();
    }

    @Test
    void setAndGetShapeType() {
        this.calculateArea.setShapeType("Rhombus");
        assertEquals("Rhombus", this.calculateArea.getShapeType());
    }

    @Test
    void calculateAreaFromShapeType_returnsCorrectShapeMethod() {
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