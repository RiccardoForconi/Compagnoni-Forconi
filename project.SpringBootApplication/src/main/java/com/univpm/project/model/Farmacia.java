//classe finalizzata alla creazione di oggetti

package com.univpm.project.model;

public class Farmacia {
	
	//Attributi della classe
	
		private String codId;
		private String codASL;
		private String indirizzo;
		private String descrizione;
		private String partitaIVA;
		private String cap;
		private String codcomuneIstat;
		private String descrizioneCom;
		private String frazione;
		private String codprovIstat;
		private String siglaProvincia;
		private String descrizioneProv;
		private String datafineval;
		private String descrizioneTipologia;
		private String codiceTipologia;
		private String latitudine;
		private String longitudine;
		
		//Costruttore di default
		public Farmacia() {
		}
			
		
		//Costruttore
		//sarebbe utile creare un oggetto che incapsuli il tutto
		public Farmacia(String codId, String codASL, String indirizzo, String descrizione, String partitaIVA, String cap,
				String codcomuneIstat, String descrizioneCom, String frazione, String codprovIstat, String siglaProvincia,
				String descrizioneProv, String datafineval, String descrizioneTipologia, String codiceTipologia,
				String latitudine, String longitudine) {
			
			this.codId = codId;
			this.codASL = codASL;
			this.indirizzo = indirizzo;
			this.descrizione = descrizione;
			this.partitaIVA = partitaIVA;
			this.cap = cap;
			this.codcomuneIstat = codcomuneIstat;
			this.descrizioneCom = descrizioneCom;
			this.frazione = frazione;
			this.codprovIstat = codprovIstat;
			this.siglaProvincia = siglaProvincia;
			this.descrizioneProv = descrizioneProv;
			this.datafineval = datafineval;
			this.descrizioneTipologia = descrizioneTipologia;
			this.codiceTipologia = codiceTipologia;
			this.latitudine = latitudine;
			this.longitudine = longitudine;
		}


	    

		//Override di ToString
		
		public String toString() {
			return "Codice identificativo=" + codId + "\nCodice ASL=" + codASL + "\nIndirizzo=" + indirizzo + "\nDescrizione Farmacia="
					+ descrizione + "\nPartita IVA=" + partitaIVA + "\nCAP=" + cap + "\nCodice comune Istat=" + codcomuneIstat
					+ "\nDescrizione comune=" + descrizioneCom + "\nFrazione=" + frazione + "\nCodice provincia Istat=" + codprovIstat
					+ "\nSigla Provincia=" + siglaProvincia + "\nDescrizione Provincia=" + descrizioneProv + "\nData fine validita'="
					+ datafineval + "\nDescrizione Tipologia=" + descrizioneTipologia + "\nCodice Tipologia="
					+ codiceTipologia + "\nLatitudine=" + latitudine + "\nLongitudine=" + longitudine;
		}


		//Metodi setter and getter
		
		public String getCodId() {
			return codId;
		}




		public void setCodId(String codId) {
			this.codId = codId;
		}




		public String getCodASL() {
			return codASL;
		}




		public void setCodASL(String codASL) {
			this.codASL = codASL;
		}




		public String getIndirizzo() {
			return indirizzo;
		}




		public void setIndirizzo(String indirizzo) {
			this.indirizzo = indirizzo;
		}




		public String getDescrizione() {
			return descrizione;
		}




		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}




		public String getPartitaIVA() {
			return partitaIVA;
		}




		public void setPartitaIVA(String partitaIVA) {
			this.partitaIVA = partitaIVA;
		}




		public String getCap() {
			return cap;
		}




		public void setCap(String cap) {
			this.cap = cap;
		}




		public String getCodcomuneIstat() {
			return codcomuneIstat;
		}




		public void setCodcomuneIstat(String codcomuneIstat) {
			this.codcomuneIstat = codcomuneIstat;
		}




		public String getDescrizioneCom() {
			return descrizioneCom;
		}




		public void setDescrizioneCom(String descrizioneCom) {
			this.descrizioneCom = descrizioneCom;
		}




		public String getFrazione() {
			return frazione;
		}




		public void setFrazione(String frazione) {
			this.frazione = frazione;
		}




		public String getCodprovIstat() {
			return codprovIstat;
		}




		public void setCodprovIstat(String codprovIstat) {
			this.codprovIstat = codprovIstat;
		}




		public String getSiglaProvincia() {
			return siglaProvincia;
		}




		public void setSiglaProvincia(String siglaProvincia) {
			this.siglaProvincia = siglaProvincia;
		}




		public String getDescrizioneProv() {
			return descrizioneProv;
		}




		public void setDescrizioneProv(String descrizioneProv) {
			this.descrizioneProv = descrizioneProv;
		}




		public String getDatafineval() {
			return datafineval;
		}




		public void setDatafineval(String datafineval) {
			this.datafineval = datafineval;
		}




		public String getDescrizioneTipologia() {
			return descrizioneTipologia;
		}




		public void setDescrizioneTipologia(String descrizioneTipologia) {
			this.descrizioneTipologia = descrizioneTipologia;
		}




		public String getCodiceTipologia() {
			return codiceTipologia;
		}




		public void setCodiceTipologia(String codiceTipologia) {
			this.codiceTipologia = codiceTipologia;
		}




		public String getLatitudine() {
			return latitudine;
		}




		public void setLatitudine(String latitudine) {
			this.latitudine = latitudine;
		}




		public String getLongitudine() {
			return longitudine;
		}




		public void setLongitudine(String longitudine) {
			this.longitudine = longitudine;
		}


}
