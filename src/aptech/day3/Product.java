package aptech.day3;

public class Product {
    int id; //có thể thay int = long
    String slug;
    String name;
    double price;

    void showInformation(){
        System.out.println("Thông tin sản phẩm:");
        System.out.println("Id: " + id);
        System.out.println("Slug: " + slug);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
