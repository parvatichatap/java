package filehandling;
import java.io.*;
public class FileExample {
    public static void main(String[] args) throws IOException {
     /*  int i;
       FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\text.txt");
       do {
           i=fis.read();
           if(i !=-1)
               System.out.print((char)i);
       }while(i!= -1);
       fis.close();
        FileWriter fw=new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\ttt.txt",true);
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write("computer");
        bf.close();*/
        File f1=new File("C:\\Users\\Lenovo>\\Desktop\\Pa.txt");
        if(f1.exists())
        {
            System.out.println("The name of the file is :"+f1.getName());
            System.out.println("The absolute path of the file is :" +f1.getAbsolutePath());
            System.out.println("is file Writable ? "+f1.canWrite());
            System.out.println("The size of the file bytes :"+f1.length());

        }
        else {
            System.out.println("the file does not exist ");
        }
    }
}
