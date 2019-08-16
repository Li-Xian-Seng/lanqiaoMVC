package api.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import vo.JsonRequst;

import java.io.File;
@RestController
@CrossOrigin(allowCredentials = "true")
public class UploadApi {
    @Value("${upload.absoultPath}")
    private String uploadAb;

    /**
     * 上传头像
     * @param multipartFile
     * @return
     */
    @RequestMapping("/api/images/upoad")
    public JsonRequst upload(@RequestParam("image-header") MultipartFile multipartFile){
        JsonRequst json=null;
        if(!multipartFile.isEmpty()){
            try{
                multipartFile.transferTo(new File(uploadAb+"//"+multipartFile.getOriginalFilename()));
                json=new JsonRequst("200","成功",null);
            }catch(Exception e){
                e.printStackTrace();
                json=new JsonRequst("500","上传异常",e.getMessage());
            }
        }else {
            json=new JsonRequst("404","上传失败",null);
        }
        return json;
    }
}
