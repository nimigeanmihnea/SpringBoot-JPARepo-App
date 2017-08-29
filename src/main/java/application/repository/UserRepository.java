package application.repository;

import application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findByUsername(String username);
}
