package aptech.day5;

import java.util.Scanner;

/**
 * Chương trình quản lý khách hàng cho phép lưu trữ, hiển thị và tìm kiểm khách hàng.
 * */
public class MainDay5 {
    public static void main(String[] args) {
       createMenu();
    }

    public static void createMenu(){
        Scanner scanner = new Scanner(System.in);
        CustomerController customerController = new CustomerController();
        while(true){
            System.out.println("Chương trình quản lý khách hàng.");
            System.out.println("-------------------------------------");
            System.out.println("1. Thêm mới khách hàng.");
            System.out.println("2. Hiển thị danh sách khách hàng.");
            System.out.println("3. Sửa thông tin khách hàng.");
            System.out.println("4. Xóa khách hàng.");
            System.out.println("5. Thoát chương trình.");
            System.out.println("-------------------------------------");
            System.out.println("Vui lòng nhập lựa chọn: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    customerController.create();
                    break;
                case 2:
                    customerController.showListCustomer();
                    break;
                case 3:
                    System.out.println("Chức năng đang được phát triển.");
                    break;
                case 4:
                    System.out.println("Chức năng đang được phát triển.");
                    break;
                case 5:
                    System.out.println("Tạm biệt. Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Vui lòng lựa chọn từ 1-5.");
                    break;
            }
            if (choice == 5){
                // Kết thúc chương trình
                break;
            }
        }
    }
}
