package service;

import dao.DeleteDao;

public class DeleteService {
    public int deleteService(int id){
        DeleteDao d=new DeleteDao();
        return d.deleteDao(id);

    }

}
