package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrow {

    int divide(int a , int b) throws ArithmeticException , Exception{
        return a/b;
    }
    void readFile() throws FileNotFoundException , IOException  {
        FileReader fileReader  = new FileReader("Some-file");
    }
    public static void main(String[] args) throws Exception {
        TestThrow testThrow =new TestThrow();
//        int result = testThrow.divide(10,0);
        testThrow.readFile();
    }
}
