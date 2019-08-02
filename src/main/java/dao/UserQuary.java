package dao;

import Entity.UserRole;
import util.DButil;
import util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserQuary {
    public List<UserRole> userQuary(){
        String sql="select e.id id,staffname,username,status,h.dept_name name ,u.`name` role ,e.images_header FROM t_user e LEFT JOIN t_dept h on h.id=e.dept_id LEFT JOIN t_user_role f on h.id=f.user_id left join t_role u on f.role_id=u.id ORDER BY id ASC";
        List<Map<String,Object>> list= DButil.query(sql);
        List<UserRole> list1=new ArrayList<UserRole>();
        UserRole u=null;
        for(int i=0;i<list.size();i++){
            u=new UserRole();
            u.setId(Integer.valueOf(StringUtil.valueof(list.get(i).get("id"))));
            u.setStaffname(StringUtil.valueof(list.get(i).get("staffname")));
            u.setUsername(StringUtil.valueof(list.get(i).get("username")));
            u.setStatus(Integer.valueOf(StringUtil.valueof(list.get(i).get("status"))));
            u.setName(StringUtil.valueof(list.get(i).get("name")));
            u.setRole(StringUtil.valueof(list.get(i).get("role")));
            u.setImages_header(StringUtil.valueof(list.get(i).get("images_header")));
            list1.add(u);
        }
        return list1;
    }
}
