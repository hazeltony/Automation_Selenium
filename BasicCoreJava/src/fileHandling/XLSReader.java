package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSReader {

	public static void main(String[] args) throws IOException {
		
		FileInputStream xlsfile = new FileInputStream("H:\\Automation_Selenium\\BasicCoreJava\\src\\fileHandling\\xlsPractice.xls");
		
		//public static String getCellData(int RowNum, int ColNum)
		
		HSSFWorkbook wb = new HSSFWorkbook(xlsfile); //Workbook
		  
		 HSSFSheet sheet=wb.getSheet("Sheet1");
		 
		 HSSFRow row=sheet.getRow(0);
		 
		 HSSFCell cell =row.getCell(0);
		 
		 String data = cell.getStringCellValue();
		 
		 System.out.println(data);
		 
		 int rows = sheet.getLastRowNum();
		 int cols =sheet.getRow(0).getLastCellNum();
		 
		 System.out.println(rows);
		 System.out.println(cols);
		 
		 
			
			
		}
	}

