package aptech.day7.homework;

import java.util.Scanner;

public class Circle implements ShapeUtility{
    private double radius;

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        this.radius = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
