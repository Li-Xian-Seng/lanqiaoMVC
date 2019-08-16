package service.userservice.serviceImpl;


import dao.userDao.DeleteDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.DeleteServiceInterface;
@Service
public class DeleteServiceImpl implements DeleteServiceInterface {
    @Autowired
    DeleteDaoInterface d;
    public int deleteService(String[] arry) {
        return d.deleteDao(arry);
    }
}
