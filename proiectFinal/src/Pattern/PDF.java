package Pattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;

public class PDF implements Report {
    public static Document document = new Document(PageSize.A4, 50, 50, 50, 50);
    private  String filepath = "D:\\Facultate\\An 3\\An 3\\Semestrul 2\\PS\\workspace\\proiectFinal\\src\\Bills.pdf";
    private  PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filepath));

   public PDF() throws FileNotFoundException, DocumentException {
   }

   @Override
   public void generateReport(String doctor,String total) {
       Anchor anchorTarget = new Anchor("Bill no 102:");
       anchorTarget.setName("BackToTop");
       document.open();
       Paragraph paragraph1 = new Paragraph();

       paragraph1.setSpacingBefore(50);

       paragraph1.add(anchorTarget);
       try {
           document.add(paragraph1);
           document.add(new Paragraph("\nDoctor:"+doctor+"   \nTotal: " +total,
               FontFactory.getFont(FontFactory.COURIER, 14, Font.ITALIC, new CMYKColor(0, 255, 255, 0))));
       } catch (DocumentException e) {
           e.printStackTrace();
       }
      // document.close();
   }
}
