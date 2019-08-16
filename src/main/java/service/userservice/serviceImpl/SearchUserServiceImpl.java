package service.userservice.serviceImpl;

import dao.userDao.DeleteDaoInterface;
import entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.SerchUserInterface;

import java.util.HashMap;
import java.util.List;

@Service
public class SearchUserServiceImpl implements SerchUserInterface {
    @Autowired
    DeleteDaoInterface d;
    public List<UserRole> searchDao(HashMap h) {
        return d.serchuser(h);
    }
}
