package MatrixRotation;

import java.io.*;

public class FileDemo
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter("sample.txt");

            fw.write("Welcome to Java File Handling");

            fw.close();

            FileReader fr = new FileReader("sample.txt");

            int i;

            while((i = fr.read()) != -1)
            {
                System.out.print((char)i);
            }

            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
