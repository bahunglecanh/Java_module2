package Bai17.entity;

import java.io.Serializable;

public class Product implements Serializable {
    public String productId;
    public String productName;
    public double price;
    public String manufacturer;
    public String description;

    public Product(String productId, String productName, double price, String manufacturer, String description) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Mã sản phẩm='" + productId + '\'' +
                ", Tên sản phẩm='" + productName + '\'' +
                ", Giá=" + price +
                ", Hãng sản xuất='" + manufacturer + '\'' +
                ", Mô tả='" + description + '\'' +
                '}';
    }
}
