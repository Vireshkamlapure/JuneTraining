package fileHandling;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteFiles {

    void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/vireshkamlapure/Desktop/readme.txt");

        int ch = 0 ;
        while ((ch = fileInputStream.read()) != -1)
            System.out.print((char)ch);

//        byte[] fileBytes = fileInputStream.readAllBytes();
//        for (byte fileByte : fileBytes)
//            System.out.print((char)fileByte);

        fileInputStream.close();
    }

    void writeFile() throws IOException{
        String msg = "This is data.";
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/vireshkamlapure/Desktop/op.txt");
        fileOutputStream.write(msg.getBytes());
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {
        ByteFiles byteFiles = new ByteFiles();

        System.out.println("Reading data from the file using byte file.");
        byteFiles.readFile();

        System.out.println("Writing data to file using byte file.");
        byteFiles.writeFile();
    }
}
