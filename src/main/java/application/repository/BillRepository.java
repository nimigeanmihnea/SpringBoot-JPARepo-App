package application.repository;

import application.entity.Bill;
import application.entity.OnlineOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Repository
public interface BillRepository extends JpaRepository<Bill,Long>{

    Bill findByOrder(OnlineOrder order);
}
