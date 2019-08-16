package api.user;

import entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.serviceImpl.UserManyServiceImpl;
import vo.JsonRequst;

import java.io.File;
import java.util.HashMap;

@RestController
@CrossOrigin(allowCredentials = "true")
public class UserManyApi {
    @Autowired
    private UserManyServiceImpl p;
    @RequestMapping("/api/UserMany")
    public JsonRequst userMany(@RequestParam("userId") String userId){
        HashMap hashMap=new HashMap();
        hashMap.put("userId",userId);
        UserRole u  =p.userManyService(hashMap);
            JsonRequst json=null;
        try{
            if(u!=null){
                json=new JsonRequst("200","查询成功",u);
            }else {
                json=new JsonRequst("404","未查到用户",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json=new JsonRequst("500","查询异常",e.getMessage());
        }
            return json;

    }
}
