package com.benjo;

public class RectangleArea extends SquareArea implements StraightShape{
    protected double width;

    public void setWidth(double wideLength){
        this.width = wideLength;
    }

    public double getWideEdge(){
        return this.width;
    }

    public double getLongEdge(){
        return this.length;
    }

    public double calculatedArea(){
        return this.getLongEdge() * this.getWideEdge();
    }
}
