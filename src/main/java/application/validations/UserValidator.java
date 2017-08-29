package application.validations;

import application.entity.User;
import application.entity.UserInfo;
import application.repository.UserInfoRepository;
import application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by NMI4CLJ on 29.08.2017.
 */

@Service
public class UserValidator {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserInfoRepository userInfoRepository;

    public UserValidator(){}

    public boolean validate(User user, UserInfo userInfo){
        return validateUser(user) && validateUserInfo(userInfo);
    }

    private boolean validateUser(User user){
        String username = user.getUsername();
        User aux = userRepository.findByUsername(username);
        if(aux == null)
            return true;
        else
            return false;
    }

    private boolean validateUserInfo(UserInfo userInfo){
        String pid = userInfo.getPid();
        UserInfo aux = userInfoRepository.findByPid(pid);
        if(aux == null)
            return true;
        else
            return false;
    }
}
