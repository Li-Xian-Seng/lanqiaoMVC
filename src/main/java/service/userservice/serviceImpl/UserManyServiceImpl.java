package service.userservice.serviceImpl;



import dao.userDao.UserQuaryInerface;
import entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.UserManyService;

import java.util.HashMap;
@Service
public class UserManyServiceImpl implements UserManyService {
    @Autowired
    UserQuaryInerface u;
    public UserRole userManyService(HashMap h) {
//        UserMantImpl u=new UserMantImpl();
        return u.userManyDao(h);
    }
}
