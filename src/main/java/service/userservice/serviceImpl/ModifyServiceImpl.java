package service.userservice.serviceImpl;


import dao.userDao.ModifyDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.ModifyServiceInterface;

import java.util.HashMap;

@Service
public class ModifyServiceImpl implements ModifyServiceInterface {
    @Autowired
    ModifyDaoInterface m;
    public int modifyService(int id,String dept,String role,String username){
        HashMap h=new HashMap();
        h.put("id",id);
        h.put("dept",dept);
        h.put("role",role);
        h.put("username",username);

        return m.modifyDao(h);
    }

}
