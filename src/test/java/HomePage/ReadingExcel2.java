package HomePage;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Rile---->WorkBook---->Sheet---->Rows---->Cells
public class ReadingExcel2 {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("C:\\Users\\Raiana Razzaq\\IdeaProjects\\com.OrangeHRM\\testdata\\testdata.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);

       XSSFSheet sheet = workbook.getSheet("Sheet1");
        int totalrows = sheet.getLastRowNum();
        int totalcell = sheet.getRow(1).getLastCellNum();

        System.out.println(totalrows);
        System.out.println(totalcell);







    }

}
