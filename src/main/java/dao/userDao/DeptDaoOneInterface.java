package dao.userDao;

import entity.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DeptDaoOneInterface {
        List<Dept> deptDao(int i);
}
