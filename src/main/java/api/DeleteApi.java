package api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.DeleteService;
import vo.JsonRequst;

@RestController
@CrossOrigin(allowCredentials = "true")
public class DeleteApi {
    @RequestMapping("/api/deleteApi")
    public JsonRequst deleteApi(@RequestParam("id")int id){
        DeleteService l=new DeleteService();
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
}
