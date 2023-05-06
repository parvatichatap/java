package filehandling;

import java.io.File;

public class RenameFile {
    public static void main(String[] args){
    File f=new File("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\Pa.txt");
    File r=new File("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\rohini.txt");
    if(f.exists())
    {
        System.out.println(f.renameTo(r));
    }
      else {
        System.out.println("file does not exists");
    }
    }

}
