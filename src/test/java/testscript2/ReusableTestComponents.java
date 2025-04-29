package testscript2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page_objects.LoginPageObject;

public class ReusableTestComponents {
	 WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
	
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Juhi\\OneDrive\\Automation\\Framework\\framework_try\\src\\main\\java\\resources\\global_data.properties");
    prop.load(fis);
	
	
	String browser_name=prop.getProperty("browser");
	
	if(browser_name.equalsIgnoreCase("chrome"));
	{
		driver=new ChromeDriver();		
	}
	
	return driver;	
}

	public void launchandlogin() throws IOException
	{
		driver=initializeDriver();
		
		LoginPageObject lp=new LoginPageObject(driver);
		lp.launchandlogin();
		lp.dologin("admin@123", "ll");

		
		
		
		
		
		
		
		
}
}
