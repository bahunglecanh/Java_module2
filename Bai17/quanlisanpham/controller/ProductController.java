package Bai17.quanlisanpham.controller;

import Bai17.quanlisanpham.entity.Product;
import Bai17.quanlisanpham.service.ProductService;

import java.util.List;

public class ProductController {
    private ProductService service;

    public ProductController() {
        this.service = new ProductService();
    }

    public void addProduct(Product product) {
        service.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    public Product findProductById(String productId) {
        return service.findProductById(productId);
    }
}
