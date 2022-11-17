package Schiffe_versenken;

public class Playground {

	static private int [][] spielFeld;
	
	static void baseField() {
        spielFeld = new int[10][10]; 
        for (int i = 0; i < spielFeld.length; i++) {
            for (int j = 0; j < spielFeld[i].length; j++) {
                spielFeld[i][j] = 0;
            }
        }
    }
	public static void main(String[] args) {
		baseField();
		showField();
	}
	static void showField() {
        for (int i = 0; i < spielFeld.length; i++) {
            for (int j = 0; j < spielFeld[i].length; j++) {
                System.out.printf(" %d",spielFeld[i][j]);
            }
            System.out.println();
        }
    }
	
}
