package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class Data_Excel {

	public static void main (String[] args) throws IOException 
			{
		//declare filename and sheetname
		String filepath= "C:\\Users\\Juhi\\OneDrive\\Automation\\excel csv\\ExcelCSV.xlsx";
		String sheetname= "MySheet";
		//loading of file
		FileInputStream file=new FileInputStream(new File(filepath));
		Workbook workbook= new XSSFWorkbook(file);
		
		workbook.getSheet(sheetname);
		
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(0);
		String username= row.getCell(0).getStringCellValue();
		String password= row.getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		
}
}
