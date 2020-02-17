package fileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetData {

	public static void main(String[] args) throws IOException {
		
	 FileInputStream file = new FileInputStream("H:\\Automation_Selenium\\BasicCoreJava\\src\\fileHandling\\TestData.xlsx");
		 
		 XSSFWorkbook wb = new XSSFWorkbook(file); //Workbook
		  
		 XSSFSheet sheet=wb.getSheet("Sheet1");
		 
		 XSSFRow row=sheet.getRow(0);
		 if(row==null)
			 row=sheet.createRow(0); //if the row dosent exist, it creates before executing
		 
		 XSSFCell cell =row.getCell(3);
		 if(cell==null)
			 cell=row.createCell(3); ////if the column dosent exist, it creates before executing
		 
		cell.setCellValue("Hazel");
		
		FileOutputStream file2 = new FileOutputStream("H:\\Automation_Selenium\\BasicCoreJava\\src\\fileHandling\\TestData.xlsx");

		wb.write(file2);
	}

}
