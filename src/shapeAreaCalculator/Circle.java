package shapeAreaCalculator;

public class Circle extends Shape{
    private double rad;

    public void setRadius(double radLength){
        this.rad = radLength;
    }

    public double getRad(){
        return this.rad;
    }

    public double calculatedArea(){
        return java.lang.Math.pow(this.getRad(),2) * java.lang.Math.PI;
    }
}
