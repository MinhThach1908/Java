package aptech.day7.example3;

import java.util.Scanner;

public class TinhChuViHinhTamGiac implements TinhChuVi{
    @Override
    public double tinhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập cạnh thứ nhất của hình tam giác: ");
        double c1 = scanner.nextDouble();
        System.out.println("Vui lòng nhập cạnh thứ hai của hình tam giác: ");
        double c2 = scanner.nextDouble();
        System.out.println("Vui lòng nhập cạnh thứ ba của hình tam giác: ");
        double c3 = scanner.nextDouble();
        return c1 + c2 + c3;
    }
}
