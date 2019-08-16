package api.user;

import entity.Privs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.serviceImpl.CanDanServiceImpl;
import vo.JsonRequst;

import java.util.List;

@Controller
@CrossOrigin(allowCredentials = "true")
public class PrivsApi {
    @Autowired
   private CanDanServiceImpl t;
    @RequestMapping(value = "/api/privs")
    @ResponseBody
    public JsonRequst privs(@RequestParam("id") int id){
        List<Privs> list=t.caiDanService(id);
        JsonRequst json=null;
        try{
            if(list.size()>0){
                json=new JsonRequst("200","查询成功",list);
            }else {
                json=new JsonRequst("404","未查到用户",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json=new JsonRequst("500","查询异常",e.getMessage());
        }
        return  json;
    }
}
