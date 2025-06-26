package Bai17.quanlisanpham.service;



import Bai17.quanlisanpham.repository.ProductRepo;
import Bai17.quanlisanpham.entity.Product;


import java.util.List;

public class ProductService implements IProductService{
    private ProductRepo repository;

    public ProductService() {
        this.repository = new ProductRepo();
    }

    @Override
    public void addProduct(Product product) {
        List<Product> products = repository.getAllProducts();
        products.add(product);
        repository.saveAllProducts(products);
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.getAllProducts();
    }

    @Override
    public Product findProductById(String productId) {
        List<Product> products = repository.getAllProducts();
        for (Product p : products) {
            if (p.getProductId().equalsIgnoreCase(productId)) {
                return p;
            }
        }
        return null;
    }
}
