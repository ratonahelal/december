package LessonSeven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandelCheckBox {

	
	public void testCheckBox() {
	String Baseurl = "https://costco.com/";
	System.setProperty("webdriver.chrome.driver","libs/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get(Baseurl);
	//WebElement SingInLink = driver.findElement(By.linkText("Sing In / Register"));
	//SingInLink.click();
		
		
		
	}
}
