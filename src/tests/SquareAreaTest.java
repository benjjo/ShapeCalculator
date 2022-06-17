package tests;

import org.junit.jupiter.api.Test;
import shapeAreaCalculator.SquareArea;

import static org.junit.jupiter.api.Assertions.*;

public class SquareAreaTest {
    SquareArea squareObj;

    public SquareAreaTest(){
        this.squareObj = new SquareArea();
    }

    @Test
    void setterGetterTests(){
        this.squareObj.setLength(10);
        assertEquals(10, this.squareObj.getLength());
    }

    @Test
    void simpleSquareCalculationTests(){
        this.squareObj.setLength(10);
        assertEquals(100, this.squareObj.calculatedArea());
        this.squareObj.setLength(100);
        assertEquals(10000, this.squareObj.calculatedArea());
    }

}