package excelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateData {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\yousu\\eclipse-workspace\\ExcelOperations\\UpdateData.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("UpdateData");
		int rowNum = sheet.getLastRowNum();
		
		XSSFRow row = sheet.createRow(rowNum+1);
		
		row.createCell(0).setCellValue("Rahuman");
		row.createCell(1).setCellValue("55");
		row.createCell(2).setCellValue("Driver");
		
		XSSFSheet sheet2 = book.createSheet("New Sheet");
		sheet2.createRow(0).createCell(0).setCellValue("Upated and Created New Sheet");
		
		file.close();
		
		FileOutputStream fo = new FileOutputStream(path);
		book.write(fo);
		
		fo.close();
		book.close();
		
		
		System.out.println("Excel Sheet Updated");

	}

}
