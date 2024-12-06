package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
     public  WebDriver getDriver() {
	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\raton\\Downloads\\chromedriver.exe" ); 
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	return driver;
    	 
    	 
	}
	
}