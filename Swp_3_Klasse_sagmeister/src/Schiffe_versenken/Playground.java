package Schiffe_versenken;

public class Playground {
	
		public static boolean[][] angriff = new boolean[10][10];
		
		public static void Erzeugung_playground()
		{
			System.out.print("   ");
			for(int i = 0; i < angriff.length; i++)
			{
				System.out.print(i + "  ");
			}
			System.out.println();
			for(int i= 0; i < angriff.length; i++)
			{
				System.out.print(i + "  ");
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

