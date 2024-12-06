
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MWRaton {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        // set path of Chromedriver executable
       // System.setProperty("webdriver.chrome.driver",
             //   "./src/test/resources/drivers/chromedriver");

        // initialize new WebDriver session
        driver = new ChromeDriver();
    }

    @Test
    public void navigateToAUrl() throws InterruptedException {
        // navigate to the web site
       // driver.get("https://www.marketwatch.com/");
    	driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(15000);
        WebElement Rtm = driver.findElement(By.cssSelector("[href='https\\:\\/\\/www\\.marketwatch\\.com\\/retirement\\?mod\\=top_nav']"));
        Rtm.click();
        // Validate page title
       // Assert.assertEquals(driver.getTitle(), "Madison Island");
    }
    @AfterMethod
    public void afterMethod() {

        // close and quit the browser
        driver.quit();
    }
}