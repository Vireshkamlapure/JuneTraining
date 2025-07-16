package fileHandling;

import java.io.*;

public class serialization {
    public static void main(String[] args) throws IOException , ClassNotFoundException{

//            TODO : serialization of student object
        Student student = new Student(101, "John Dow", 75.5f);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/Users/vireshkamlapure/Desktop/studentData.txt"));

        System.out.println("Serializing Student.");
        objectOutputStream.writeObject(student);

        objectOutputStream.close();


//        TODO : De-serialization of student object
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/vireshkamlapure/Desktop/studentData.txt"));
        System.out.println("De-Serializing Student.");
        Student objectFromFile = (Student) objectInputStream.readObject();
        objectFromFile.printDetails();

    }

}
