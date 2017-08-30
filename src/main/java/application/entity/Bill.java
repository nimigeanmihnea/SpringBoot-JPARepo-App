package application.entity;

import javax.persistence.*;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Entity
public class Bill {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue
    private long id;

    @OneToOne
    private OnlineOrder order;

    public Bill(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OnlineOrder getOrder() {
        return order;
    }

    public void setOrder(OnlineOrder order) {
        this.order = order;
    }
}
