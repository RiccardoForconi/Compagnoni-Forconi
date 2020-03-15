package esempio2;

import org.json.*;

public class esempio2 {
	public static void main (String[] args) {
		String str = new String();
		JSONObject obj = { "nome":{"$bt": [1000, 10000]}, "anni":38, "capelli":null };
		JSONParser parser = new JSONParser();
		obj = (JSONObject) obj.get("nome");
		obj = (JSONObject) obj.get("$bt");
		str = (String) obj;
		System.out.println(str);
	}
}
