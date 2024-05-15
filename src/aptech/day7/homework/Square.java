package aptech.day7.homework;

import java.util.Scanner;

public class Square implements ShapeUtility{
    private double side;

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        this.side = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return side * 4;
    }
}
