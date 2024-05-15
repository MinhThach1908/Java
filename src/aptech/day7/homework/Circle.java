package aptech.day7.homework;

import java.util.Scanner;

public class Circle implements ShapeUtility{
    Scanner scanner = new Scanner(System.in);
    double r = scanner.nextDouble();

    @Override
    public double calculateArea() {
        return 2 * 3.14 * r;
    }

    @Override
    public double calculatePerimeter() {
        return r * r * 3.14;
    }
}
