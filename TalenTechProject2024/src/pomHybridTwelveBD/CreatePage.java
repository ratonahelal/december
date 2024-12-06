package pomHybridTwelveBD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreatePage {

	// click login icon
	public WebElement loginIcon(WebDriver dr)
	{
		WebElement loginIcon = dr.findElement(By.xpath("//*[@id=\"shopify-section-header\"]/div[2]/header/div/div[2]/div/a[1]"));
		return loginIcon;
	}
	//create  account
	public WebElement createaccount(WebDriver dr)
	{
		WebElement createaccount = dr.findElement(By.xpath("//*[@id=\"customer_register_link\"]"));
		return createaccount;
	}
	// first name 
	
	public WebElement firstname(WebDriver dr)
	{
		WebElement firstname = dr.findElement(By.xpath("//*[@id=\"RegisterForm-FirstName\"]"));
		return firstname;
	}
	//last name
	
	public WebElement lastname(WebDriver dr)
	{
		WebElement lastname = dr.findElement(By.xpath("//*[@id=\"RegisterForm-LastName\"]"));
		return lastname;
	}
	//email
	public WebElement email(WebDriver dr)
	{
		WebElement email = dr.findElement(By.xpath("//*[@id=\"RegisterForm-email\"]"));
		return email;
	}
	// password
	public WebElement password(WebDriver dr)
	{
		WebElement password = dr.findElement(By.xpath("//*[@id=\"RegisterForm-password\"]"));
		return password;
	}
	
	public WebElement clickcreate(WebDriver dr)
	{
		WebElement clickcreate = dr.findElement(By.xpath("//*[@id=\"RegisterForm\"]/p/input"));
		return clickcreate;
	}
	
	// verify msg   
	public WebElement verifymsg(WebDriver dr) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement verifymsg = dr.findElement(By.xpath("//*[@id=\"RegisterForm\"]/div/ul/li/a"));
		return verifymsg;
	}
		public void pwmsg (String acturalRes, String expectRes)
		{
		
		if (acturalRes.compareTo(expectRes)==0)
		{
			System.out.println("password massage match ");
		}
		
		else
		{
			System.out.println("password massage is not match");
		}
				
		}	
}
