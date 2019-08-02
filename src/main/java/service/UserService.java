package service;

import dao.UserQuary;
import Entity.UserRole;

import java.util.List;

public class UserService {
    public List<UserRole> userService(){
        UserQuary q=new UserQuary();
        return q.userQuary();
    }
}
