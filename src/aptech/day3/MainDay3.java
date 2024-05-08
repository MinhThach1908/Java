package aptech.day3;

import java.util.Scanner;

public class MainDay3 {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.createProduct();
        productController.createProduct();
        productController.createProduct();

        productController.showListProduct();
    }
}
