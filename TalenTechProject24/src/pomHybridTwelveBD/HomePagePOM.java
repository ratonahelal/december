package pomHybridTwelveBD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePOM {
	
	public WebElement WinterClearance(WebDriver driver)
	{
		WebElement WCPelement = driver.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[3]/button/span"));
				return WCPelement;		
	}
	public WebElement BoysSelection(WebDriver driver) throws InterruptedException	
	{	Thread.sleep(2000);
		WebElement BSelement = driver.findElement(By.xpath("//*[@id=\"SiteNavLabel-winter-clerance\"]/ul/li[4]/a/span"));
				return BSelement;	
	}

	public WebElement Mens(WebDriver driver)
	{
		WebElement menselement = driver.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[6]"));
				return menselement;		
	}
	
	public WebElement jacket(WebDriver driver)
	{
		WebElement menselement = driver.findElement(By.xpath("//*[@id=\"SiteNavLabel-mens\"]/div/ul/li[1]/ul/li[1]/a"));
				return menselement;		
	}
	
	
	}
	
	

