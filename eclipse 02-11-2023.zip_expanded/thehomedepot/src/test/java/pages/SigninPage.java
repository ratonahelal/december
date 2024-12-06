package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utils.BrowserHelper;

public class SigninPage {

	WebDriver driver;


	@FindBy(id = "username")
	public WebElement usernamefield;
	
	@FindBy(css = "form  .bttn__content")
	public WebElement selectcontinuebtn;
	
	@FindBy(css =".error-enter-done.form-input-error__message.u__block")
	public WebElement inputErrorMessage;
	
	@FindBy(xpath = "//*[@id=\"EZDrawer__container\"]/div/div[4]/button")
	public WebElement nothanks;
	
	@FindBy(id = "password-input-field")
	public WebElement passwordfield;
	

	public SigninPage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this);

	}
	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/auth/view/signin?redirect=/&ref=null") {
			driver.get("https://www.homedepot.com/auth/view/signin?redirect=/&ref=null");
		}
	}
}
