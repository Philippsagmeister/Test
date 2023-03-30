package StreamsplusFiles;
import java.io.*;
import java.util.regex.*;

public class Textwirduebertragen {
    
   
    
    public static void main(String[] args) {
        
        // Dateipfad der Quelldatei
        String filePath = "C:\\Users\\Acer\\Downloads\\Hallo.txt";
        
        try {
            // Lese den Inhalt der Quelldatei in eine String-Variable
            String sourceCode = readFile(filePath);
            
            
            
            // Speichere den bereinigten Quellcode in eine neue Datei
            String outputFilePath = "C:\\Users\\Acer\\Music\\Source\\hallo.txt";
            saveFile(outputFilePath, sourceCode);
            
            System.out.println("Sourcecode-Bereiniger erfolgreich ausgeführt!");
            
        } catch (IOException e) {
        	e.printStackTrace();
            System.out.println("Fehler beim Lesen oder Schreiben der Datei: " + e.getMessage());
        }
    }
    
    // Methode zum Lesen des Inhalts einer Datei
    private static String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }
        reader.close();
        return stringBuilder.toString();
    }
    
  
    
    // Methode zum Speichern von Text in einer Datei
    private static void saveFile(String filePath, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(text);
        writer.close();
    }
}