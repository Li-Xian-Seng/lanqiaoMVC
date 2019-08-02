package dao;

import util.DButil;

public class DeleteDao {
    public int deleteDao(int id){
        String sql="UPDATE t_user a INNER JOIN t_user_role c on c.user_id=a.id SET a.status = 0 WHERE c.role_id=3 and id=？ ";
        int i=DButil.update(sql,id);
        return i;
    }

}
