package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class RegisterPage {
WebDriver driver;
	
	
	@FindBy(css = "h1")
	public WebElement RegisterTitel;

public RegisterPage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://demowebshop.tricentis.com/register") {  
		driver.get("https://demowebshop.tricentis.com/register");
	}

}
}

