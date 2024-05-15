package aptech.day7.homework;

import java.util.Scanner;

public class Rectangle implements ShapeUtility{
    private double length;
    private double width;

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        this.length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        this.width = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        if (length <= width) {
            System.out.println("The length cannot smaller than the width");
        } else {
            return length * width;
        }
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        if (length <= width) {
            System.out.println("The length cannot smaller than the width");
        } else {
            return (length + width) * 2;
        }
        return 0;
    }
}
