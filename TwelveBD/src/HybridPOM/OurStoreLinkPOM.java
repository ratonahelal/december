package HybridPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OurStoreLinkPOM
{
		
	
		//scroll down to BANASREE-1
		public void ScrollupBan(WebDriver driver) throws InterruptedException
		{	Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,400)", "");
		}
		
		/*
		 * public WebElement MinChatBox(WebDriver driver) throws InterruptedException {
		 * Thread.sleep(5000); WebElement MinChatBoxelement =
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"u_0_0_hU\"]/div/div/div/div/div[1]/div/div[1]/div[3]/div[2]/div/div/svg/path[1]"
		 * )); return MinChatBoxelement; }
		 */
		
		
		//BANASREE-1
		public WebElement Banasree1Store(WebDriver driver) throws InterruptedException
		{	Thread.sleep(5000);
			WebElement Banasree1Storeelement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]/div/div/div/div[2]/div/section/div/article[2]/a/img"));
			return Banasree1Storeelement;	
		}
		// google street view
		public WebElement GoogleStView(WebDriver driver) throws InterruptedException
		{	Thread.sleep(10000);
			WebElement GoogleStViewelement = driver.findElement(By.xpath("//*[@id=\"runway-expand-button\"]/div/button/div"));
			return GoogleStViewelement;	
		}
		//verify google street Rd No:- 9
		public WebElement VerfityGoogleStN9(WebDriver driver) throws InterruptedException
		{	Thread.sleep(5000);
			WebElement VerfityGoogleStN9element = driver.findElement(By.xpath("//*[@id=\"titlecard\"]//div[1]//div/h1/span[1]"));
			return VerfityGoogleStN9element;	
		}
		
		public void VerfityGoogleStN9(String ActualResult, String ExpectedResult)
		{
			if(ActualResult.compareTo(ExpectedResult)==0)
			{
				System.out.println("Google Street Map matches with the expected result");
			}
			else
			{
				System.out.println("Google Street Map doesnt match with the expected result");
			}
		}

		public void openStURL(WebDriver driver) throws InterruptedException 
		{
			Thread.sleep(3000);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://twelvebd.com/pages/our-outlet");
		}

		//scroll down to Rajshahi
		public void ScrolldownR(WebDriver driver) throws InterruptedException
		{	Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,300)", "");
		}
		//Verify Rajshahi Store
		public WebElement VerifyRajshahiStore(WebDriver driver) throws InterruptedException
		{	Thread.sleep(5000);
			WebElement VerifyRajshahielement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]//div[2]//article[1]/div/h1"));
			return VerifyRajshahielement;	
		}
		//scroll down2
		public void Scrolldown2(WebDriver driver) throws InterruptedException
		{	Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,5000)", "");
		}
		//scroll down3
		public void Scrolldown3(WebDriver driver)
		{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,8000)", "");
		}
		//scroll down to MOULVIBAZAR
		public void ScrolldownMou(WebDriver driver) throws InterruptedException
		{	Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,11800)", "");
		}
		//Verify MOULVIBAZAR Store
		public WebElement VerifyMOULVIBAZARStore(WebDriver driver) throws InterruptedException
		{	Thread.sleep(5000);
			WebElement MOULVIBAZARStoreelement = driver.findElement(By.xpath("//*[@id=\"MainContent\"]//div[2]//article[38]/div/h1"));
			return MOULVIBAZARStoreelement;	
		}
		
		public void VerfityStoreNameInfo(String ActualResult, String ExpectedResult, String ActualResult2, String ExpectedResult2)
		{
			if(ActualResult.compareTo(ExpectedResult)==0 && (ActualResult2.compareTo(ExpectedResult2)==0))
			{
				System.out.println("Stores information matches with the expected result");
			}
			else
			{
				System.out.println("Stores information doesnt match with the expected result");
			}
		}
	
		
}
