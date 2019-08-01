package Entity;

/**
 * 角色
 */
public class Role {
   private String Id;
   private String Name;
   private String Sn;
   private String Remark;
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }

    public String getSn() {
        return Sn;
    }

    public void setSn(String sn) {
        Sn = sn;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
