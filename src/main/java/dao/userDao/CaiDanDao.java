package dao.userDao;

import entity.Privs;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CaiDanDao {
    public List<Privs> privSelsct(int id);
}
