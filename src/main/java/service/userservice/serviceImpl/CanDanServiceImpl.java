package service.userservice.serviceImpl;

import dao.userDao.CaiDanDao;

import entity.Privs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CanDanServiceImpl {
    @Autowired
    private CaiDanDao c;
   public List<Privs> caiDanService(int id){
       return c.privSelsct(id);
   }
}
