package aptech.day8.employee_example;

import java.util.Scanner;

public class PartimeEmployee extends Employee implements SalaryCalculator{
    private double salaryPerHour;
    private long workingHour;

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public long getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(long workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee's salary rate (per hour): ");
        this.salaryPerHour = scanner.nextDouble();
        System.out.println("Enter employee's working hour: ");
        this.workingHour = scanner.nextLong();
    }

    @Override
    public double calculateSalary() {
        return salaryPerHour * workingHour;
    }
}
