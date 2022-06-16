package com.benjo;


public class GetAndSetShapeTypeFromUser {
    private String shapeType;
    private int shapeID;
    UserIn userInput;

    public GetAndSetShapeTypeFromUser(){
        userInput = new UserIn();
    }

    public void setShapeTypeFromUser() {
        this.setShapeID(userInput.getShapeIDFromUser());
        this.setShapeType(this.convertMenuItemToString(this.shapeID));
    }

    public void setShapeID(int shapeID){
        this.shapeID = shapeID;
    }

    public void setShapeType(String shape){
        this.shapeType = shape;
    }

    public String convertMenuItemToString(int shapeID){
        return switch (shapeID) {
            case 1 -> "Square";
            case 2 -> "Rectangle";
            case 3 -> "Circle";
            default -> "Null";
        };
    }

    public String getShapeType(){ return this.shapeType; }

    public void printOutTheOptions(){
        System.out.println("""
                What shape would you like to select?
                    1. Square
                    2. Rectangle
                    3. Circle""");
    }

    public void getInformationFromUser(){
        this.printOutTheOptions();
        setShapeTypeFromUser();
    }
}
