package filehandling;
import java.io.*;
public class FileMethods {
    public static void main(String[] args) {
        try {

            File file = new File("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\Aa.txt");
            if (file.createNewFile()) {
                System.out.println(" file created");
            } else {
                System.out.println(" file is already created");
            }
            System.out.println(file.isFile());
            System.out.println(file.getTotalSpace());
            System.out.println(file.canWrite());
            System.out.println(file.canRead());
            System.out.println(file.exists());
            System.out.println(file.length());
          //  System.out.println(file.mkdir());
            System.out.println(file.mkdirs());


        }catch (IOException e)
        {
            throw  new RuntimeException(e);
        }

    }
}
