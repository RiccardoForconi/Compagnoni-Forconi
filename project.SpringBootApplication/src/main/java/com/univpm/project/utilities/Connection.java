package com.univpm.project.utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Connection {
	
		private final String url = "https://www.dati.gov.it/api/3/action/package_show?id=024e7240-aa66-4c49-9c78-d8ad85836180";
		
		private String data;
		
		
		public Connection() {
			data="";
		}
		
		public String getData() {
			
			return data; 
		}
		
		public void startConnection() {
			
			try {
				URLConnection openConnection = new URL(url).openConnection();
				openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
				InputStream in = openConnection.getInputStream();
				
				 String line = "";
				 try {
				   InputStreamReader inR = new InputStreamReader( in );
				   BufferedReader buf = new BufferedReader( inR );
				  
				   while ( ( line = buf.readLine() ) != null ) {
					   data+= line;
				   }
				 } finally {
				   in.close();
				 }
			} catch (MalformedURLException e) {
				// Implementare la gestione dell'eccezione
			    System.out.println("Errore nell'Url");
			} catch (IOException e) {
				//Implemenatare...
				System.out.println("Errore in connection");
			}
		   }
}
