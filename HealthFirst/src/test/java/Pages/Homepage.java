package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class Homepage {
	WebDriver driver;
	
	@FindBy(css = ".align-items-center.d-flex.nav-right > ul > li:nth-of-type(2) > a")
	public WebElement contact;

	

	@FindBy(css = "h1")
	public WebElement contacttext;

public Homepage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://healthfirst.org/") {  
		driver.get("https://healthfirst.org/");
	}
}
}
