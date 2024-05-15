package util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chương trình tính chu vi tam giác: ");
            System.out.println("Vui lòng nhập độ dài cạnh thứ nhất: ");
            num1 = scanner.nextFloat();
            System.out.println("Vui lòng nhập độ dài cạnh thứ hai: ");
            num2 = scanner.nextFloat();
            System.out.println("==================");
            System.out.println("1. Tính tổng");
            System.out.println("2. Tính hiệu");
            System.out.println("3. Tính nhân");
            System.out.println("4. Tính thương");
            System.out.println("5. Thoát");
            System.out.println("==================");
            System.out.println("Vui lòng nhập lựa chọn (1-5):");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    result = Calculator.tinhTong(num1, num2);
                    System.out.println("Tổng hai số là: " + result);
                    break;
                case 2:
                    result = Calculator.tinhHieu(num1, num2);
                    System.out.println("Hiệu hai số là: " + result);
                    break;
                case 3:
                    result = Calculator.tinhNhan(num1, num2);
                    System.out.println("Tích hai số là: " + result);
                    break;
                case 4:
                    result = Calculator.tinhChia(num1, num2);
                    if (result != 0) {
                        System.out.println("Thương hai số là: " + result);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Lựa chọn không có trong danh sách. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 5);
    }
//        System.out.println("Vui lòng nhập độ dài cạnh thứ nhất: ");
//        float a = scanner.nextFloat();
//        System.out.println("Vui lòng nhập độ dài cạnh thứ hai: ");
//        float b = scanner.nextFloat();
//        System.out.println("Vui lòng nhập độ dài cạnh thứ ba: ");
//        float c = scanner.nextFloat();
//        float chuVi = Calculator.tinhTong(a, b);
//        System.out.println(chuVi);
}

