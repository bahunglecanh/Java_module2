package Bai17.quanlisanpham.service;

import Bai17.quanlisanpham.entity.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
    Product findProductById(String productId);
}
