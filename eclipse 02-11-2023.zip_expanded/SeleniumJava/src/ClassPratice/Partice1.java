package ClassPratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raton\\Downloads\\chromedriver.exe" ); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

	}

}
