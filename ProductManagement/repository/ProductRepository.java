package ProductManagement.repository;

import ProductManagement.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private ArrayList<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }


    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public boolean updateProduct(int id, String name, double price) {
        for (Product product:products ){
            if (product.getId()==id){
                product.setName(name);
                product.setPrice(price);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteProduct(int id) {
        return products.removeIf(product -> product.getId()==id);
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return products;
    }

    @Override
    public ArrayList<Product> searchProductByName(String name) {
        ArrayList<Product> foundProducts = new ArrayList<>();
        for (Product product:products){
            if (product.getName().toLowerCase().contains(name.toLowerCase())){
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }

    @Override
    public void sortByPriceAsc() {
        products.sort((s1,s2)->Double.compare(s1.getPrice(),s2.getPrice()));
    }

    @Override
    public void sortByPriceDesc() {
        products.sort((s1, s2) -> Double.compare(s2.getPrice(), s1.getPrice()));
    }
}
