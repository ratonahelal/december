import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\raton\\Downloads\\chromedriver.exe");
     
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
				System.out.println(driver.getTitle());
		//	driver.findElement(By.id("search")).sendKeys("facebook login");
				//driver.findElement(By.xpath("email")).sendKeys("ratonahelal@gmail.com");
				
				
	}

}
