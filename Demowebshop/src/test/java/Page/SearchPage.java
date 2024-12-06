package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class SearchPage {
WebDriver driver;
	
	
	//@FindBy(css = "form[method='get'] > .button-1.search-box-button")
	//public WebElement SearchButton;

public  SearchPage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://demowebshop.tricentis.com/search?q=Gift+Card") {  
		driver.get("https://demowebshop.tricentis.com/search?q=Gift+Card");
	}

}
}

