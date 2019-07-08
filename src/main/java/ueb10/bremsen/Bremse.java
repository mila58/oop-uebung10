package ueb10.bremsen;

public abstract class Bremse {

	private String hersteller;
	private String seriennummer;

	public Bremse(String h, String s){
		this.hersteller = h;
		this.seriennummer = s;
	}

	public abstract void bremsen();
	public abstract boolean brauchtService();


}
