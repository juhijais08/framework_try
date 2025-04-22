package reusable_abstract_components;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Abstract_component {
      WebDriver driver;
	public Abstract_component(WebDriver driver) {
		this.driver=driver;
	}
	public void max()
	{
	driver.manage().window().maximize();

	}
    public void impwait(int a) {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
    	
    }
    public void close() {
    driver.close();

}
    public void quit() {
    driver.quit();
    
    }
    

}