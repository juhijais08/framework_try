package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page_objects.LoginPageObject;

public class Basetest {
         @Test

	public void tc01(){
	
		WebDriver driver = new ChromeDriver();
		

		LoginPageObject lpo= new LoginPageObject(driver);
		lpo.launchapp();
		lpo.dologin();
		
	}
		

	}


