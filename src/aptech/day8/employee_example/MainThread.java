package aptech.day8.employee_example;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        createProgram();
    }

    private static void createProgram() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter employee's id: ");
            int id = scanner.nextInt();
            System.out.println("Enter employee's name: ");
            String name = scanner.nextLine();
            System.out.println("Enter employee's address: ");
            String address = scanner.nextLine();
            System.out.println("Enter employee's phone: ");
            String phone = scanner.nextLine();
            System.out.println("Enter employee's email: ");
            String email = scanner.nextLine();
            System.out.println("Please choose employee type: ");
            System.out.println("=================================");
            System.out.println("1. Partime Employee");
            System.out.println("2. Fulltime Employee");
            System.out.println("0. Exit");
            System.out.println("=================================");
            System.out.println("Please choose from 0 to 2");
            int choice = scanner.nextInt();
            scanner.nextLine();
            SalaryCalculator salaryCalculator = null;
            switch (choice) {
                case 1:
                    salaryCalculator = new PartimeEmployee();
                    break;
                case 2:
                    salaryCalculator = new FulltimeEmployee();
                    break;
            }
            if(choice == 0){
                break;
            }
            if (salaryCalculator != null){
                salaryCalculator.inputData();
                double result = salaryCalculator.calculateSalary();
                System.out.println("The Salary of this Employee is: ");
                System.out.println("Enter to continue");
                scanner.nextLine();
            }
        }
    }
}
