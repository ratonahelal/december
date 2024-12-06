package pomHybridTwelveBD.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchPage 
{

	public void openurl(WebDriver dr)
	{
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.get("https://twelvebd.com/collections/flat-50");
	}
	
	 // Click submit icon
	 public WebElement SubmitIcon(WebDriver driver) throws InterruptedException
	 { Thread.sleep(2000);
		 WebElement SubmitIconelement = driver.findElement(By.xpath("//*[@id=\"SearchDrawer\"]//div/form/button"));
		  return SubmitIconelement;
		  }
	 public WebElement SubmitIcon2(WebDriver driver) throws InterruptedException
	 { Thread.sleep(3000);
		 WebElement SubmitIcon2element = driver.findElement(By.xpath("//*[@id=\"SearchDrawer\"]/div/div/form/button"));
		  return SubmitIcon2element;
		  }
	 
	 // Input search bar
	 public WebElement InputSearch(WebDriver driver) throws InterruptedException
	 {
		 Thread.sleep(3000);
		 WebElement InputSearchelement = driver.findElement(By.xpath("//*[@id=\"SearchDrawer\"]//form/div/input[1]"));
		  return InputSearchelement;
		  }
	 
	 //Pant Result
	 public WebElement pantResults(WebDriver driver) throws InterruptedException
	 {
		 Thread.sleep(4000);
		 WebElement pantResultselement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]/ul[1]/li[1]/div/a/span"));
		  return pantResultselement;
		  }
	 public void VerifySearchpant(String ActualResult, String ExpectedResult)
		{
			if(ActualResult.compareTo(ExpectedResult)==0)
			{
				System.out.println("Pant items match the expected result");
			}
			else
			{
				System.out.println("Pant items doesn't match the expected result");
			}
		}
	 
	 public WebElement numberResults(WebDriver driver) throws InterruptedException
	 {
		 Thread.sleep(8000);
		 WebElement numberResultselement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div[1]/div/div/div/div/p"));
		  return numberResultselement;
		  }
	 public void VerifySearchNum(String ActualResult, String ExpectedResult)
		{
			if(ActualResult.compareTo(ExpectedResult)==0)
			{
				System.out.println("Error Messages match the expected result");
			}
			else
			{
				System.out.println("Error Messages doesn't match the expected result");
			}
		}

	 public WebElement VerifyspecialCharResults(WebDriver driver) throws InterruptedException
	 {
		 Thread.sleep(8000);
		 WebElement specialCharResultselement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div/div/h1"));
		  return specialCharResultselement;
		  }
	
	public void VerfitySpChar(String ActualResult, String ExpectedResult)
	{
		if(ActualResult.compareTo(ExpectedResult)==0)
		{
			System.out.println("Special Characters does matches the expected result");
		}
		else
		{
			System.out.println("Special Characters doesnt matches the expected result");
		}
	}

	
}
