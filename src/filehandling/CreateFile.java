package filehandling;
import java.io.*;

import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)throws IOException{

            File f = new File("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\Pa.txt");
            if(f.createNewFile())
            {
                System.out.println(" file successfully Create");
            }
            else
            {
                System.out.println(" file already exit...!");
            }

        if(f.exists())
        {
            System.out.println(" File name :"+f.getName());
            System.out.println("File Location : "+f.getAbsolutePath());
            System.out.println(" File Writable: "+f.canWrite());
            System.out.println(" File Readable :"+f.canRead());
            System.out.println(" File Size :"+f.length());
           // System.out.println("File Remove : "+f.delete());
        }
        else
        {
            System.out.println("File doesnt Exists");
        }

        FileWriter fwrite=new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\Pa.txt");
        fwrite.write(" a named location used to store  information ");
        fwrite.close();
        System.out.println(" content  is  successfully wrote  to the file");
    }
}
