package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class LoginPage {
WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"Email\"]")
	public WebElement EmailField;
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	public WebElement PasswordField;
	
	@FindBy(css = ".button-1.login-button")
	public WebElement LoginButton2;
	
public LoginPage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://demowebshop.tricentis.com/") {  
		driver.get("https://demowebshop.tricentis.com/");
	}

}
}
