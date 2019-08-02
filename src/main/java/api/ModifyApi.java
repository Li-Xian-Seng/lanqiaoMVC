package api;

import service.ModifyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vo.JsonRequst;
@RestController
@CrossOrigin(allowCredentials = "true")
public class ModifyApi {
    /**
     * 修改用户信息
     * @param id
     * @param dept_id
     * @param staffname
     * @param username
     * @return
     */
    @RequestMapping("/abc/modify")
        public JsonRequst modifyApi(@RequestParam("id")int id,
                                    @RequestParam("dept_id")int dept_id,
                                    @RequestParam("staffname")String staffname,
                                    @RequestParam("username")String username  ){
            ModifyService m=new ModifyService();
            int i=m.modifyService(id,dept_id,staffname,username);
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
