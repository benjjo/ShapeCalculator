package shapeAreaCalculator;


public class CalculateArea {
    UserIn userInput;
    private String shapeType;

    public CalculateArea(){
        userInput = new UserIn();
    }

    public void setShapeType(String shape){
        this.shapeType = shape;
    }

    public String getShapeType(){
        return this.shapeType;
    }

    public double calculateAreaFromShapeType(){
        return switch(this.getShapeType()){
            case "Square" -> this.squareArea();
            case "Rectangle" -> this.rectangleArea();
            case "Circle" -> this.circleArea();
            default -> -1;
        };
    }

    public double squareArea(){
        SquareArea squareArea = new SquareArea();
        squareArea.setLength(userInput.getSquareEdgeFromUser());
        return squareArea.calculatedArea();
    }

    public double rectangleArea(){
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.setWidth(userInput.getRectangleWidthFromUser());
        rectangleArea.setLength((int) userInput.getRectangleLengthFromUser());
        return rectangleArea.calculatedArea();
    }

    public double circleArea(){
        Circle circleArea = new Circle();
        circleArea.setRadius(userInput.getRadiusFromUser());
        return circleArea.calculatedArea();
    }
}
