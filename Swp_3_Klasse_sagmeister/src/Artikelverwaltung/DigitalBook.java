package Artikelverwaltung;

public class DigitalBook extends Book{
	private int size;

	public DigitalBook(double articleNumber, double price, String author, String title, int year, int size) {
		super(articleNumber, price, author, title, year);
		this.size = size;
	}
	
	public String toString() {
		return super.toString() + "  Größe: " +  size;
	}
	
	public boolean equals(Object o)
	{
		DigitalBook d = (DigitalBook)o;
		return super.equals(o) && this.size == d.size;
	}
}
