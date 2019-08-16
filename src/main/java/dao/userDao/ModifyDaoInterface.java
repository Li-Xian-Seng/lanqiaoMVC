package dao.userDao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public interface ModifyDaoInterface {
    int modifyDao(HashMap hashMap);
}
