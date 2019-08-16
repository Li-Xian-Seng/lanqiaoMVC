package api.user;

import entity.UserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.SerchUserInterface;
import vo.JsonRequst;

import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin(allowCredentials = "true")
public class SearchApi {
    @Autowired
    SerchUserInterface d;
    @RequestMapping(value = "/api/search",method = RequestMethod.GET)
    @ResponseBody
    public JsonRequst search(@Param("name")String name){
        HashMap h=new HashMap();
        h.put("name","%"+name+"%");
        List<UserRole> r=d.searchDao(h);
        JsonRequst json=null;
        try{
            if(r.size()>0){
                json=new JsonRequst("200","查询成功",r);
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
