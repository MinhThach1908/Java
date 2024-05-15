package aptech.day7.homework;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        createMenu();
    }

    private static void createMenu() {
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
            scanner.nextLine();
            ShapeUtility shapeUtility = null;
            switch (choice) {
                case 1:
                    // Square
                    shapeUtility = new Square();
                    break;
                case 2:
                    // Rectangle
                    shapeUtility = new Rectangle();
                    break;
                case 3:
                    // Triangle
                    shapeUtility = new Triangle();
                    break;
                case 4:
                    // Circle
                    shapeUtility = new Circle();
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
            if (choice == 5) {
                break;
            }
            if(shapeUtility != null) {
                shapeUtility.inputData();
                double Area = shapeUtility.calculateArea();
                double Perimeter = shapeUtility.calculatePerimeter();
                System.out.printf("The Area of the Square is: %.2f\n", Area);
                System.out.printf("The Perimeter of the Square is: %.2f\n", Perimeter);
                System.out.println("Press Enter to continue");
                scanner.nextLine();
            }
        }
    }
}
