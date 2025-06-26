package Bai17.quanlisanpham.view;

import Bai17.quanlisanpham.controller.ProductController;
import Bai17.quanlisanpham.entity.Product;

import java.util.List;
import java.util.Scanner;

public class ViewProduct {
    private ProductController controller;
    private Scanner scanner;

    public ViewProduct() {
        controller = new ProductController();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int choice;
        do {
            System.out.println("\n--- Quản lý sản phẩm ---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị tất cả sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm theo mã");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayAllProducts();
                    break;
                case 3:
                    findProductById();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 4);
    }

    private void addProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập mô tả: ");
        String description = scanner.nextLine();

        Product product = new Product(id, name, price, manufacturer, description);
        controller.addProduct(product);
        System.out.println("Thêm sản phẩm thành công!");
    }

    private void displayAllProducts() {
        List<Product> products = controller.getAllProducts();
        if (products.isEmpty()) {
            System.out.println("Chưa có sản phẩm nào.");
        } else {
            System.out.println("\nDanh sách sản phẩm:");
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    private void findProductById() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String id = scanner.nextLine();
        Product product = controller.findProductById(id);
        if (product != null) {
            System.out.println("Tìm thấy sản phẩm:");
            System.out.println(product);
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã: " + id);
        }
    }

    public static void main(String[] args) {
        new ViewProduct().showMenu();
    }
}
