package HybridPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search {
	public void Scrolldown3(WebDriver driver) throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,700)", "");
	}
	 public WebElement SearchIcon(WebDriver driver) 
	 {
		 WebElement SearchIconelement = driver.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div//div[2]//button[1]"));
		  return SearchIconelement;
	 }
	
	public WebElement searchbox(WebDriver driver)
	{	
		WebElement searchboxelement = driver.findElement(By.xpath("//*[@id=\"SearchDrawer\"]/div/div/form/div/input[1]"));
				return searchboxelement;
	}
	public WebElement itemone(WebDriver driver) throws InterruptedException	
	{	Thread.sleep(2000);
		WebElement itemoneelement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]/ul/li/div/a"));
				return itemoneelement;
	}
	public WebElement searchicon2(WebDriver driver)throws InterruptedException	
	{	Thread.sleep(3000);
	WebElement searchicon2element = driver.findElement(By.xpath("//*[@id=\"SearchDrawer\"]/div/div/form/button"));
			return searchicon2element;
}
	
	
	public void passorfail(String ActualResult,String Page)
	{	String passfail = null;
		   if (ActualResult.compareTo(Page)==0)
		   {
			   passfail = "Pass";
			   System.out.println("The clothing matches with the expected result.");
		   } 
		   else
		   {
			   passfail = "Fail";
			   System.out.println("The clothing does not matches with the expected result.");
		   }
		   System.out.println(passfail);
		   System.out.println("ActualResult: " + ActualResult);
		   System.out.println("ExpectedResult: " + Page);
		   System.out.println("");
	}
	
}
