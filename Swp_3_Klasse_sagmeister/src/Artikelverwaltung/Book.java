package Artikelverwaltung;

public class Book extends Article {
	private String author;
	private String title;
	private int year;
	private final double VAT = 1.07;
	
	public Book(double articleNumber, double price, String author, String title, int year) {
		super(articleNumber, price);
		this.author = author;
		this.title = title;
		this.year = year;
	}
	
	public double getPrice() {
		return super.getPrice() * VAT;
	}

	public String toString() {
		return super.toString() + "  Autor: " + author + "  Titel: " + title 
				+ "  Jahr: " + year;
	}
	
	public boolean equals(Object o)
	{
		Book b = (Book)o;
		return super.equals(o) && this.author.equals(b.author) && 
				this.title.equals(b.title) && this.year == b.year;
	}	
}
