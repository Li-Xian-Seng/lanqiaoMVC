package dao;

import entity.Dept;
import entity.Role;
import entity.UserRole;
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
        Role role=null;
        Dept dept=null;
        List<Object> f=null;
        UserRole u=null;
        for(int i=0;i<list.size();i++){
            u=new UserRole();
            dept=new Dept();
            role=new Role();
            f=new ArrayList<Object>();
            u.setId(Integer.valueOf(StringUtil.valueof(list.get(i).get("id"))));
            u.setStaffname(StringUtil.valueof(list.get(i).get("staffname")));
            u.setUsername(StringUtil.valueof(list.get(i).get("username")));
            u.setStatus(Integer.valueOf(StringUtil.valueof(list.get(i).get("status"))));
//            u.setName(StringUtil.valueof(list.get(i).get("name")));
//            u.setRole(StringUtil.valueof(list.get(i).get("role")));
            u.setImages_header(StringUtil.valueof(list.get(i).get("images_header")));
            role.setName(StringUtil.valueof(list.get(i).get("role")));
            dept.setDept_name(StringUtil.valueof(list.get(i).get("name")));
            f.add(role);
            f.add(dept);
            u.setList(f);
            list1.add(u);
        }
        return list1;
    }
}
