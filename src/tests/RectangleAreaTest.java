package tests;

import org.junit.jupiter.api.Test;
import shapeAreaCalculator.RectangleArea;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleAreaTest {
    RectangleArea rectangleObj;

    public RectangleAreaTest(){
        this.rectangleObj = new RectangleArea();
    }

    @Test
    void getterSetterTests(){
        this.rectangleObj.setWidth(100);
        this.rectangleObj.setLength(200);
        assertEquals(100, this.rectangleObj.getWideEdge());
        assertEquals(200, this.rectangleObj.getLongEdge());
    }

    @Test
    void simpleRectangleCalculationTest(){
        this.rectangleObj.setLength(10);
        this.rectangleObj.setWidth(10);
        assertEquals(100, this.rectangleObj.calculatedArea());
        this.rectangleObj.setLength(20);
        this.rectangleObj.setWidth(100);
        assertEquals(2000, this.rectangleObj.calculatedArea());
    }

}