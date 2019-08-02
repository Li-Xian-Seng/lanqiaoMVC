package dao;

import util.DButil;

public class ModifyDao {
    public int modifyDao(int id,int dept_id,String staffname,String username){
        String sql="UPDATE `hehe`.`t_user` SET `dept_id` = ?, `staffname` = ?, `username` = ? WHERE `id` = ?";
        int i=DButil.update(sql,dept_id,staffname,username,id);
        return i;
    }

}
