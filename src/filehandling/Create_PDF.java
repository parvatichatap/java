package filehandling;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Create_PDF {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        String filePath="C:\\Users\\Lenovo\\Desktop\\Pdf Creating\\Test.pdf";
        Document document =new Document();
        FileOutputStream fos=new FileOutputStream(filePath);
        PdfWriter.getInstance(document,fos);
        document.open();
        Paragraph paragraph=new Paragraph("PDF Generated");
        paragraph.setAlignment(Element.ALIGN_CENTER);
        paragraph.setFont(new Font(Font.FontFamily.TIMES_ROMAN));
        document.addTitle("Test file");
        document.add(paragraph);
        document.close();
        System.out.println("Pdf is created successfully .");

    }

    }

