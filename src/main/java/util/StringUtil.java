package util;

public class StringUtil {

	public static String valueof(Object obj) {
		if(obj!=null) {
			return obj.toString();
		}
		return null;
	}
}
