package lesson.ten;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWaitExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raton\\Downloads\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.thestockmarketwatch.com");				
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
