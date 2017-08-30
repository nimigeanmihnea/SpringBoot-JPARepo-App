package application.repository;

import application.entity.OnlineOrder;
import application.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Repository
public interface OnlineOrderRepository extends JpaRepository<OnlineOrder, Long> {

    OnlineOrder findByOrder(ShoppingCart order);
}
