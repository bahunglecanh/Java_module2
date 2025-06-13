package ProductManagement.view;

import ProductManagement.controller.ProductController;
import ProductManagement.entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    Scanner scanner=new Scanner(System.in);
    private ProductController productController;



    public ProductView() {
        this.productController = new ProductController();
    }

    public void showMenu(){
        while (true){
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("8. Thoát");
            System.out.print("Chọn thao tác (1-8): ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:addProduct();
                break;
                case 2:updateProduct();
                break;
                case 3:deleteProduct();
                break;
                case 4:displayProduct();
                break;
                case 5:searchByName();
                break;
                case 6:sortByPriceAsc();
                break;
                case 7:sortByPriceDesc();
                break;
                case 8:System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }
    private void addProduct(){
        System.out.println("Nhập id: ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name=scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price=Double.parseDouble(scanner.nextLine());
        productController.addProduct(new Product(id,name,price));
        System.out.println("Đã thêm thành công !!!");
    }
    private void updateProduct(){
        System.out.println("Nhập id cần sửa: ");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên cần sửa: ");
        String name=scanner.nextLine();
        System.out.println("Nhập giá cần sửa: ");
        double price=Double.parseDouble(scanner.nextLine());
        if (productController.updateProduct(id,name,price)){
            System.out.println("Sửa thành công");
        }else {
            System.out.println("Error");
        }
    }
    private void deleteProduct(){
        System.out.println("Nhập id cần xóa: ");
        int id=Integer.parseInt(scanner.nextLine());
        if (productController.deleteProduct(id)){
            System.out.println("Xóa thành công !!!");
        }else {
            System.out.println("Xóa không thành công");
        }
    }
    private void displayProduct(){
        System.out.println("Danh sách sản phẩm: ");
        ArrayList<Product> products=productController.getAllProducts();
        for (Product product:products){
            System.out.println(product);
        }
    }
    private void searchByName(){
        System.out.println("Nhập vào tên cần tìm: ");
        String name=scanner.nextLine();
        ArrayList<Product> searchName=productController.searchProductByName(name);
        if (!searchName.isEmpty()){
            for(Product product:searchName){
                System.out.println(product);
            }
        }else {
            System.out.println("Không tìm thấy");
        }
    }
    private void sortByPriceAsc(){
        productController.sortByPriceAsc();
        System.out.println("Sắp xếp theo tăng dần: ");
        displayProduct();
    }
    private void sortByPriceDesc(){
        productController.sortByPriceDesc();
        System.out.println("Sắp xếp theo giảm dần: ");
        displayProduct();
    }
}
