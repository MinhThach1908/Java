package aptech.day7.homework;

import java.util.Scanner;

public class Triangle implements ShapeUtility{
    private double a;
    private double b;
    private double c;

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter edge 1 of the triangle: ");
        this.a = scanner.nextDouble();
        System.out.println("Enter edge 2 of the triangle: ");
        this.b = scanner.nextDouble();
        System.out.println("Enter edge 3 of the triangle: ");
        this.c = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Tht total of two edges must bigger than the other edge");
        } else {
            double s = calculatePerimeter() / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
            System.out.println("Tht total of two edges must bigger than the other edge");
        } else {
            return a + b + c;
        }
        return 0;
    }
}
