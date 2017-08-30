package application.repository;

import application.entity.ShoppingCart;
import application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    ShoppingCart findByUser(User user);
}
