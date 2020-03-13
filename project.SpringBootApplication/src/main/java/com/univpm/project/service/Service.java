package service;

public interface Service{
	public abstract JSONArray getMetadata();
	public abstract JSONArray getFarmacie();
	public abstract void deleteFarmacia(Integer id);
	//lasciando alcuni campi vuoti fa poi la ricerca solo sui campi effettivamente riempiti
	public abstract JSONArray getFarmacie(String find);
}
