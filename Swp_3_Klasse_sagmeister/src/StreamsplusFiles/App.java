package StreamsplusFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {
        cleanSource(new File(
        		"C:\\Users\\Acer\\Documents\\HTL\\Dokumente\\Programmieren SWP\\Test\\Swp_3_Klasse_sagmeister\\src\\StreamsplusFiles"), "C:\\Users\\Acer\\Music\\Source\\");
    }

    static File[] files;
    static Path path;

    public static void cleanSource(File file, String destDir) throws IOException {
        path = Paths.get(file.getAbsolutePath());
        if (file.isDirectory()) {
            files = file.listFiles((dir, name) -> {
                File[] filestest = dir.listFiles();
                for (File file2 : filestest) {
                    if (file2.getName().equals(name)) {
                        return name.endsWith(".java")&&!name.contains("test");
                        
                    }
                }
                return false;
            });
            if (files != null) {
                for (File f : files) {
                    cleanSource(f, destDir);
                }
            }
        } else {
            readJava(file.getName(), destDir);
        }
    }

    static void readJava(String file, String destDir) throws IOException {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(
                    new FileInputStream(path.toString()), "UTF-8"));

        SourceCodeBereiniger writer = new SourceCodeBereiniger(new FileWriter(destDir+" "+file));
    String str = reader.readLine();
    while (str != null) {
        writer.append(str);
        writer.append("\n");
        str = reader.readLine();
    }
    reader.close();
    writer.close();

    }
}
//ääääööööüüüü