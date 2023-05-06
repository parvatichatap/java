package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        try {
             FileOutputStream fileOutputStream = new FileOutputStream("xyz.txt");
            FileOutputStream fileOutputStream1 = new FileOutputStream("pp.txt");
            ByteArrayOutputStreamDemo obj = new ByteArrayOutputStreamDemo();

            byte[] str = "pune".getBytes();
           // obj.write( str);
           // obj.writeTo(fileOutputStream);
           // obj.writeTo(fileOutputStream1);
            System.out.println("file write successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fileInputStream1 = new FileInputStream("xyz.txt");
            FileInputStream fileInputStream2 = new FileInputStream("pp.txt");

            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1, fileInputStream2);
            for(int i=sequenceInputStream.read();i != -1;)
            {
                System.out.println((char)i);
                i = sequenceInputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

