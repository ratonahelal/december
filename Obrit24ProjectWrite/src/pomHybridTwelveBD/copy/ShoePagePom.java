package pomHybridTwelveBD.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ShoePagePom
{
	public void openURL(WebDriver driver) throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://twelvebd.com/collections/shoes");
	}

	// accessories label
	public WebElement ACCESSORIES(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[6]/button"));
		return we;
	}
	//scroll down to show
	public void Scrolldown(WebDriver driver)
	{	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("scroll(0,350)", "");
	}
	// shoes label
	public WebElement Shoes(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"SiteNavLabel-accessories\"]/ul/li[4]/a"));
		return we;
	}
	//sort by drop down menu
	public WebElement sortdropdown(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"SortBy\"]"));
		return we;
	}
	
	//price, low to high
	public WebElement priceLowToHigh(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"SortBy\"]/option[5]"));
		return we;
	}
	
	//Verify low to high shoes price
	
	public WebElement VerifyLow(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[1]/div/a/div[2]/dl/div[1]/div[2]/dd[1]/span"));
		return we;
	}
	
	public WebElement VerifyHigh(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[3]/div/a/div[2]/dl/div[1]/div[2]/dd[1]/span"));
		return we;
	}
	
	public void sortdropdown1(WebDriver dr)
	{
		Select dropdown1 = new Select(dr.findElement(By.xpath("//*[@id=\"SortBy\"]")));
		dropdown1.selectByVisibleText("Alphabetically, A-Z");
	}
	
	//Alphabetically, A-Z,

	public WebElement AlphabeticallyAZ(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"SortBy\"]"));
		return we;
	}
	
      //Verify,Alphabetically, A-Z
	
	public WebElement MENSHALFSHOEBLACK(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[1]/div/a/div[1]"));
		return we;
	}
	
	public WebElement MensShoesBrown1(WebDriver dr)
	{
		WebElement we = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul/li[3]/div/a/div[1]"));
		return we;
	}
	
	public void VerifyLowHigh1(String result,String ExpectedPrice1, String result2, String ExpectedPrice2)
	{
		if (result.compareTo(ExpectedPrice1)==0&& result2.compareTo(ExpectedPrice2)==0)
			{
				System.out.println("it is match");
			}
			else 
			{
				System.out.println("not match");
			}
	}
	
	public void verifyMENSHALFSHOEBLACK(String halfshoes,String exlShoeBlack)
	{
		if(halfshoes.compareTo(exlShoeBlack)==0)
		{
			System.out.println("Black shoes is match with expected result");
		}
		else
		{
			System.out.println("Black shoes is match with expected result");
		}
	}
	
	public void VerifyMensShoesBrown1(String shoesbrown,String exlShoesBrown)
	{

		if(shoesbrown.compareTo(exlShoesBrown)==0)
		{
			System.out.println("Brown shoes is match with expected result");
		}
		else
		{
			System.out.println("Brown shoes is not match with expected result");
		}
		
	}
}
