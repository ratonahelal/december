package pomHybridTwelveBD.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SupportPagePOM
{
	public WebElement VerifyEmail(WebDriver driver) throws InterruptedException
	{	Thread.sleep(5000);
		WebElement VerifyEmailelement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]//div[2]/p[1]/a"));
		return VerifyEmailelement;	
	}
	
	public WebElement VerifyHotline(WebDriver driver) throws InterruptedException
	{	Thread.sleep(5000);
		WebElement VerifyHotlineelement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]//div[2]/p[2]/a"));
		return VerifyHotlineelement;	
	}
	
	public void VerfityStoreNameInfo(String ActualResult, String ExpectedResult, String ActualResult2, String ExpectedResult2)
	{
		if(ActualResult.compareTo(ExpectedResult)==0 && (ActualResult2.compareTo(ExpectedResult2)==0))
		{
			System.out.println("Email and Hotline matches with the expected result");
		}
		else
		{
			System.out.println("Email and Hotline doesnt match with the expected result");
		}
	}

	
}

	