package api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.AddService;
import vo.JsonRequst;

@RestController
@CrossOrigin(allowCredentials = "true")
public class AddApi {
    @RequestMapping("/api/addApi")
    public JsonRequst addApi(@RequestParam("username")String username,
                             @RequestParam("password")String password,
                             @RequestParam("image-header")String images_header,
                             @RequestParam("staffname")String staffname,
                             @RequestParam("deptId")int deptId){

        AddService d=new AddService();
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
