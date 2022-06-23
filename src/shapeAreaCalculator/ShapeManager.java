package shapeAreaCalculator;

import java.util.Map;
import java.util.TreeMap;

public class ShapeManager {
    public static final Map<Integer, String> SHAPE_LIST = new TreeMap<>();
    public static int shapeID;

    public ShapeManager(){
        ShapeManager.shapeID = 0;

        ShapeManager.SHAPE_LIST.put(1, "Square");
        ShapeManager.SHAPE_LIST.put(2, "Rectangle");
        ShapeManager.SHAPE_LIST.put(3, "Circle");

    }

    public static void setShapeID(int shapeID){
        ShapeManager.shapeID = shapeID;
    }

    public static int getShapeID(){
        return ShapeManager.shapeID;
    }

    public static String getShapeType() {
        return ShapeManager.SHAPE_LIST.get(ShapeManager.getShapeID());
    }
}
