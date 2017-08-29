package application.repository;

import application.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProductId(long productId);
}
