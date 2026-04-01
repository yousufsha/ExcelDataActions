package excelData;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void main(String[] args) throws IOException {
	
		String path = "C:\\Users\\yousu\\eclipse-workspace\\ExcelOperations\\ReadData.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("ReadData");
		int lRow = sheet.getLastRowNum(); // row starts from 0
		System.out.println(lRow);
		
		XSSFRow row = sheet.getRow(1);
		int lClm = row.getLastCellNum(); // cell starts from 1
		System.out.println(lClm);
				
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
			XSSFRow row1 = sheet.getRow(i);
			for(int j=0;j<row1.getPhysicalNumberOfCells();j++) {
				XSSFCell cell = row1.getCell(j);
				System.out.print(cell + "\t");
			}	
			System.out.println( );
		}
		
		
		
		
	}
}
