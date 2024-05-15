package aptech.day7.homework;

import java.util.Scanner;

public class Square implements ShapeUtility{
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return a * 4;
    }
}
