package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable_abstract_components.Abstract_component;

public class LoginPageObject extends Abstract_component {
	
	WebDriver driver;
		
	public LoginPageObject(WebDriver driver) {
    super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//Page factory Annotation
	@FindBy(id="email") WebElement un;
	@FindBy(id="pass") WebElement pas;
	@FindBy(name="login") WebElement lgbutton;

	public void dologin(String username, String password)
	{
		un.sendKeys(username);
		pas.sendKeys(password);
		lgbutton.click();	
		close();
	}
	
	public void launchapp()
	
	{
		driver.get("https://www.facebook.com/");
		impwait(10);
		max();
	}
	
     public void launchandlogin() {
    	 driver.get("https://www.facebook.com/");
 		WebElement email = driver.findElement(By.id("email"));
 		WebElement pass = driver.findElement(By.id("pass"));
 		WebElement lgbutton = driver.findElement(By.name("login"));
 		email.sendKeys("admin123");
 		pass.sendKeys("admin1234");
 		lgbutton.click();  
	}

      
}

