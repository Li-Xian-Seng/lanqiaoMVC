package api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AddServiceInterface;
import service.serviceImpl.AddServiceImpl;
import vo.JsonRequst;

@RestController
@CrossOrigin(allowCredentials = "true")
public class AddApi {

    @Autowired
    AddServiceInterface d;
    @RequestMapping(value = "/api/addApi",method = RequestMethod.POST)
    @ResponseBody
    public JsonRequst addApi(@RequestParam("username")String username,
                             @RequestParam("password")String password,
                             @RequestParam("image")String images_header,
                             @RequestParam("staffname")String staffname,
                             @RequestParam("deptId")int deptId){
        int i=d.addService(username,password,images_header,staffname,deptId);
        JsonRequst json=null;
        try {
            if(i!=0){
                json=new JsonRequst("200","添加成功",null);
            }else {
                json=new JsonRequst("404","添加失败",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json=new JsonRequst("500","添加异常",e.getMessage());
        }
        return json;
    }

}
