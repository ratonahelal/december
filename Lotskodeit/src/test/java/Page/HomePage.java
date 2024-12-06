package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class HomePage {
WebDriver driver;
	
	@FindBy(css = "[data-id='547247'] .dynamic-link")
	public WebElement Practicelink;
	
	@FindBy(xpath = "//*[@id=\"page\"]/div[2]/div[2]/div/div/div/div/h1")
	public WebElement PracticeTitle;
	
	

public HomePage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://www.letskodeit.com/") {  
		driver.get("https://www.letskodeit.com/");
	}
}
}

