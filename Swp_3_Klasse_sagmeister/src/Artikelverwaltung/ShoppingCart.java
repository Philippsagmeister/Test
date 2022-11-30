package Artikelverwaltung;

import java.util.ArrayList;

public class ShoppingCart {
	static ArrayList<Article> shoppin_cart = new ArrayList<Article>();
	public static void main(String[] args) {
		Article a = new Article (123, 123);
		shoppin_cart.add(a);
		DVD d = new DVD (123, 123, "Star Wars", 4, DVD.COUNTRYCODE.DE);
		shoppin_cart.add(d);
		for (int i = 0; i < shoppin_cart.size(); i++) {
			System.out.println(shoppin_cart.get(i));
		}
		GesamtPreis();
	}

	public static void GesamtPreis()
	{
		double preis = 0 ;
		for (int i = 0; i < shoppin_cart.size(); i++) {
			preis += shoppin_cart.get(i).getPrice();
		}
		System.out.println("Gesamtpreis: " + preis);
	}
	
}