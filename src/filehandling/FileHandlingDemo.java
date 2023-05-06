
package filehandling;

import java.io.FileInputStream;
import  java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try {

          // File file = new File("C:\\Users\\Lenovo>\\Desktop\\Sample.txt");
           // file.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(" Sample.txt");
            String str = "Welcome";
            byte b[]  = str.getBytes();
            fileOutputStream.write(b);

           fileOutputStream.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("Sample.txt");
            int i = fileInputStream.read();
            while (i != -1){
                System.out.print((char)i);
                i = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

