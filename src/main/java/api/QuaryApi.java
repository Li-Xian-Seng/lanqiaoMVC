package api;

import entity.UserRole;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;
import vo.JsonRequst;

import java.util.List;

@Controller
public class QuaryApi {
    /**
     * 查询用户信息角色 和部门
     * @return
     */
    @RequestMapping(value = "/api/images/quary",method = RequestMethod.GET)
    @ResponseBody
    public JsonRequst FQuarys(){
        UserService service=new UserService();
        List<UserRole> user=service.userService();
        JsonRequst json=null;
        try{
            if(user!=null){
                json=new JsonRequst("200","查询成功",user);
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
