package com.univpm.project.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.univpm.project.model.Farmacia;


public class CreaStruct {
	
	private ArrayList<Farmacia> dati = new ArrayList<Farmacia>();
	
	//Costruttore
	public CreaStruct() {
		
	}
	
	//metodo getter
	public ArrayList<Farmacia> getdati(){
		return dati;
	}
	
	
	
	public void read() throws ClassNotFoundException,IOException, ParseException{ 
		JSONParser parser= new JSONParser();
		JSONArray a = (JSONArray) parser.parse(new FileReader("dati.json"));
			
		for (Object o : a) {
		    
			Farmacia app = new Farmacia();
		    JSONObject farmacia = (JSONObject) o;
		    
		    app.setCodId((String) farmacia.get("CODICE IDENTIFICATIVO FARMACIA"));
		    
		    app.setCodASL((String) farmacia.get("COD FARMACIA ASSEGNATO DA ASL"));
		    
		    app.setIndirizzo((String) farmacia.get("INDIRIZZO"));
		    
		    app.setDescrizione((String) farmacia.get("DESCRIZIONE FARMACIA"));
		    
		    app.setPartitaIVA((String) farmacia.get("PARTITA IVA"));
		    
		    app.setCap((String) farmacia.get("CAP"));
		    
		    app.setCodcomuneIstat((String) farmacia.get("CODICE COMUNE ISTAT"));
		    
		    app.setDescrizioneCom((String) farmacia.get("DESCRIZIONE COMUNE"));
		    
		    app.setFrazione((String) farmacia.get("FRAZIONE"));
		    
		    app.setCodprovIstat((String) farmacia.get("CODICE PROVINCIA ISTAT"));
		    
		    app.setSiglaProvincia((String) farmacia.get("SIGLA PROVINCIA"));
		    
		    app.setDescrizioneProv((String) farmacia.get("DESCRIZIONE PROVINCIA"));
		    
		    app.setDatafineval((String) farmacia.get("DATA FINE VALIDITA"));
		    
		    app.setDescrizioneTipologia((String) farmacia.get("DESCRIZIONE TIPOLOGIA"));
		    
		    app.setCodiceTipologia((String) farmacia.get("CODICE TIPOLOGIA"));
		    
		    app.setLatitudine((String) farmacia.get("LATITUDINE"));
		    
		    app.setLongitudine((String) farmacia.get("LONGITUDINE"));
		    
		    dati.add(app);
		            		      
		}
		
	}

}