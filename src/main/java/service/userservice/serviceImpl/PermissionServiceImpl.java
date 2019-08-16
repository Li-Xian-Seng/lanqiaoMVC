package service.userservice.serviceImpl;

import dao.userDao.PermissionDaoInterface;
import entity.Permissionn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.PermissionsServiceInterface;

import java.util.List;
@Service
public class PermissionServiceImpl implements PermissionsServiceInterface {
   @Autowired
    PermissionDaoInterface p;
    public List<Permissionn> peermissionService(int i) {
        return p.peermission(i);
    }
}
