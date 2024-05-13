package aptech.day7.example3;

import java.util.Scanner;

public class TinhChuViHinhTron implements TinhChuVi{
    @Override
    public double tinhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập bán kính hình tròn: ");
        double bk = scanner.nextDouble();
        return 2 * bk * 3.14;
    }
}
