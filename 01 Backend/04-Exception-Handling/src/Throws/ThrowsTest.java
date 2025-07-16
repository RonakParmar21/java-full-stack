package Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsTest {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Done");
        }
    }

    public static void m1() throws FileNotFoundException {
        m2("ronak.txt");
        System.out.println("M1");
    }

    public static void m2(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
    }
}
