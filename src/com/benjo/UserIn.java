package com.benjo;
import java.util.Scanner;

public class UserIn {
    private final Scanner userInput;
    private String userStringInput;

    public UserIn(){
        userInput = new Scanner(System.in);
    }

    public void setUserStringInput(Scanner scannerIn){
        this.userStringInput = String.valueOf(scannerIn);
    }

    public String getUserStringInput(){
        return this.userStringInput;
    }

    public int getShapeIDFromUser() {
        System.out.print("> ");
        try{return Integer.parseInt(this.userInput.nextLine());}
        catch (NumberFormatException e) {
            System.out.println("Please enter a number. Aborting.");
            System.exit(-1);
        }
        return -1; // Will we ever get here?
    }

    public int getSquareEdgeFromUser(){
        System.out.println("You've selected a square, what is the length of the edge?");
        System.out.print("> ");
        return Integer.parseInt(userInput.nextLine());
    }

    public double getRectangleLengthFromUser(){
        System.out.println("What is the length of your rectangle?");
        System.out.print("> ");
        return Integer.parseInt(userInput.nextLine());
    }

    public double getRectangleWidthFromUser(){
        System.out.println("What is the width of your rectangle?");
        System.out.print("> ");
        return Integer.parseInt(userInput.nextLine());
    }

    public double getRadiusFromUser(){
        System.out.println("What is the radius of your circle?");
        System.out.print("> ");
        return Integer.parseInt(userInput.nextLine());
    }
}
