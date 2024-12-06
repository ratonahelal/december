package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class secureAccount {
	WebDriver driver;
	
	@FindBy(css = ".SubmitButton-sc-1rarzen-18.hNYwql")
	public WebElement loginpage;

public secureAccount() {
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
