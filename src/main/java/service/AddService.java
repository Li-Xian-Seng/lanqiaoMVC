package service;

import Entity.User;
import Entity.UserRole;
import dao.AddDao;

public class AddService {
    public int addService(String username,String password,String images_header,String staffname,int deptId){
        AddDao a=new AddDao();
        return a.addDao(username,password,images_header,staffname,deptId);
    }

}
