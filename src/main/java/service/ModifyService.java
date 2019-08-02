package service;

import dao.ModifyDao;

public class ModifyService {
    public int modifyService(int id,int dept_id,String staffname,String username){
        ModifyDao m=new ModifyDao();
        return m.modifyDao(id,dept_id,staffname,username);
    }

}
