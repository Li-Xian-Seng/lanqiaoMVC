package service.userservice.serviceImpl;


import dao.userDao.UserQuaryInerface;
import entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.UserQuaryServiceInterface;

import java.util.List;
@Service
public class UserService implements UserQuaryServiceInterface {
    @Autowired
    private  UserQuaryInerface p;

    public List<UserRole> userService() {
        return p.userQuary();
    }
}
