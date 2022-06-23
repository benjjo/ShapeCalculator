package shapeAreaCalculator;


public class Main {
    GetAndSetShapeTypeFromUser getShapeTypeFromUser;
    CalculateArea shapeCalculator;
    UserIn userInput;
    Menu menu;
    PrintAreaToScreen printArea;

    public Main() {
        this.userInput = new UserIn();
        this.shapeCalculator = new CalculateArea(this.userInput);
        this.printArea = new PrintAreaToScreen(shapeCalculator);
        this.menu = new Menu();
        this.getShapeTypeFromUser = new GetAndSetShapeTypeFromUser(this.userInput, this.menu);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.getShapeTypeFromUser.getInformationFromUser();
        main.printArea.printAreaToScreen();
    }
}