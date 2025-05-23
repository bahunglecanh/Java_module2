package Access_Modifier.crud_product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {
    public static ArrayList<Product> products=new ArrayList<>();
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Product CRUD Menu ===");
            System.out.println("1. Create Product");
            System.out.println("2. List Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice=scanner1.nextInt();
            switch (choice){
                case 1-> createProduct();
                case 2 ->listProduct();
                case 3 ->updateProduct();
                case 4 ->deleteProduct();
                default -> System.out.println("Nhập sai rồi nhập lại đê !!!");

            }
        }while (choice!=5);
    }
    public static void createProduct(){
        System.out.println("Enter ID: ");
        int id=Integer.parseInt(scanner.nextLine());
        for (Product p:products){
            if (p.getId()==id){
                System.out.println("ID đã tồn tại !!");
            }
        }
        System.out.println("Enter Name: ");
        String name=scanner.nextLine();
        System.out.println("Enter price: ");
        double price=Double.parseDouble(scanner.nextLine());
        Product product=new Product(id,name,price);
        products.add(product);
        System.out.println("Đã tạo thành công !!!");
    }
    public static void listProduct(){
        if (products.isEmpty()){
            System.out.println("Không có sản phẩm nào !!");
        }else {
            for (Product product:products){
                System.out.println(product);
            }
        }
    }
    public static void updateProduct(){
        System.out.println("Enter ID need update: ");
        int id=Integer.parseInt(scanner.nextLine());
        for (Product product:products){
            if (product.getId()==id){
                System.out.println("Enter new name: ");
                String name=scanner.nextLine();
                product.setName(name);
                System.out.println("Enter new price: ");
                double price=scanner.nextDouble();
                product.setPrice(price);
                System.out.println("Đã update thành công nhá !!!");
            }
        }
        System.out.println("Không có id phù hợp");
    }
    public static void deleteProduct(){
        System.out.println("Enter id need xóa: ");
        int id=scanner.nextInt();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()==id){
                products.remove(i);
                System.out.println("Xóa thành công rồi nhé !!!");
            }
        }
    }
}
