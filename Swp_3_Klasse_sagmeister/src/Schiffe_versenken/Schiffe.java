package Schiffe_versenken;

public class Schiffe {
		public static boolean[][] PlatzierungSchiffe = new boolean[10][10];
		public static int[][] ueberpruefen = new int[10][10];
		
		
		

		private static boolean Felderueberpruefen(int x, int y, int Richtung, int FelderAnzahl, int welcheRichtung) {
			boolean[][] Test = new boolean[10][10];
			boolean Ergebnis = true;
			for (int j = 0; j < FelderAnzahl; j++) {
				if ((9 >= x && x >= 0) && 
					(9 >= y && y >= 0)) {
					
					Test[y][x] = true;
					if(x-1 >= 0)
						Test[y][x-1] = true;
					if(x+1 <= 9)
						Test[y][x+1] = true; 
					if(y-1 >= 0)
						Test[y-1][x]= true;
					if(y+1 <= 9)
						Test[y+1][x] = true; 
					if (Richtung % 2 == 0) {
						if (welcheRichtung % 2 == 0) {
							x++;
						} else {
							x--;
						}
					} else {
						if (welcheRichtung % 2 == 0) {
							y++;
						} else {
							y--;
						}

					}
				} else {
					Ergebnis = false;
				}
			}
			for (int i = 0; i < Test.length; i++) {
				for (int j = 0; j < Test.length; j++) {
					if (Test[i][j] == true && PlatzierungSchiffe[i][j] == true)
						Ergebnis = false;
				}
			}
			return Ergebnis;
		}
	

static void SchiffeErzeugen() {
	for (int i = 0; i < ueberpruefen.length; i++) {
		for (int j = 0; j < PlatzierungSchiffe.length; j++) {
			ueberpruefen[i][j] = 0;
		}
	}
	
	int FelderAnzahl = 5;
	int SchiffeAnzahl = 1;
	int Anzahl = 1;
	
	while (FelderAnzahl >= 2) {
		
		for (int i = 0; i < SchiffeAnzahl; i++) {
			int Richtung = (int) (Math.random() * 4);
			int welcheRichtung = (int) (Math.random() * 4);
			int y = (int) (Math.random() * 10);
			int x = (int) (Math.random() * 10);
			
			
			if (Felderueberpruefen(x, y, Richtung, FelderAnzahl, welcheRichtung)) {
				for (int l = 0; l < FelderAnzahl; l++) {
				
					PlatzierungSchiffe[y][x] = true;
					ueberpruefen[y][x] = Anzahl;
					if (Richtung % 2 == 0) {
						if (welcheRichtung % 2 == 0) {
							x++;
						} else {
							x--;
						}
					} else {
						if (welcheRichtung % 2 == 0) {
							y++;
						} else {
							y--;
						}

					}
				}
			}else
				i--;
		}
		Anzahl++;
		SchiffeAnzahl += 1;
		FelderAnzahl -= 1;
	}
}
}
