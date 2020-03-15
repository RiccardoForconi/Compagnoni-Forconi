package it.univpm.progettoSpringBootApp.utilities;

import java.io.InputStream;
import java.net.URI;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.simple.*;
import org.json.simple.parser.ParseException;


public class Parsing {
private JSONArray objA;
	
	//Costruttore, fa il controllo del contenuto della stringa data per vedere se il suo contenuto sono oggetti
	//di tipo JSON e poi ne estrapola il contenuto con il metodo .get fino ad arrivare alla sezione resources 
	//in cui si trova l'url per il download del file json. Aprire il dataset con firefox per migliore comprensione
	public Parsing(String data) throws ParseException{
		//controlla se la stringa è in formato JSON
		JSONObject obj = (JSONObject) JSONValue.parseWithException(data);
		//in questa sezione andiamo a prendere i valori che ci interessano
		// objI è una stringa privata delle strutture del json e contiene soltanto i valori che a noi interessano.
		JSONObject objI = (JSONObject) (obj.get("result"));
	    objA = (JSONArray) (objI.get("resources"));//ogni oggetto della sezione resources sono inseriti in 
	                                               // un array di json 
	}
	
	
	//Si effettua un controllo di ogni elemento dell'array fino a quando non si trova quello con il formato json
	//e si estrapola l'url;
	public void createJSON() throws Exception{
		boolean app=false; //necessaria in quanto ci sono due elementi di tipo json ma ce ne serve solo uno
		for(Object o : objA){
		    if ( o instanceof JSONObject ) {
		        JSONObject o1 = (JSONObject)o; 
		        //ritorna null se non c'è format
		        String format = (String)o1.get("format");
		        String urlD = (String)o1.get("url");
		        if(format.contentEquals("json")&& app==false){
			        app=true;
		        	download(urlD, "dati.json");
		        }
		    }
		}
	}
		
		//Va a prendere il contenuto dell'oggetto json e lo memorizza in un file a livello locale
		public static void download(String url, String fileName) throws Exception {
			    
		        try(InputStream in = URI.create(url).toURL().openStream()){
		        	try {
		        		//scrive dati sul file passato come parametro
		        		 Files.copy(in, Paths.get(fileName));
		                 System.out.println("Download completato con successo");
		                }catch(FileAlreadyExistsException e) {
		                	System.out.println("Un file con quel nome esiste gia'");
		                }
		        }
		}
}
