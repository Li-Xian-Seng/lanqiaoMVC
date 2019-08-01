package Entity;

public class Dept {
    private int id;
    private int code;
    private String dept_name;
    private int parantid;
    public int getId() {
        return id;
    }

    public int getParantid() {
        return parantid;
    }
    public void setParantid(int parantid) {
        this.parantid = parantid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
