package aptech.day8.employee_example;

import java.util.Scanner;

public class FulltimeEmployee extends Employee implements SalaryCalculator{
    private double salaryPerDay;
    private long workingDay;

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public long getWorkingDay() {
        return workingDay;
    }

    public void setWorkingDay(long workingDay) {
        this.workingDay = workingDay;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the employee's salary rate (per day): ");
        this.salaryPerDay = scanner.nextDouble();
        System.out.println("Enter the employee's working day: ");
        this.workingDay = scanner.nextLong();
    }

    @Override
    public double calculateSalary() {
        return salaryPerDay * workingDay;
    }
}
