package edu.iuh.fit.ex2;
/**
 * This Rectangle class represents a rectangle with a specified length and width.
 * It provides methods to calculate the area and perimeter of the rectangle,
 * and to get and set its dimensions.
 * @author Trần Văn Thắng
 * @version 1.0
 * @since 2024-08-27
 */
public class Rectangle {

    private double length;
    private double width;
    /**
     * Constructs a new  Rectangle with length and width initialized to 0.0.
     */
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }
    /**
        * Constructs a new Rectangle with the specified length and width.
        *
        * @param length the length of the rectangle
        * @param width the width of the rectangle
        * @throws IllegalArgumentException if length or width is less than 0
     */
    public Rectangle(double length, double width) {
        if(length < 0 || width < 0)
            throw new IllegalArgumentException("Length and width must be greater than 0");
        this.length = length;
        this.width = width;
    }
    /**
     * Returns the length of the rectangle.
     *
     * @return the length of the rectangle
     */
    public double getLength() {
        return length;
    }
    /**
     * Sets the length of the rectangle.
     *
     * @param length the new length of the rectangle
     * @throws IllegalArgumentException if length is less than 0
     */
    public void setLength(double length) {
        if(length < 0)
            throw new IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }
    /**
     * Returns the width of the rectangle.
     *
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }
    /**
     * Sets the width of the rectangle.
     *
     * @param width the new width of the rectangle
     * @throws IllegalArgumentException if width is less than 0
     */
    public void setWidth(double width) {
        if(width < 0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }
    /**
     * Returns the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    public double getArea() {
        return length * width;
    }
    /**
     * Returns the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return (length + width) * 2;
    }
}
