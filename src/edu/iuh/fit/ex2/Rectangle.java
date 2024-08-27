package edu.iuh.fit.ex2;

public class Rectangle {
    /**
      *
     **/
    private double length;
    private double width;
    //Constructor
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }
    public Rectangle(double length, double width) {
        if(length < 0 || width < 0)
            throw new IllegalArgumentException("Length and width must be greater than 0");
        this.length = length;
        this.width = width;
    }
    //Getter and Setter
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length < 0)
            throw new IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if(width < 0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }
    //Methods
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }
}
