package ProductManagement.controller;


import ProductManagement.entity.Product;
import ProductManagement.service.IServiceProduct;
import ProductManagement.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private IServiceProduct iServiceProduct;

    public ProductController() {
        this.iServiceProduct = new ProductService();
    }
    public void addProduct(Product product){
        iServiceProduct.addProduct(product);
    }
    public boolean updateProduct(int id,String name,double price){
        return iServiceProduct.updateProduct(id,name,price);
    }
    public boolean deleteProduct(int id){
        return iServiceProduct.deleteProduct(id);
    }
    public ArrayList<Product> getAllProducts(){
        return iServiceProduct.getAllProducts();
    }
    public ArrayList<Product> searchProductByName(String name) {
        return iServiceProduct.searchProductByName(name);
    }

    public void sortByPriceAsc() {
        iServiceProduct.sortByPriceAsc();
    }

    public void sortByPriceDesc() {
        iServiceProduct.sortByPriceDesc();
    }

}
