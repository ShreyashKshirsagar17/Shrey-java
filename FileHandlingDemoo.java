package MatrixRotation;

import java.io.FileWriter;
import java.io.FileReader;

public class FileHandlingDemoo {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("demo.txt");

            fw.write("Welcome to Java File Handling");
            fw.close();

            FileReader fr = new FileReader("demo.txt");

            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
