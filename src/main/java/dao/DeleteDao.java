package dao;

import util.DButil;

public class DeleteDao {
    public int deleteDao(int id){
        String sql="UPDATE t_user SET status = 0 WHERE id=? ";
        int i=DButil.update(sql,id);
        return i;
    }

}
