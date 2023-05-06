package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
   public static void main(String[] args) {
       try (FileOutputStream fileOutputStream = new FileOutputStream("sample.txt")) {
           String str = "Welcome Welcome 123";
           byte b[] = str.getBytes();
           fileOutputStream.write(b);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       try(FileInputStream fileInputStream=new FileInputStream("sample.txt"))
       {
           int i=fileInputStream.read();
           while(i != -1)
           {
               System.out.print((char)i);
               i=fileInputStream.read();
           }
       }catch (IOException e)
       {
           throw new RuntimeException(e);
       }



    }
}
