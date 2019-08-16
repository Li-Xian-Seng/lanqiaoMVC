package service.userservice.serviceImpl;


import dao.userDao.UserQuaryInerface;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.AddServiceInterface;

@Service
public class AddServiceImpl implements AddServiceInterface {
    @Autowired
    UserQuaryInerface a;
    public int addService(String username,String password,String images_header,String staffname,int deptId){
        User u=new User();
        u.setUsername(username);
        u.setPassword(password);
        u.setImages_header(images_header);
        u.setStaffname(staffname);
        u.setDeptId(deptId);
        int i=a.addDao(u);
        int j=a.roleDao(u.getId());
        int x=0;
        if(j!=0&&i!=0){
            x=1;
        }
        return x;
    }

}
