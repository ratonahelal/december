package HybridPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HomePagePOM
{
	public void openURL(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://twelvebd.com/");
	}
	
	//scroll down to store link
	public void Scrolldown(WebDriver driver)
	{	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scroll(0,4800)", "");
	}
	//Our store link
	public WebElement OurStoreLink(WebDriver driver) throws InterruptedException
	{	Thread.sleep(3000);
	WebElement OurStoreLinkelement = driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]/footer/div[1]/div/div[2]/div/ul/li[2]/a"));
	return OurStoreLinkelement;	
	}
	//Support Link	
	public WebElement SupportLink(WebDriver driver) throws InterruptedException
	{	Thread.sleep(3000);
	WebElement SupportLinkelement = driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]//div[2]//ul/li[4]/a"));
	return SupportLinkelement;	
	}		

	 public WebElement loginIcon(WebDriver driver) throws InterruptedException 
	 { 	
		Thread.sleep(4000); WebElement loginelement =
	 	driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div[2]/header/div/div[2]/div/a[1]"));
	 	return loginelement;
	 }
	 public WebElement logo(WebDriver driver)
	 {
		 WebElement logoelement = driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div[2]/header/div/div[1]/div/a"));
		  return logoelement;
		  }

	public void CloseURL(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		driver.close();
	}
	// click search icon
	 public WebElement SearchIcon(WebDriver driver) 
	 {
		 WebElement SearchIconelement = driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div//div[2]//button[1]"));
		  return SearchIconelement;
		  }
	 public WebElement SpringCollecton(WebDriver driver) {
			WebElement SpringElement = driver.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[2]/button/span"));
			return SpringElement;
		}

		public WebElement Women(WebDriver driver) {
			WebElement WomenElement = driver.findElement(By.xpath("//*[@id=\"SiteNavLabel-spring-collection\"]/ul/li[2]/a/span"));
			return WomenElement;
		}

		public WebElement SortBy(WebDriver driver) {
			WebElement SortElement = driver.findElement(By.xpath("//*[@id=\"shopify-section-collection-template\"]/div/header/div[2]/div/div/div[1]/div/label"));
			return SortElement;
		}
		
		public WebElement DropDown(WebDriver driver) {
			WebElement DropElement = driver.findElement(By.xpath("//*[@id=\"SortBy\"]"));
			return DropElement;
		}
		
		public WebElement Alphabet(WebDriver driver) {
			WebElement AlphaElement = driver.findElement(By.xpath("//*[@id=\"SortBy\"]"));
			return AlphaElement;
		}
		public WebElement Green(WebDriver driver) {
			WebElement GreenElement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[1]/div/a/div[1]"));
			return GreenElement;
		}

		 public  WebElement Price1(WebDriver driver) {
			 WebElement Price1Element= driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[1]/div/a/div[2]/dl/div[1]/div[1]/dd/span"));
			 return Price1Element; 
		 }
		 
		 public WebElement Shopping(WebDriver driver) {
			 WebElement ShopElement= driver.findElement(By.xpath("//*[@id=\"continue_shopping\"]"));
			 return ShopElement;
		 }
		 
		 public WebElement Cart1(WebDriver driver) {
			 WebElement Cart1Element = driver.findElement(By.xpath("//*[@id=\"product_form_8292445880546\"]/div[4]/div/button"));
			 return Cart1Element;
			}
			 
		public WebElement Beige(WebDriver driver) {
			WebElement BeigeElement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[13]/div/a/div[1]"));
			return BeigeElement;
		}

		public  WebElement Price2(WebDriver driver) {
			WebElement Price2Element = driver .findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[13]/div/a/div[2]/dl/div[1]/div[1]/dd/span"));
		  return Price2Element; }
		 
		
		 public WebElement Cart2(WebDriver driver) {
			 WebElement Cart2Element = driver.findElement(By.xpath("//*[@id=\"tocart\"]"));
			 return Cart2Element;
		 }
		
		public WebElement Remove(WebDriver driver) {
			WebElement RemoveElement = driver.findElement(By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/div/div[2]/p/a"));
			return RemoveElement;
		}
		
		public WebElement Womens(WebDriver driver)
		{
			WebElement womenselement = driver.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[5]/button/span"));
					return womenselement;		
		}
		public WebElement gown(WebDriver driver) throws InterruptedException	
		{	Thread.sleep(2000);
			WebElement womengownelement = driver.findElement(By.xpath("//*[@id=\"SiteNavLabel-womens\"]/div/ul/li[1]/ul/li[8]/a/span"));
					return womengownelement;	
		}
		
}
//