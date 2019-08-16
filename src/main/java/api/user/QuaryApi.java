package api.user;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import entity.UserRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.RecoveryUserInterface;
import service.UserQuaryServiceInterface;
import service.serviceImpl.UserService;
import vo.JsonRequst;

import java.util.List;

@Controller
@CrossOrigin(allowCredentials = "true")
public class QuaryApi {
    @Autowired
    private UserQuaryServiceInterface service;
    /**
     * 查询用户信息角色 和部门
     * @return
     */
    @RequestMapping(value = "/api/images/quary",method = RequestMethod.GET)
    @ResponseBody
    public JsonRequst FQuarys(@Param("pageNum")int pageNum,@Param("pageSize")int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<UserRole> user=service.userService();
        PageInfo pageInfo=new PageInfo(user);
        JsonRequst json=null;
        try{
            if(user!=null){
                json=new JsonRequst("200","查询成功",pageInfo);
            }else {
                json=new JsonRequst("404","未查到用户",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json=new JsonRequst("500","查询异常",e.getMessage());
        }
        return  json;
    }
    @Autowired
    RecoveryUserInterface r;
    @RequestMapping(value = "/api/recovery",method = RequestMethod.GET)
    @ResponseBody
    public JsonRequst recoveryUserInterface(@Param("id")int id){
        int i=r.recoveryUserInterface(id);
        JsonRequst json=null;
        try{
            if(i!=0){
                json=new JsonRequst("200","查询成功",null);
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
