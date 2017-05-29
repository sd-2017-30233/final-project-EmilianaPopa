package Pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class CSV implements Report {
    private PrintWriter pw ;
    private StringBuilder sb = new StringBuilder();
    @Override
    public void generateReport(String doctorName,String Total) {
        String filepath = "D:\\Facultate\\An 3\\An 3\\Semestrul 2\\PS\\workspace\\proiectFinal\\src\\Bills.csv";
        try {
            pw = new PrintWriter(new File(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      

        sb.append("Doctor name:");
        sb.append(',');
        sb.append(doctorName);
        sb.append('\n');

        sb.append("Total:");
        sb.append(',');
        sb.append(Total);
        sb.append('\n');

        pw.write(sb.toString());
        pw.close();
    }
}
