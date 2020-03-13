package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.univpm.project.utilities.Connection;
import com.univpm.project.utilities.Parsing;
import com.univpm.project.utilities.CreaStruct;

public class ServiceImpl implements Service{
	//numero di farmacie nel file = 1736
	private static ArrayList<Farmacia> datas =new ArrayList<Farmacia>(1736);

	public ServiceImpl() {
		try {
		     Connection connect = new Connection();
		     connect.startConnection();
		     Parsing parser=new Parsing(connect.getData());
		     parser.createJSON();
		     CreaStruct struct = new CreaStruct();
		     datas = struct.read();
/*
		     CreaStruct dati=new CreaStruct();
		     dati.read();
*/
		}catch(Exception e) {
			System.out.println("Si è verificato un errore");
		}
	}

	public abstract JSONArray getFarmacie(){
		Gson g = new Gson();
		String str = new String();
		JSONArray arr = new JSONArray();
		JSONParser parser = new JSONParser();
		JSONObject obj = new JSONObject();
		for(Farmacia farm:datas)
		{
			str = g.toJson(farm);
			obj = (JSONObject) parser.parse(str);
			arr.add(obj);
		}
	}

	public abstract JSONArray getMetadata(){
		
	}

	public abstract JSONArray getFarmacie(String find){
		
	}
}
