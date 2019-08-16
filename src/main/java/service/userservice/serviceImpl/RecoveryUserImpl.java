package service.userservice.serviceImpl;

import dao.userDao.UserQuaryInerface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.RecoveryUserInterface;
@Service
public class RecoveryUserImpl implements RecoveryUserInterface {
    @Autowired
    UserQuaryInerface u;
    public int recoveryUserInterface(int id) {

        return u.recoveryUser(id);
    }
}
