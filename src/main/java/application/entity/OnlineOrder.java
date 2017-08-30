package application.entity;

import javax.persistence.*;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Entity
public class OnlineOrder {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private long id;

    @OneToOne
    private ShoppingCart order;

    public OnlineOrder(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ShoppingCart getOrder() {
        return order;
    }

    public void setOrder(ShoppingCart order) {
        this.order = order;
    }
}
