package aptech.day7.homework;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Choosing Shape to calculate
            System.out.println("Shape Calculating Program");
            System.out.println("===============================");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Exit");
            System.out.println("===============================");
            System.out.println("Please choose an option from 1 to 5");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Square
                    System.out.println("Please enter a side of the square: ");
                    ShapeUtility square = new Square();
                    double square_area = square.calculateArea();
                    double square_perimeter = square.calculatePerimeter();
                    System.out.printf("The Area of the Square is: %.2f\n", square_area);
                    System.out.printf("The Perimeter of the Square is: %.2f\n", square_perimeter);
                    break;
                case 2:
                    // Rectangle
                    System.out.println("Please enter the length and the width of the rectangle: ");
                    ShapeUtility rectangle = new Rectangle();
                    double rectangle_area = rectangle.calculateArea();
                    double rectangle_perimeter = rectangle.calculatePerimeter();
                    System.out.printf("The Area of the Rectangle is: %.2f\n", rectangle_area);
                    System.out.printf("The Perimeter of the Rectangle is: %.2f\n", rectangle_perimeter);
                    break;
                case 3:
                    // Triangle
                    System.out.println("Please enter 3 sides of the triangle: ");
                    ShapeUtility triangle = new Triangle();
                    double triangle_area = triangle.calculateArea();
                    double triangle_perimeter = triangle.calculatePerimeter();
                    System.out.printf("The Area of the Triangle is: %.2f\n", triangle_area);
                    System.out.printf("The Perimeter of the Triangle is: %.2f\n", triangle_perimeter);
                    break;
                case 4:
                    // Circle
                    System.out.println("Please enter the radius of the circle: ");
                    ShapeUtility circle = new Circle();
                    double circle_area = circle.calculateArea();
                    double circle_perimeter = circle.calculatePerimeter();
                    System.out.printf("The Area of the Circle is: %.2f\n", circle_area);
                    System.out.printf("The Perimeter of the Circle is: %.2f\n", circle_perimeter);
                    break;
                case 5:
                    // Exit
                    System.out.println("Thank you for using our program, goodbye!");
                    break;
                default:
                    // Error
                    System.out.println("Please choose from 1 to 5");
                    break;
            }
            if (choice == 5){
                // Ending Program
                break;
            }
        }
    }
}
