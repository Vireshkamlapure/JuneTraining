package fileHandling;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharFiles {

    void readFile() throws IOException {
        FileReader fileReader = new FileReader("/Users/vireshkamlapure/Desktop/readme.txt");

        int ch = 0 ;
        while ((ch = fileReader.read()) != -1)
            System.out.print((char)ch);

        fileReader.close();
    }

    void writeFile() throws IOException{
        String msg = "This is data.";
        FileWriter fileWriter = new FileWriter("/Users/vireshkamlapure/Desktop/opw.txt");
        fileWriter.write(msg);
        fileWriter.close();
    }


    public static void main(String[] args) throws IOException {
        CharFiles charFiles = new CharFiles();

        System.out.println("Reading data from the file using char file.");
        charFiles.readFile();

        System.out.println("Writing data to file using char file.");
        charFiles.writeFile();
    }
}
