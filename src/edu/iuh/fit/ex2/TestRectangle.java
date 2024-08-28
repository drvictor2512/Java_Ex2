package edu.iuh.fit.ex2;

/**
 * The TestRectangle class contains the main method to test the functionalities
 * of the Rectangle class. It creates an instance of Rectangle,
 * calculates the area and perimeter, and prints them to the console.
 * @author Trần Văn Thắng
 * @version 1.0
 * @since 2024-08-27
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r2 = new Rectangle(20, 10);
        System.out.println("Dien tich la: " + r2.getArea());
        System.out.println("Chu vi la: " + r2.getPerimeter());

    }
}
