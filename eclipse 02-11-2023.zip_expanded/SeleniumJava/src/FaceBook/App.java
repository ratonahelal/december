package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App {
WebDriver driver;


@Test
public void doSetUP(Object WebDriverManager) {

System.getProperty("webdriver.chrome.driver","C:\\Users\\raton\\Downloads\\chromedriver.exe");	



	driver = new ChromeDriver();
	driver.get("http://www.facebook.com");

}
@Test
public void openBrowser() {

	driver.get("http://www.facebook.com");
}

public void doLogin()
{
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
