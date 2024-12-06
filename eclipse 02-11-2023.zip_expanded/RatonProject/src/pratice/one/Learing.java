package pratice.one;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learing {
    @Test
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "libs/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
	}
	
	

}
