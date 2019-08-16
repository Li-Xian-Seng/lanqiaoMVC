package dao.userDao;

import entity.Permissionn;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PermissionDaoInterface {
    List<Permissionn> peermission(int i);
}
