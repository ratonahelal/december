package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class PracticelinkPage {
	
WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"carselect\"]")
	public WebElement DropDownMenu;

	@FindBy(xpath = "//*[@id=\"carselect\"]/option[1]")
	public WebElement BMW;
	
	@FindBy(xpath = "//*[@id=\"carselect\"]/option[1]")
	public WebElement BMWTitle;
	
	
@FindBy(css = "[value='Disable']")
 public WebElement DisableButton;
			
	@FindBy(xpath = "/html//input[@id='enabled-example-input']")
	public WebElement InputField;
	
	@FindBy(xpath = "/html//input[@id='enabled-example-input']")
	public WebElement InputTitel;
	
	
	@FindBy(xpath = "//*[@id=\"enabled-button\"]")
	public WebElement EnableButton;
	
	
			
public PracticelinkPage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://www.letskodeit.com/practice") {  
		driver.get("https://www.letskodeit.com/practice");
	}
}
}

