package tests;

import org.junit.jupiter.api.Test;
import shapeAreaCalculator.Circle;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    private final Circle circleObj;

    public CircleTest(){
        circleObj = new Circle();
    }

    @Test
    void getterSetterTests(){
        this.circleObj.setRadius(10);
        assertEquals(10, this.circleObj.getRad());
    }

    @Test
    void simpleRadiusCalculationTest(){
        this.circleObj.setRadius(10);
        assertEquals(314.1592653589793, this.circleObj.calculatedArea());
        this.circleObj.setRadius(100);
        assertEquals(31415.926535897932, this.circleObj.calculatedArea());
    }
}