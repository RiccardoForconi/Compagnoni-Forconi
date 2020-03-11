package com.univpm.project.SpringBootApplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.univpm.project.utilities.Connection;
import com.univpm.project.utilities.Parsing;
import com.univpm.project.utilities.CreaStruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try {
		     Connection connect = new Connection();
		     connect.startConnection();
		     Parsing parser=new Parsing(connect.getData());
		     parser.createJSON();
		     CreaStruct dati=new CreaStruct();
		     dati.read();
		}catch(Exception e) {
			System.out.println("Si è verificato un errore");
		}
        SpringApplication.run(Application.class, args);
	}
}
	


