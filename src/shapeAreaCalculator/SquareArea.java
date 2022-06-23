package shapeAreaCalculator;

public class SquareArea extends Shape implements StraightShape{
    protected int length;

    public void setLength(int sideLength){
        this.length = sideLength;
    }

    public int getLength(){
        return this.length;
    }

    public double calculatedArea(){
        return this.getLength() * this.getLength();
    }
}
