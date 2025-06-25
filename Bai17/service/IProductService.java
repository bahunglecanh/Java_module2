package Bai17.service;

import Bai17.entity.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
    Product findProductById(String productId);
}
