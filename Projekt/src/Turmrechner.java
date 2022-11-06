
public class Turmrechner {
	

		public static void main(String[] args) {
			double start = 13.7;
			double wieOft = 20;
			
			for (int i = 1; i < wieOft; i++) {
				double neu = start * (i+1);
				System.out.printf("Durchlauf %2d: %,.2f * %d = %,.2f\n", i,start, i+1, neu);
				start = neu;
			}
			
			for (int i = 1; i < wieOft; i++) {
				double neu = start / (i+1);
				System.out.printf("Durchlauf %2d: %,.2f : %d = %,.2f\n", i,start, i+1, neu);
				start = neu;
			}
		}

	}


