package pomHybridTwelveBD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class POMTwelveBD2 {
	
	public WebElement WinterClearance(WebDriver Driver) throws InterruptedException
	{Thread.sleep(2000);
		WebElement wcElement = Driver.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[3]/button/span"));
		return wcElement;
				
	}
	public WebElement BoysSelection (WebDriver Driver) throws InterruptedException
	{	Thread.sleep(2000);
		WebElement bsElement = Driver.findElement(By.xpath("//*[@id=\"SiteNavLabel-winter-clerance\"]/ul/li[4]/a/span"));
		return bsElement;
	}
	
	public void ScrollDown(WebDriver Driver) throws InterruptedException
	{Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		js.executeScript("scroll(0,600)", "");
	}
	
	public WebElement BoysClothing (WebDriver Driver) throws InterruptedException
	{Thread.sleep(2000);
		WebElement bcElement = Driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[1]/div/a/div[1]"));
		return bcElement;
	}
	
	public WebElement DiscountPrice (WebDriver Driver) throws InterruptedException
	{Thread.sleep(2000);
		WebElement dpElement = Driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[1]/div/a/div[2]/dl/div[1]/div[2]/dd[1]/span"));
		return dpElement;
	}
	
	public WebElement BoysClothing2 (WebDriver Driver) throws InterruptedException
	{Thread.sleep(2000);
		WebElement bc2Element = Driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[2]/div/a/div[1]"));
		return bc2Element;
	}
	
	public WebElement DiscountPrice2 (WebDriver Driver) throws InterruptedException
	{Thread.sleep(2000);
		WebElement dp2Element = Driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[2]/div/a/div[2]/dl/div[1]/div[2]/dd[1]/span"));
		return dp2Element;
	}
	


}
