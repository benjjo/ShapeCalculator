package shapeAreaCalculator;

public class Menu {

    public void printMenuToScreen(){
        for (int menuItem : ShapeManager.SHAPE_LIST.keySet()){
            System.out.println(menuItem + ":\t" + ShapeManager.SHAPE_LIST.get(menuItem) );
        }
    }
}
