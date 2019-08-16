package dao.userDao;

import entity.User;
import entity.UserRole;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
@Repository
public interface UserQuaryInerface {
    List<UserRole> userQuary();
    UserRole userManyDao(HashMap h);
    int addDao(User user);
    int roleDao(int id);
    int deleteDao(int id);
    int recoveryUser(int id);
}
