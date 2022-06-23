package shapeAreaCalculator;
import java.util.Scanner;

public class UserIn {
    private final Scanner userInput;

    public UserIn(){
        this.userInput = new Scanner(System.in);
    }

    public int getSelectionFromUser() {
        System.out.print("> ");
        try{return Integer.parseInt(this.userInput.nextLine());}
        catch (RuntimeException e) {
            // We're trading one exception for another here. Thoughts?
            throw new IllegalArgumentException("Please enter a valid number.");
        }
    }

    public int getSquareEdgeFromUser(){
        System.out.println("You've selected a square, what is the length of the edge?");
        return this.getSelectionFromUser();
    }

    public double getRectangleLengthFromUser(){
        System.out.println("What is the length of your rectangle?");
        return this.getSelectionFromUser();
    }

    public double getRectangleWidthFromUser(){
        System.out.println("What is the width of your rectangle?");
        return this.getSelectionFromUser();
    }

    public double getRadiusFromUser(){
        System.out.println("What is the radius of your circle?");
        return this.getSelectionFromUser();
    }
}
