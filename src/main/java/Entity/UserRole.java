package entity;

import java.util.List;
import java.util.Map;

public class UserRole {
    private int id;
    private String username;
    private String password;
    private int status;
    private String images_header;
    private String staffname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private  String name;
    private String role;

    public List<Object>getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    private List<Object> list;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int deptId;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImages_header() {
        return images_header;
    }

    public void setImages_header(String images_header) {
        this.images_header = images_header;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
