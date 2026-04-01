package excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteData {

	
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\yousu\\eclipse-workspace\\ExcelOperations\\WriteData.xlsx";
	
		XSSFWorkbook book = new XSSFWorkbook();
				
		XSSFSheet sheet = book.createSheet("WriteData");

		
		XSSFRow row = sheet.createRow(0);                     // create row at index 0
			row.createCell(0).setCellValue("Name");           // create cell at index 0 and write data
			row.createCell(1).setCellValue("Id");
			row.createCell(2).setCellValue("Job");
			
		XSSFRow row2 = sheet.createRow(1);
			row2.createCell(0).setCellValue("Mohamed");
			row2.createCell(1).setCellValue("10");
			row2.createCell(2).setCellValue("Automation QA");

		XSSFRow row3 = sheet.createRow(2);
			row3.createCell(0).setCellValue("Yousuf");
			row3.createCell(1).setCellValue("06");
			row3.createCell(2).setCellValue("Manual QA");	
			
		XSSFRow row4 = sheet.createRow(3);
			row4.createCell(0).setCellValue("Shameem");
			row4.createCell(1).setCellValue("1999");
			row4.createCell(2).setCellValue("Java Selenium");	
		
			
		FileOutputStream filewrite = new FileOutputStream(path);

		book.write(filewrite);

		book.close(); 
		filewrite.close();   
		
		System.out.println("Excel sheet created successfully");
		
	}
}
