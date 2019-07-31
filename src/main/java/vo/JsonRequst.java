package vo;

public class JsonRequst {
	private String statues;
	private String message;
	private Object data;
	public JsonRequst(String statues, String message, Object data) {
		this.statues=statues;
		this.message=message;
		this.data=data;
	}
	
	public String getStatues() {
		return statues;
	}
	public void setStatues(String statues) {
		this.statues = statues;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
