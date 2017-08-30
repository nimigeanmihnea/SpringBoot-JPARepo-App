package application.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Entity
public class ShoppingCart {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private long id;

    @OneToOne
    private User user;

    @OneToMany
    private List<Product> cart;

    public ShoppingCart(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart(List<Product> cart) {
        this.cart = cart;
    }
}
