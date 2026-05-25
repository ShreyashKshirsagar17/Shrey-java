package MatrixRotation;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {

        try {

            // Writing into file
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("Welcome to Java File Handling");
            fw.close();

            System.out.println("Data written successfully.");

            // Reading from file
            FileReader fr = new FileReader("demo.txt");

            int ch;

            System.out.println("File Content:");

            while((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        }
        catch(IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
