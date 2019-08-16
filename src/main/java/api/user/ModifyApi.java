package api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ModifyServiceInterface;
import service.serviceImpl.ModifyServiceImpl;
import vo.JsonRequst;
@RestController
@CrossOrigin(allowCredentials = "true")
public class ModifyApi {
    @Autowired
    ModifyServiceInterface m;
    /**
     * 修改用户信息
     * @param id
     * @param
     * @param
     * @param username
     * @return
     */
    @RequestMapping(value = "/api/modifyApi",method = RequestMethod.POST)
    @ResponseBody
        public JsonRequst modifyApi(@RequestParam("id")int id,
                                    @RequestParam("dept")String dept,
                                    @RequestParam("role")String role,
                                    @RequestParam("username")String username  ){
            int i=m.modifyService(id,dept,role,username);
            JsonRequst json=null;
            try{
                if(i!=0){
                    json=new JsonRequst("200","修改成功",null);
                }else {
                    json=new JsonRequst("404","修改失败",null);
                }
            }catch (Exception e){
                e.printStackTrace();
                json=new JsonRequst("500","修改异常",null);
            }
            return json;
        }

}
