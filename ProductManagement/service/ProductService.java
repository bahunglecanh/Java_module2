package ProductManagement.service;

import ProductManagement.entity.Product;
import ProductManagement.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IServiceProduct{
    private ProductRepository productRepository;

    public ProductService() {
        this.productRepository = new ProductRepository();
    }

    @Override
    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    @Override
    public boolean updateProduct(int id, String name, double price) {
        return productRepository.updateProduct(id,name,price);
    }

    @Override
    public boolean deleteProduct(int id) {
        return productRepository.deleteProduct(id);
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public ArrayList<Product> searchProductByName(String name) {
        return productRepository.searchProductByName(name);
    }

    @Override
    public void sortByPriceAsc() {
        productRepository.sortByPriceAsc();
    }

    @Override
    public void sortByPriceDesc() {
        productRepository.sortByPriceDesc();
    }
}
