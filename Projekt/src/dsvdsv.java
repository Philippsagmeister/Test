

public class dsvdsv {

	public static void main(String[] args) {

double betrag = 1000;
double zinsen = 1.00;
double erhöhung = 0.05;

for (int jahre = 0; jahre <= 10; jahre++) {

	if (jahre % 5 == 0) {
		
		zinsen = zinsen + erhöhung;
		
	}

	betrag = betrag * zinsen;
	
}
System.out.printf("Der Betrag, der nach 30 Jahren zusammenkommt, beträgt %s", betrag);
	}

}