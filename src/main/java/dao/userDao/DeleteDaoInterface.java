package dao.userDao;

import entity.UserRole;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface DeleteDaoInterface {
    int deleteDao(String []arry);
    List<UserRole> serchuser(HashMap hashMap);
}
