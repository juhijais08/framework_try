package testscript2;


import java.util.Scanner;

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
		Scanner sc= new Scanner(System.in);

	    System.out.println("Enter the email:");
		System.out.println("Enter the pass:");
		String s= sc.nextLine();
		String a=sc.nextLine();
		lpo.dologin(s,a);
		
	}
		

	}


