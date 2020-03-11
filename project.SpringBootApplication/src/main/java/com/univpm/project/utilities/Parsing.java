package com.univpm.project.utilities;

import java.io.InputStream;
import java.net.URI;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import net.minidev.json.parser.ParseException;

public class Parsing {
	
	private JSONArray objA;
	
	public Parsing(String data) throws ParseException{
		JSONObject obj = (JSONObject) JSONValue.parseWithException(data); 
		JSONObject objI = (JSONObject) (obj.get("result"));
	    objA = (JSONArray) (objI.get("resources")); 
	}
	//andiamo a prendere la sezione 1 che ci interessa
	public void createJSON() throws Exception{
		boolean app=false; 
		for(Object o : objA){
		    if ( o instanceof JSONObject ) {
		        JSONObject o1 = (JSONObject)o; 
		        String format = (String)o1.get("format");
		        String urlD = (String)o1.get("url");
		        if(format.contentEquals("json")&& app==false){
		        	System.out.println(format);
			        System.out.println(urlD);
			        app=true;
		        	download(urlD, "dati.json");
		        }
		    }
		}
	}
	//una volta preso 1 (JSON) prendo url nella sottosezione e scarico dati relativi alle farmacie.
	public static void download(String url, String fileName) throws Exception {
		    
	        try(InputStream in = URI.create(url).toURL().openStream()){
	        	try {
	        		 Files.copy(in, Paths.get(fileName));
	                 System.out.println("Download completato con successo");
	                }catch(FileAlreadyExistsException e) {
	                	System.out.println("Un file con quel nome esiste gia'");
	                }
	        }
	}
}
