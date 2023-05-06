package filehandling;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CopyFile {
    public static void main(String[] args)throws IOException{
       FileInputStream r=new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\text.txt");
       FileOutputStream o=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Pdf Creating\\Rohini.txt");
   int i;
        while(( i=r.read())!= -1)
        {
            o.write((char)i);
        }
        System.out.println(" data copied successfully..");
    }
}
