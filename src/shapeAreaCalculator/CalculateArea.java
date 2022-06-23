package shapeAreaCalculator;


public class CalculateArea {
    private String shapeType;
    UserIn userInput;

    public CalculateArea(UserIn userIn){
        userInput = userIn;
    }

    public void setShapeType(String shape){
        this.shapeType = shape;
    }

    public String getShapeType(){
        return this.shapeType;
    }

    public double callTheCorrectShapeAreaCalculator() {
        return switch (ShapeManager.getShapeType()) {
            case "Square" -> this.squareArea();
            case "Rectangle" -> this.rectangleArea();
            case "Circle" -> this.circleArea();
            default -> -1;
        };
    }

    public double squareArea(){
        SquareArea squareArea = new SquareArea();
        squareArea.setLength(this.userInput.getSquareEdgeFromUser());
        return squareArea.calculatedArea();
    }

    public double rectangleArea(){
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.setWidth(this.userInput.getRectangleWidthFromUser());
        rectangleArea.setLength((int) this.userInput.getRectangleLengthFromUser());
        return rectangleArea.calculatedArea();
    }

    public double circleArea(){
        Circle circleArea = new Circle();
        circleArea.setRadius(this.userInput.getRadiusFromUser());
        return circleArea.calculatedArea();
    }

}
