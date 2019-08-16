package api.user;

import entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.DeptServiceInterface;
import vo.JsonRequst;

import java.util.List;

@Controller
@CrossOrigin(allowCredentials = "true")
public class DeptApi {
    @Autowired
 DeptServiceInterface d;
    @RequestMapping(value = "/api/mquary",method = RequestMethod.GET)
    @ResponseBody
    public JsonRequst deptApi(){
        List<Dept> h= d.deptService(1);
        JsonRequst json=null;
        try{
            if(h.size()>0){
                json=new JsonRequst("200","查询成功",h);
            }else {
                json=new JsonRequst("404","查询失败",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json=new JsonRequst("500","查询异常",null);
        }
        return json;
    }
}
