package Schiffe_versenken;

public class Playground {
	
		public static boolean[][] angriff = new boolean[10][10];
		
		public static void Erzeugung_playground()
		{
			
			for(int i= 0; i < angriff.length; i++)
			{
				for (int j = 0; j < angriff.length ; j++) {
					
					System.out.print(Schiffe.ueberpruefen[i][j] + " |");
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			Schiffe.SchiffeErzeugen();
			Erzeugung_playground();
		}
		
		
	}

