
public class dvcgbyb {

	public static void main(String[] args) {
		

		double betrag = 500;
		double zinsen = 1.06;
		

		for (int jahre = 0; jahre <= 20; jahre++) {
		
			if (jahre % 5 == 0) {
			betrag =  betrag + 100;
				
						}
			
			if (jahre >= 10) {
			betrag = betrag * zinsen;
				
				
					}
			System.out.printf("%f\n", betrag);
				}
		
			}
		}