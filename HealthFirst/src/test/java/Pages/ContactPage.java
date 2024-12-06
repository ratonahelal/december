package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class ContactPage {
	WebDriver driver;
	
	@FindBy(css = "h1")
	public WebElement contacttext;
	
	@FindBy(css = "[class='col-md-8'] [target]")
	public WebElement secureaccountlink;
	
	

public ContactPage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://healthfirst.org/contact") {  
		driver.get("https://healthfirst.org/contact");
	}
}
}
