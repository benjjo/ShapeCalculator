package shapeAreaCalculator;

public class PrintAreaToScreen {
    CalculateArea calculateArea;

    public PrintAreaToScreen(CalculateArea calculateArea){
        this.calculateArea = calculateArea;
    }

    public double getAreaSafely(){
        try {return this.calculateArea.callTheCorrectShapeAreaCalculator();}
        catch (RuntimeException e){
            throw new IllegalArgumentException("Please enter a valid menu option.");
        }
    }

    public void printAreaToScreen(){
        System.out.println("The area of your " +
                ShapeManager.getShapeType() + " is: " +
                this.getAreaSafely());
    }
}
