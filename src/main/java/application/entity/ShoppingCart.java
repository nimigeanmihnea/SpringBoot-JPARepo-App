package application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Entity
public class ShoppingCart {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private long id;

    public ShoppingCart(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
