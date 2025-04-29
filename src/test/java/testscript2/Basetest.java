package testscript2;


import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import page_objects.LoginPageObject;

public class Basetest extends ReusableTestComponents {
         @Test (dataProvider = "excelData") 

	public void tc01 (String unName, String unPass)
		
	{
	  System.out.println(unName+ " "+ unPass);
	  
	  }
         @DataProvider(name="excelData")
         public Object[][] getExcelData() throws IOException 
         {
         String filepath="C:\\Users\\Juhi\\OneDrive\\Automation\\excel csv\\ExcelCSV.xlsx";
         String sheetname= "MySheet";
         
         return Excel_Util.readExcelData(filepath,sheetname );
         }
    
         
         
         
         
	}


