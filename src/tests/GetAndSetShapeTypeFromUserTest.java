package tests;

import org.junit.jupiter.api.Test;
import shapeAreaCalculator.GetAndSetShapeTypeFromUser;

import static org.junit.jupiter.api.Assertions.*;

public class GetAndSetShapeTypeFromUserTest {
    GetAndSetShapeTypeFromUser getAndSetObj;

    public GetAndSetShapeTypeFromUserTest(){
        this.getAndSetObj = new GetAndSetShapeTypeFromUser();
    }

    @Test
    void setAndGetShapeID() {
        this.getAndSetObj.setShapeID(10);
        assertEquals(10, this.getAndSetObj.getShapeID());
    }

    @Test
    void setAndGetShapeType() {
        this.getAndSetObj.setShapeType("Pentagon");
        assertEquals("Pentagon", this.getAndSetObj.getShapeType());
    }

    @Test
    void convertMenuItemToString() {
        assertEquals(this.getAndSetObj.convertMenuItemToString(1), "Square");
        assertEquals(this.getAndSetObj.convertMenuItemToString(2), "Rectangle");
        assertEquals(this.getAndSetObj.convertMenuItemToString(3), "Circle");
    }

    @Test
    void willThrowException_WhenBadMenuSelectionInput() {
        assertThrows(IllegalStateException.class,
                () -> this.getAndSetObj.convertMenuItemToString(4));
    }
}