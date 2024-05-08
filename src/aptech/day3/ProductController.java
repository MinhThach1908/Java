package aptech.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {

    ArrayList<Product> productArrayList = new ArrayList<>();


    //1. Cho phép nhập sản phẩm.
    public void createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập thông tin săn phẩm");
        Product product1 = new Product();
        System.out.println("Nhập id: ");
        product1.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập slug cho sản phẩm: ");
        product1.slug = scanner.nextLine();
        System.out.println("Nhập tên cho săn phẩm: ");
        product1.name = scanner.nextLine();
        System.out.println("Nhập giá cho săn phẩm");
        product1.price = scanner.nextDouble();
        productArrayList.add(product1);
        System.out.println("Lưu dữ liệu thành công.");
    }
    //2. Xem danh sách sản phẩm.
    public void showListProduct() {
        for (int i = 0; i < productArrayList.size(); i++) {
            Product p1 = productArrayList.get(i);
            System.out.println(p1.id);
            System.out.println(p1.slug);
            System.out.println(p1.name);
        }
    }
    //3. Sửa sản phẩm.
    //4. Xóa.
}
