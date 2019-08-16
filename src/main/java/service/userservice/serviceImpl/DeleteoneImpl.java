package service.userservice.serviceImpl;


import dao.userDao.UserQuaryInerface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.userservice.DeleteoneServiceInterface;
@Service
public class DeleteoneImpl implements DeleteoneServiceInterface {
    @Autowired
    UserQuaryInerface userQuaryInerface;
    public int deleteoneServiceInterface(int id) {
        return userQuaryInerface.deleteDao(id);
    }
}
