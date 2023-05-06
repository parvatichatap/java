package filehandling;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PdfCreation {
    public static void main(String[] args){
        Document document=new Document();

        try
       {

        PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Pdf Creating\\Hello.pdf")) ;
          document.open();
          document.add(new Paragraph("A Hello World document this is first document  ."));
          document.close();
          writer.close();
           System.out.println("Pdf is created successfully .");
        }catch(DocumentException |FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}