package shapeAreaCalculator;


public class GetAndSetShapeTypeFromUser extends ShapeManager{
    UserIn userInput;
    Menu menu;

    public GetAndSetShapeTypeFromUser(UserIn UserInObj, Menu menu){
        this.userInput = UserInObj;
        this.menu = menu;
    }

    public void setShapeTypeFromUser() {
        ShapeManager.setShapeID(this.userInput.getSelectionFromUser());
    }

    public void printOutTheOptions(){
        this.menu.printMenuToScreen();
    }

    public void getInformationFromUser(){
        this.printOutTheOptions();
        this.setShapeTypeFromUser();
    }
}
