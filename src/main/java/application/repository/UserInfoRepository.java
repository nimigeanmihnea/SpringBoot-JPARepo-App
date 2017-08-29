package application.repository;

import application.entity.User;
import application.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by NMI4CLJ on 26.07.2017.
 */

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long>{

    UserInfo findByPid(String pid);
    UserInfo findByUser(User user);
    List<UserInfo> findByLastNameAndFirstName(String lastName, String firstName);
}
