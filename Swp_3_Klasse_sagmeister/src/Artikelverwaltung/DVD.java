package Artikelverwaltung;

public class DVD extends Article {
	private String name;
	private int duration;
	private final double VAT = 1.19;
	public enum COUNTRYCODE {DE,AT;}; 
	private COUNTRYCODE countrycode;
	
	public DVD(double articleNumber, double price, String name,
			int duration, COUNTRYCODE countrycode) {
		super(articleNumber, price);
		this.name = name;
		this.duration = duration;
		this.countrycode = countrycode;
	}
	
	public double getPrice() {
		return super.getPrice() * VAT;
	}
	
	public String toString() {
		return super.toString() + "Name des Films: " + name + "  Dauer: " + duration 
				+ "  Herstellungsort: " + countrycode;
	}
	
	public boolean equals(Object o)
	{
		DVD dvd = (DVD)o;
		return super.equals(o) && this.name.equals(dvd.name) && 
				this.duration == dvd.duration && this.countrycode == dvd.countrycode;
	}
}