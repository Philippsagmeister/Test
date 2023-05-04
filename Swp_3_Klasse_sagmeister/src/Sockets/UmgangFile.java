package Sockets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UmgangFile {
    private String str;
    private long length;

    public UmgangFile(String str){
        this.str = str;
    }

    public void safeFile() throws IOException {
        String[] string = str.split("#");
        File document = new File(
                "C:/Temp/Server/"
                        + string[1]);
        FileWriter fw = new FileWriter(document);
        fw.write(string[2]);
        fw.flush();
        fw.close();
        length = document.length();
    }

    public long getLength(){
        return length;
    }

    public String getList(){
        File dir = new File("C:/Temp/Server/");
        File[] files = dir.listFiles();
        String rückgabe="";
        for (File file : files) {
            if (file.isFile()) {
                rückgabe+=file.getName() +"\n";
            }
        }
        return rückgabe;
    }
}