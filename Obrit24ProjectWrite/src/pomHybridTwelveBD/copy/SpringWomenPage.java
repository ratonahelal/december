package pomHybridTwelveBD.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpringWomenPage 
{
	public WebElement TitlePage(WebDriver driver){
	
		WebElement TitlePageElement = driver.findElement(By.xpath("//*[@id=\"shopify-section-collection-template\"]/div/header/div[1]/div/h1"));
		return TitlePageElement;
	}
		public WebElement SortBy(WebDriver driver) {
		WebElement DropElement = driver.findElement(By.xpath("//*[@id=\"SortBy\"]"));
		return DropElement;
	}

	public WebElement Alphabet(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		WebElement AlphaElement = driver.findElement(By.xpath("//*[@id=\"SortBy\"]/option[3]"));
		return AlphaElement;
	}
	public void Scrolldown1(WebDriver driver) throws InterruptedException
	{	Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,400)", "");
	}
	
	public WebElement CheckingOrder1(WebDriver driver) {
		WebElement CheckingOrder1 = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[1]/div/a/div[1]"));
		return CheckingOrder1;
	}

	public void Scrolldown3(WebDriver driver) throws InterruptedException 
	{	
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,3500)", "");
	}

	public WebElement CheckingOrder2(WebDriver driver) {
		WebElement CheckingOrder2 = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[24]/div/a/div[1]"));
		return CheckingOrder2;
	}
	public WebElement Green(WebDriver driver) {
		WebElement GreenElement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[24]/div/a/div[1]"));
		return GreenElement;
	}

	 public WebElement Cart1(WebDriver driver) throws InterruptedException 
	 {	
		 Thread.sleep(3500);
		 WebElement Cart1Element = driver.findElement(By.xpath("//*[@id=\"product_form_8331834851554\"]/div[4]/div/button"));
		 return Cart1Element;
	}
	 
	 public WebElement Cartbtn(WebDriver driver) throws InterruptedException
	 {	
		 Thread.sleep(3500);
		 WebElement Cart2Element = driver.findElement(By.xpath("//*[@id=\"tocart\"]"));
		 return Cart2Element;
	 }
	 public WebElement Shopping(WebDriver driver) {
		 WebElement ShopElement= driver.findElement(By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/div/a"));
		 return ShopElement;
	 }								
	 
	 public WebElement AddingItems(WebDriver driver)
	 {
		 WebElement AddingElement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[1]/div/a/div[1]"));
		 return AddingElement;
	 }
	 
	 public WebElement Cart3(WebDriver driver) throws InterruptedException 
	 {	
		 Thread.sleep(3500);
		 WebElement Cart3Element = driver.findElement(By.xpath("//*[@id=\"product_form_8286518837474\"]/div[4]/div/button/span[1]"));
		 return Cart3Element;
	 }
	 
	 	public WebElement VerifyTotals(WebDriver driver) throws InterruptedException {
	 	Thread.sleep(3000);
	 	
		 WebElement TotalsElement = driver.findElement(By.xpath("//*[@id=\"globo-checkout\"]/div[3]/div/div/span"));
		 return TotalsElement;
	 }
	 	
	 	public WebElement Remove(WebDriver driver) throws InterruptedException {
	 		Thread.sleep(3000);
			WebElement RemoveElement = driver.findElement(By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/div/div[2]/p/a"));
			return RemoveElement;
		}
	 	
	 	public WebElement Remove2(WebDriver driver) throws InterruptedException {
	 		Thread.sleep(3000);
			WebElement Remove2Element= driver.findElement(By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/table/tbody/tr[2]/td[1]/div/div[2]/p/a"));
			return Remove2Element;
		}
	 	
	 	public WebElement Msg(WebDriver driver) throws InterruptedException {
	 		Thread.sleep(3000);
			WebElement MsgElement= driver.findElement(By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[2]/p"));
			return MsgElement;
		}
	 	
	 	public void passorfail(String ActualResultBC, String ExpectedResult1, String ActualResultDC,
			String ExpectedResult2) {
		String passorfail = null;

		if (ActualResultBC.equals(ExpectedResult1) && ActualResultDC.equals(ExpectedResult2)) {
			passorfail = "Pass";
			System.out.println("The actual result1 matches the expected result1.");
		} else {
			passorfail = "Fail";
			System.out.println("The actual result1 did not match the expected result1.");
		}

			}

	public void passorfail1(String ActualResultTitle, String ExpectedResultTitle) {
		String passorfail = null;

		if (ActualResultTitle.compareTo(ExpectedResultTitle) == 0) {
			passorfail = "Pass";
			System.out.println("The actual result1 matches the expected result1.");
		} else {
			passorfail = "Fail";
			System.out.println("The actual result1 did not match the expected result1.");
		}
		
	}
		public void passorfail2(String ActualResult2, String ExpectedResult2) 
		{
			
			if(ActualResult2.compareTo(ExpectedResult2)==0) 
			{
				System.out.println("The quantity matches");
			}
			else
			{
				System.out.println("The quantity does not match");
			}
		
					
	}
		public void passorfail3(String ActualResult3, String ExpectedResult3)
		{
			if(ActualResult3.compareTo(ExpectedResult3)==0)
			{
				System.out.println("Message matches");
			}
			else
			{
				System.out.println("Message does not match");
			}
		}
	
	

}