package api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.DeleteServiceInterface;
import service.serviceImpl.DeleteServiceImpl;
import service.serviceImpl.DeleteoneImpl;
import vo.JsonRequst;

@RestController
@CrossOrigin(allowCredentials = "true")
public class DeleteApi {
    @Autowired
    DeleteoneImpl deleteone;
    @Autowired
    DeleteServiceInterface l;
    @RequestMapping(value = "/api/delete",method = RequestMethod.GET)
    public JsonRequst deleteApi(@RequestParam("id")String  []id){
        int i=l.deleteService(id);
        JsonRequst json=null;
        try{
            if(i!=0){
                json=new JsonRequst("200","删除成功",null);
            }else {
                json=new JsonRequst("404","删除失败",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json=new JsonRequst("500","删除异常",null);
        }
        return json;
    }

    /**
     * 单个删除
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/deleteone",method = RequestMethod.GET)
    public JsonRequst deleteApi(@RequestParam("id")int  id){
        int i=deleteone.deleteoneServiceInterface(id);
        JsonRequst json=null;
        try{
            if(i!=0){
                json=new JsonRequst("200","删除成功",null);
            }else {
                json=new JsonRequst("404","删除失败",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json=new JsonRequst("500","删除异常",null);
        }
        return json;
    }
}
