package Files_uebungen;



import java.io.File;
import java.sql.Date;

public class Files_test {
	
	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Acer\\Documents\\HTL\\Dokumente\\Deutsch");
		
		File[] inhalt = file.listFiles();
		int anzahl = 0;
		for (int i = 0; i < inhalt.length; i++) {
			double size = inhalt[i].length() / 1024;
			anzahl++;
			long lastModified = inhalt[i].lastModified();
			Date datum = new Date(lastModified);

			String format = inhalt[i].toPath().toString().substring(inhalt[i].toString().indexOf("."));
			
			ausgabe(inhalt, i, size, datum, format);
		}
		System.out.printf("Anzahl der Dateien im Verzeichnis: %d", anzahl);
	}

	private static void ausgabe(File[] inhalt, int i, double size, Date datum, String format) {
		System.out.printf("Name: %s%n", inhalt[i].getName());
		System.out.printf("Path: %s%n", inhalt[i].getAbsolutePath());
		System.out.printf("Extension: %s%n", format);
		System.out.printf("Date: %s%n", datum);
		System.out.printf("Size: %s kb%n", size);
		System.out.println();
		System.out.println();
		
	}
}