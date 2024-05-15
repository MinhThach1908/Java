package aptech.day7.homework;

import java.util.Scanner;

public class Rectangle implements ShapeUtility{
    Scanner scanner = new Scanner(System.in);
    double length = scanner.nextDouble();
    double width = scanner.nextDouble();

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return (length + width) * 2;
    }
}
