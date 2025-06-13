package ProductManagement.service;

import ProductManagement.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface IServiceProduct {
    void addProduct(Product product);
    boolean updateProduct(int id, String name, double price);
    boolean deleteProduct(int id);
    ArrayList<Product> getAllProducts();
    ArrayList<Product> searchProductByName(String name);
    void sortByPriceAsc();
    void sortByPriceDesc();
}
