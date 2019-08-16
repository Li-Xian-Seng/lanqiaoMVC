package entity;

import java.util.List;

public class Privs {
    public int getPrivId() {
        return privId;
    }

    public void setPrivId(int privId) {
        this.privId = privId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Privs> getData() {
        return data;
    }

    public void setData(List<Privs> data) {
        this.data = data;
    }

    private int privId;
    private  String name;
    private  String url;
    private List<Privs> data;
}
