package filehandling;

import java.io.*;

/** fileWriter Reader use
 *used to write and read data from text files
 * Character oriented class.
 */
public class FileWriterReaderDemo {
    public static void main(String[] args) {
        // character stream
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\text.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
bufferedWriter.write( " \"FUNCTION: public.fn_service_rate_m\"");
            System.out.println(" file write successfully");
        }catch (IOException e)
        {
            throw  new RuntimeException(e);

    }
        finally
        {
            try{
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e)
            {
                throw  new RuntimeException(e);
            }
    }
//        Reader class
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try
        {
            fileReader = new FileReader("C:\\Users\\Lenovo\\IdeaProjects\\java\\src\\filehandling\\text.txt");
            bufferedReader= new BufferedReader(fileReader);
            int i=bufferedReader.read();
            while(i!= -1)
            {
                System.out.println((char)i);
                i=bufferedReader.read();
            }
        }catch (IOException e)
        {
            throw  new RuntimeException(e);
        }
        finally
        {
            try
            {
                fileReader.close();
                bufferedReader.close();
            }catch (IOException e)
            {
                throw  new RuntimeException(e);
            }
        }
        }
}
