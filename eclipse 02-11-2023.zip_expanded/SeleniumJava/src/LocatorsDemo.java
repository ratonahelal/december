import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LocatorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raton\\Downloads\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T-shirt");
		driver.findElement(By.name("submit_search")).click();
	    driver.findElement(By.xpath("//a[normalize-space()='Printed Chiffon Dress']")).click();
		int sliders = driver.findElements(By.className("homeslider-container")).size();
		System.out.println("sliders");
		driver.findElement(By.tagName("a")).getSize();
		//System.out.println(links);
		
		
		
	}

}
