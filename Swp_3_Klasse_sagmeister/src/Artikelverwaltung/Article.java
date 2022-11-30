package Artikelverwaltung;

public class Article {
	private double articleNumber;
	private double price;
	
	public Article(double articleNumber, double price) {
		this.articleNumber = articleNumber;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public String toString() {
		return getClass().getName() + "  -  " + "Artikelnummer: " + articleNumber + "  Preis: " + getPrice()  + " (Euro) ";
	}
	public boolean equals(Object o)
	{
		Article a = (Article)o;
		return this.articleNumber == a.articleNumber && this.price == a.price;
	}
}
