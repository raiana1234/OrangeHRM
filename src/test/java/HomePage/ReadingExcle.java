package HomePage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcle {

    public static void main(String[] args) throws IOException {

//        FileInputStream file = new FileInputStream("C:\\Users\\hasba\\IdeaProjects\\com.OrangeHRM\\testdata\\testdata.xlsx");
//        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\testdata.xlsx");
        FileInputStream file = new FileInputStream("C:\\Users\\Raiana Razzaq\\IdeaProjects\\com.OrangeHRM\\testdata");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet=workbook.getSheet("Sheet1");

        int totalrows=sheet.getLastRowNum();
        int totalcells=sheet.getRow(1).getLastCellNum();

        System.out.println(totalrows);
        System.out.println(totalcells);

    }

}
