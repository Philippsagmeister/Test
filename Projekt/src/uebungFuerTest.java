
public class uebungFuerTest {

	public static void main(String[] args) {
		double betrag = 1000;
		double zinsen = 1.05;
			int jahre = 0;
			
			while (betrag < 4000)
			{

				jahre++;
				betrag = betrag * zinsen;
			
			if (jahre >= 10){
			zinsen = 1.06;
			
			}

			if (jahre % 5 == 0) {
			betrag = betrag + 100;
			}
System.out.printf("Das Ergebnis wären: %s Euro , nach %s Jahren!\n", betrag, jahre);
	}

	}
}
