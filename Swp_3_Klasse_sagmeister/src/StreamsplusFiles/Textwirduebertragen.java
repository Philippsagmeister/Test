package StreamsplusFiles;
import java.io.*;
import java.util.regex.*;

public class Textwirduebertragen {
    
   
    
    public static void main(String[] args) {
        
        String filePath = "C:\\Users\\Acer\\Downloads\\Hallo.txt";
        
        try {
            String sourceCode = readFile(filePath);
            
            
            
            String outputFilePath = "C:\\Users\\Acer\\Music\\Source\\hallo.txt";
            saveFile(outputFilePath, sourceCode);
            
            System.out.println("Sourcecode-Bereiniger erfolgreich ausgeführt!");
            
        } catch (IOException e) {
        	e.printStackTrace();
            System.out.println("Fehler beim Lesen oder Schreiben der Datei: " + e.getMessage());
        }
    }
    
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
    
  
    
    private static void saveFile(String filePath, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(text);
        writer.close();
    }
}