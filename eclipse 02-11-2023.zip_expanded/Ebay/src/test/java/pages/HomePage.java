package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BrowserHelper;

public class HomePage {
	
	WebDriver driver;
	@FindBy (css = "button#gh-shop-a")
	public WebElement Categorylink;

	@FindBy (css = "[_sp='m570\\.l3413']")
	public WebElement eletroniclink;
	
	@FindBy (xpath ="/html/body//span[@class='b-pageheader__text']")
	public WebElement eletronic;
	
	public HomePage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this); // <- use this in a same class name>
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.ebay.com/") {  // <- this way it will not reload the page twice. only if the url is not the same page>
			driver.get("https://www.ebay.com/");
		}
	}
}


