package aptech.day7.homework;

import java.util.Scanner;

public class Triangle implements ShapeUtility{
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();
    double z = scanner.nextDouble();

    @Override
    public double calculateArea() {
        double perimeter = x + y + z;
        return perimeter * (perimeter - x) * (perimeter - y) * (perimeter - z);
    }

    @Override
    public double calculatePerimeter() {
        return x + y + z;
    }
}
