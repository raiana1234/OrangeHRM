package HomePage;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class Reading_Excel2 {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("C:\\Users\\Raiana Razzaq\\IdeaProjects\\com.OrangeHRM\\testdata\\testdata.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheet("sheet1");

        Iterator iterator = sheet.iterator();

        while(iterator.hasNext())
        {
            XSSFRow row = (XSSFRow) iterator.next();

            Iterator cellIterator = row.cellIterator();

            while(cellIterator.hasNext())
            {

                XSSFCell cell = (XSSFCell) cellIterator.next();

                System.out.printf("%s\t",cell);

                System.out.print(" | ");




            }

            System.out.println(" ");
        }







    }


}
