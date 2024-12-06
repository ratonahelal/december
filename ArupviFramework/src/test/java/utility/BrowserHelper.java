package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHelper {
	
    protected WebDriver driver;

	 @BeforeTest
	    public void setUp() {
	        // Set up the WebDriver
	        WebDriverManager.chromedriver().setup(); // You can change to other drivers as needed
	        driver = new ChromeDriver();
	        driver.manage().window().maximize(); // Maximize the browser window
	    }

	    @AfterTest(enabled = true)
	    public void tearDown() {
	        // Quit the WebDriver and close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
