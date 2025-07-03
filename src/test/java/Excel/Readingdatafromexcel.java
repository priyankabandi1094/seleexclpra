package Excel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdatafromexcel {

	public static void main(String[] args) throws IOException {
	
    FileInputStream  file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Testdata.xlsx");
    
     XSSFWorkbook workbook=new  XSSFWorkbook(file);
     
     XSSFSheet sheet=workbook.getSheet("sheet1");
     
     int totalrows=sheet.getLastRowNum();
     
     int totalcells=sheet.getRow(1).getLastCellNum();
     
     System.out.println("number of rows "+totalrows);
     System.out.println("number of columns "+totalcells);
     
     for (int r=0;r<totalrows;r++)
     {
    	 
    	 XSSFRow currentrow =sheet.getRow(r);
    	 
    	 for (int c=0;c<totalcells;c++)
    	 {
    	 XSSFCell cell =currentrow.getCell(c);
    	 System.out.print(cell.toString()+"\t");
    	
     }
     
    	 System.out.println();
	}
     
     workbook.close();
     file.close();

}
}
