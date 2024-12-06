package pomHybridTwelveBD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//in POM never say data can be hard code it
// the locator should be fixed 
// dont want to give them more flexible because it will help your code more manageable
// and avoid complexly later on
//keyword is too complex 
// your selector must be hard code it 


public class POMTwelveBD {
	
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
	public void Scrolldown3(WebDriver driver) throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,600)", "");
	}
	public WebElement BoysClothing(WebDriver driver) throws InterruptedException
	{	Thread.sleep(2000);
		WebElement BCelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]//li[1]//a/div[1]"));
		return BCelement;	
	}
	public WebElement DiscountPrice (WebDriver driver) throws InterruptedException
	{	Thread.sleep(2000);
		WebElement DPelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[1]/div/a/div[2]/dl/div[1]/div[2]/dd[1]/span"));
		return DPelement;
	}
	public WebElement BoysClothing2(WebDriver driver) throws InterruptedException
	{	Thread.sleep(2000);
		WebElement BCelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[2]/div/a/div[1]"));
		return BCelement;	
	}
	public WebElement DiscountPrice2 (WebDriver driver) throws InterruptedException
	{	Thread.sleep(2000);
		WebElement DPelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[2]/div/a/div[2]/dl/div[1]/div[2]/dd[1]/span"));
		return DPelement;
	}
	public void Scrolldown(WebDriver driver) throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,4000)", "");

	}
	public WebElement Clickrightarrow (WebDriver driver) throws InterruptedException
	{	Thread.sleep(2000);
		WebElement CrAPelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[3]/a"));
		return CrAPelement;
	}
	public void Scrolldown2(WebDriver driver) throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,3000)", "");
	}
		
	public WebElement Page2of2 (WebDriver driver) throws InterruptedException
	{	Thread.sleep(2000);
		WebElement Page2of2element = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[2]"));
		return Page2of2element;
	}
}
