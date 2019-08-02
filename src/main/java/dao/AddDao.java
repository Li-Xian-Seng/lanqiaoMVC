package dao;

import Entity.User;
import Entity.UserRole;
import util.DButil;
import util.StringUtil;

import java.util.List;
import java.util.Map;

public class AddDao {
    public int addDao(String username,String password,String images_header,String staffname,int deptId){
            String sql="INSERT INTO `hehe`.`t_user`(`dept_id`, `staffname`, `username`, `password`, `status`, `images_header`) VALUES ( ?,?,?,?, 1,?)";
        int i=DButil.update(sql,deptId,staffname,username,password,images_header);
        String sql1="select COUNT(*) from t_user";
       List<Map<String,Object>> h= DButil.query(sql1);
       int f=0;
      if(h.size()>0){
         f=Integer.valueOf(StringUtil.valueof(h.get(0).get("COUNT(*)")));
      }
      String sql2="INSERT INTO `hehe`.`t_user_role`(`user_id`, `role_id`) VALUES (?, 3)";
      int z=DButil.update(sql2,f);
      if(z!=0&&i!=0){
          i=1;
      }
        return i;
    }

}
