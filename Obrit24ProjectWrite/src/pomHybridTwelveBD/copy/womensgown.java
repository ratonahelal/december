package pomHybridTwelveBD.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class womensgown {

	public void Scrolldown3(WebDriver driver) throws InterruptedException
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,700)", "");
	}
	
	public WebElement SORTBY(WebDriver driver) throws InterruptedException	
	{	Thread.sleep(2000);
		WebElement SORTBYelement = driver.findElement(By.xpath("//*[@id=\"SortBy\"]"));
				return SORTBYelement;
	}	
	
	
	public WebElement bestselling(WebDriver driver) throws InterruptedException	
	{	Thread.sleep(2000);
		WebElement bselement = driver.findElement(By.xpath("//*[@id=\"SortBy\"]/option[2]"));
				return bselement;
	}	
	public WebElement ethnicgownred(WebDriver driver) throws InterruptedException	
	{	Thread.sleep(2000);
		WebElement egrelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[1]/div/a/div[1]"));
				return egrelement;
	}	
	
	public WebElement ethnicgownredprice(WebDriver driver) throws InterruptedException	
	{	Thread.sleep(2000);
		WebElement egrpriceelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[1]/div/a/div[2]/dl/div[1]/div[1]/dd/span"));
				return egrpriceelement;
	}	
	
	public WebElement ethnicSuperPremiumGownBLACK(WebDriver driver) throws InterruptedException	
	{	Thread.sleep(2000);
		WebElement ESPGBelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[9]/div/a/div[1]"));
				return ESPGBelement;
				
	}	
	
	public WebElement ethnicSuperPremiumGownBLACKprice(WebDriver driver) throws InterruptedException	
	{
		
	Thread.sleep(2000);
	WebElement ESPGBpelement = driver.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[9]/div/a/div[2]/dl/div[1]/div[2]/dd[1]/span"));
			return ESPGBpelement;
	}
	public void passorfail (String ActualResult,String ExpectedResult)
	{
				 
				String passorfail;
				if (ActualResult.compareTo(ExpectedResult)==0)
				{
		            passorfail = "Pass";
		            System.out.println("The actual result1 matches the expected result.");
		        } 
				else
		        {
		            passorfail = "Fail";
		            System.out.println("The actual result1 did not match the expected result1.");
		        }
					System.out.println(passorfail);
					System.out.println("ActualResult redgown: " + ActualResult);
					System.out.println("ExpectedResult: " + ExpectedResult);
					System.out.println("");	
			}
				
	public void passorfail1 (String ActualResult1,String ExpectedResult1)
	{
				 
				String passorfail1;
				if (ActualResult1.compareTo(ExpectedResult1)==0)
				{
		            passorfail1 = "Pass";
		            System.out.println("The actual result1 matches the expected result.");
		        } 
				else
		        {
		            passorfail1 = "Fail";
		            System.out.println("The actual result1 did not match the expected result1.");
		        }
					System.out.println(passorfail1);
					System.out.println("ActualResult redgownprice: " + ActualResult1);
					System.out.println("ExpectedResult1: " + ExpectedResult1);
					System.out.println("");	
			}
				
	public void passorfail2 (String ActualResult2,String ExpectedResult2)
	{
				 
				String passorfail2;
				if (ActualResult2.compareTo(ExpectedResult2)==0)
				{
		            passorfail2 = "Pass";
		            System.out.println("The actual result1 matches the expected result.");
		        } 
				else
		        {
		            passorfail2 = "Fail";
		            System.out.println("The actual result1 did not match the expected result1.");
		        }
					System.out.println(passorfail2);
					System.out.println("ActualResult2 blackgown: " + ActualResult2);
					System.out.println("ExpectedResult2: " + ExpectedResult2);
					System.out.println("");	
			}
	public void passorfail3 (String ActualResult3,String ExpectedResult3)
	{
				 
				String passorfail3;
				if (ActualResult3.compareTo(ExpectedResult3)==0)
				{
		            passorfail3 = "Pass";
		            System.out.println("The actual result1 matches the expected result.");
		        } 
				else
		        {
		            passorfail3 = "Fail";
		            System.out.println("The actual result1 did not match the expected result1.");
		        }
					System.out.println(passorfail3);
					System.out.println("ActualResult blackgownprice: " + ActualResult3);
					System.out.println("ExpectedResult: " + ExpectedResult3);
					System.out.println("");	
			}
					
}
