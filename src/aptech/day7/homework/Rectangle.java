package aptech.day7.homework;

import java.util.Scanner;

public class Rectangle implements ShapeUtility{
    Scanner scanner = new Scanner(System.in);
    double length = scanner.nextDouble();
    double width = scanner.nextDouble();

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
