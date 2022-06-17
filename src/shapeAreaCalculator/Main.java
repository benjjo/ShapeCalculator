package shapeAreaCalculator;


public class Main {
    private double shapeArea;
    GetAndSetShapeTypeFromUser getShapeTypeFromUser;
    private final String shapeType;
    CalculateArea shapeCalculator;

    public Main() {
        getShapeTypeFromUser = new GetAndSetShapeTypeFromUser();
        getShapeTypeFromUser.getInformationFromUser();
        this.shapeType = getShapeTypeFromUser.getShapeType();
        shapeCalculator = new CalculateArea();
    }

    public double getShapeArea(){
        return this.shapeArea;
    }

    public void setShapeArea(double area){
        this.shapeArea = area;
    }

    private String getShapeType() {
        return this.shapeType;
    }

    public static void main(String[] args) {
        Main mainCall = new Main();
        mainCall.shapeCalculator.setShapeType(mainCall.getShapeTypeFromUser.getShapeType());
        mainCall.setShapeArea(mainCall.shapeCalculator.calculateAreaFromShapeType());
        System.out.println("The area of your " + mainCall.getShapeType() + " is: " + mainCall.getShapeArea());
    }
}