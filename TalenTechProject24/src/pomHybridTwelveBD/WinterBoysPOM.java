package pomHybridTwelveBD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
      

public class WinterBoysPOM 
{
	String passorfail = null; 
	
	public void Scrolldown3(WebDriver driver) throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,600)", "");
	}
	public WebElement BoysClothing(WebDriver driver) throws InterruptedException
	{	Thread.sleep(3000);
		WebElement BCelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul[1]/li[1]/div/a/div[1]"));
		return BCelement;	
	}
	public WebElement DiscountPrice (WebDriver driver) throws InterruptedException
	{	Thread.sleep(3000);
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
	public void passorfail (String ActualResultBC,String ExpectedResult1,String ActualResultDC, String ExpectedResult2)
	{
		 
		if (ActualResultBC.equals(ExpectedResult1) && ActualResultDC.equals(ExpectedResult2))
		{
            passorfail = "Pass";
            System.out.println("The actual result1 matches the expected result1.");
        } 
		else
        {
            passorfail = "Fail";
            System.out.println("The actual result1 did not match the expected result1.");
        }
			System.out.println(passorfail);
			System.out.println("ActualResult BoyClothing: " + ActualResultBC);
			System.out.println("ExpectedResult1: " + ExpectedResult1);
			System.out.println("ActualResult Discount Price: " + ActualResultDC);
			System.out.println("ExpectedResult2: " + ExpectedResult2);
			System.out.println("");	
	}
	public void passorfail2(String ActualResultBC2,String Clothing1,String ActualResultDC2, String Price1)
	{
		 if (ActualResultBC2.equals(Clothing1) && ActualResultDC2.equals(Price1))
			{
	            passorfail = "Pass";
	            System.out.println("The actual result2 matches the expected result2.");
	        } 
			else
	        {
	            passorfail = "Fail";
	            System.out.println("The actual result2 did not match the expected result2.");
	        }
	        System.out.println(passorfail);
			System.out.println("ActualResult BoyClothing1: " + ActualResultBC2);
			System.out.println("ExpectedResult1: " + Clothing1);
			System.out.println("ActualResult Discount Price2: " + ActualResultDC2);
			System.out.println("ExpectedResult2: " + Price1);
	        System.out.println("");
	}
	public void passorfail3(String ActualResult3,String Page)
	{
		   if (ActualResult3.equals(Page))
		   {
			   passorfail = "Pass";
			   System.out.println("The actual result3 matches the expected result3.");
		   } 
		   else
		   {
			   passorfail = "Fail";
			   System.out.println("The actual result3 did not match the expected result3.");
		   }
		   System.out.println(passorfail);
		   System.out.println("ActualResult3: " + ActualResult3);
		   System.out.println("ExpectedResult3: " + Page);
		   System.out.println("");
	}
	
}
