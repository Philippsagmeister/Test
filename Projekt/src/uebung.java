
public class uebung {

	public static void main(String[] args) {

		double jahre = 15;
		double einkommen = 100;
		double betrag = 1000;
		
		for (int i = 0; i < jahre; i++) {
			
			betrag = betrag + einkommen;
			if (i >= 10) {
				
				betrag = betrag + 200;
				
				
			}
			
		}
		System.out.printf("Nach %s Jahren, hat man einen Betrag von %s", jahre, betrag);
	}

}
