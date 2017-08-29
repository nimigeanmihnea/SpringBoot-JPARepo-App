package application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Entity
public abstract class Product {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "productId", nullable = false, unique = true)
    private String productId;

    @Column(name = "price", nullable = false)
    private float price;

    @Column(name = "stock", nullable = false)
    private int stock;

    public Product(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
