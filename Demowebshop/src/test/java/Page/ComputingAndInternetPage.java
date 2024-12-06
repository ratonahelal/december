package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class ComputingAndInternetPage {
WebDriver driver;
	
	
	@FindBy(css = ".add-to-cart-button.button-1")
	public WebElement AddCart;

	@FindBy(css = "li#topcartlink  .cart-label")
	public WebElement ShoppingCartLink;
	
	
public  ComputingAndInternetPage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://demowebshop.tricentis.com/books") {  
		driver.get("https://demowebshop.tricentis.com/books");
	}

}
}

