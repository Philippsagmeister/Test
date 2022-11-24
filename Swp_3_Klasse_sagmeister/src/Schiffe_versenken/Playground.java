package Schiffe_versenken;

public class Playground {

	
	public static boolean[][] Reihe_Spalte = new boolean[10][10];
    public static String[][] treffer = new String [10][10];


    //Das Spielfeld wird hier erzeugt
    public static void SpielFeld_Erzeugung()
    {
        System.out.print("   ");
        for(int i = 0; i < Reihe_Spalte.length; i++)
        {
            System.out.print(i + "   ");
        }
        System.out.println();
        for(int i= 0; i < Reihe_Spalte.length; i++)
        {
            System.out.print(i + "  ");
            for (int j = 0; j < Reihe_Spalte.length ; j++) {
                    treffer[i][j] = "*";
                    System.out.print(treffer[i][j] + " | ");
            }
            System.out.println();
        }
    }
    
	
}
