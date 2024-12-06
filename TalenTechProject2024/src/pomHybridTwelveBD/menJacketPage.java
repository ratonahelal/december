package pomHybridTwelveBD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class menJacketPage 
{
	public void urlmatching(WebDriver driver, String expectedurl)
	{
		if(driver.getCurrentUrl().compareTo(expectedurl)==0)
		{
			System.out.println("url matches with the expected url");
		}
		else
		{
			System.out.println("failed");
		}
     }
	
	public void openurl(WebDriver dr)
	{
		dr.get("https://twelvebd.com/collections/mens-jacket-collections?page=1");
	}
	public WebElement product(WebDriver dr)
	{
		WebElement productElement = dr.findElement(By.xpath("//*[@id=\"shopify-section-collection-template\"]/div/header/div[2]/div/div/div[2]/span"));
	    return productElement;
	}   
	    
	    public void verifyPage1(String acturalRes,String expectRes)
	    {
	    	if(acturalRes.compareTo(expectRes)==0)
	    	{
	    		System.out.println("85 products is matched");
	    	}
	    	else
	    	{
	    		System.out.println("85 products is not matched");
	    	}
	    }
	    
	    public void Scrolldown1(WebDriver driver) throws InterruptedException
		{	
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scroll(0,4000)", "");
		}
	    
	    public WebElement clickButton(WebDriver dr)
	    {
	    	WebElement clickbtn = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[3]/a")) ;
	    	return clickbtn;
	    }
	    
	    public void Scrolldown2(WebDriver driver) throws InterruptedException
		{	
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scroll(0,4000)", "");
		}
	    
	    public WebElement clickButton2(WebDriver dr)
	    {
	    	WebElement clickbtn2 = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[3]/a")) ;
	    	return clickbtn2;
	    }
	    
	    
	    public WebElement verifyPage2(WebDriver dr)
	    {
	    WebElement We	= dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[2]"));
	    return We;	    
	    }
	    
	    public void verifyPage(String acturalRes,String expectRes)
	    {
	    	if(acturalRes.compareTo(expectRes)==0)
	    	{
	    		System.out.println("Page 2 of 4 is matched");
	    	}
	    	else
	    	{
	    		System.out.println(" Is not matched");
	    	}
	    }
	    
	    public void Scrolldown3(WebDriver driver) throws InterruptedException
		{	
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scroll(0,4000)", "");
		}
	    
	    public WebElement clickButton3(WebDriver dr)
	    {
	    	WebElement clickbtn3 = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[3]/a")) ;
	    	return clickbtn3;
	    }
	   
	    
	    public WebElement verifyPage(WebDriver dr)
	    {
	    WebElement We = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[2]"));
	    return We;	    
	    }
	    
	    
	    public void verifyPage3(String acturalRes,String verify)
	    {
	    	if(acturalRes.compareTo(verify)==0)
	    	{
	    		System.out.println("Page 3 of 4 is match with expected result");
	    	}
	    	else
	    	{
	    		System.out.println(" Is not matched");
	    	}
	    }
	    
	      public void Scrolldown4(WebDriver driver) throws InterruptedException
		{	
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scroll(0,4000)", "");
		}
	    
	    public WebElement clickButton4(WebDriver dr)
	    {
	    	WebElement clickbtn4 = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[3]/a")) ;
	    	return clickbtn4;
	    }
	   
	    
	    public WebElement verifypage4(WebDriver dr)
	    {
	    WebElement We = dr.findElement(By.xpath("//*[@id=\"Collection\"]/ul[2]/li[2]"));
	    return We;	    
	    }
	    
	    public void verifyPage_4(String acturalRes,String verify4)
	    {
	    	if(acturalRes.compareTo(verify4)==0)
	    	{
	    		System.out.println("Page 4 of 4 is matched");
	    	}
	    	else
	    	{
	    		System.out.println(" Is not matched");
	    	}
	    	
	    }
	    
}
	

