package aptech.day7.example3;

import java.util.Scanner;

public class TinhChuViHinhChuNhat implements TinhChuVi{
    @Override
    public double tinhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chiều dài hình chữ nhật: ");
        double cd = scanner.nextDouble();
        System.out.println("Vui lòng nhập chiều rộng hình chữ nhật: ");
        double cr = scanner.nextDouble();
        return (cd + cr) * 2;
    }
}
