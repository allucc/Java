package ch14;

import ch13.Student;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * @author lucy
 */
public class Test {
    public static void main(String[] args) {
        String url = "http://www.cnblogs.com/swiftma/p/5631311.html";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements elements = doc.select("#cnblogs_post_body p a");
        for (Element e : elements) {
            String title = e.text();
            String href = e.attr("href");
            System.out.println(title + ", " + href);
        }
    }

    public static void saveAsExcel(List<Student> list) throws IOException {
        Workbook wb = new HSSFWorkbook();
        Sheet sheet = wb.createSheet();
        for (int i = 0; i < list.size(); ++i) {
            Student student = list.get(i);
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(student.getName());
            row.createCell(1).setCellValue(student.getAge());
            row.createCell(2).setCellValue(student.getScore());
        }
        OutputStream out = new FileOutputStream("student.xls");
        wb.write(out);
        out.close();
        wb.close();
    }
}
