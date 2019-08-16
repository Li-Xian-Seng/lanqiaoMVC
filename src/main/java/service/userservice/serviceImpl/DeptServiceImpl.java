package service.userservice.serviceImpl;


import dao.userDao.DeptDaoOneInterface;
import entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.DeptServiceInterface;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptServiceInterface {
    @Autowired
    DeptDaoOneInterface d;
    public List<Dept> deptService(int i) {
        return d.deptDao(i);
    }
}
