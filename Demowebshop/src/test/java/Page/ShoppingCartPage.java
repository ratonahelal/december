package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class ShoppingCartPage {
WebDriver driver;
	
	
	@FindBy(css = ".product-name")
	public WebElement ComputingandInternetBooksCheck;
	
	@FindBy(css = ".product-name")
	public WebElement BlueAndgreenSneaker;
	
	
	
	
	

public  ShoppingCartPage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://demowebshop.tricentis.com/cart") {  
		driver.get("https://demowebshop.tricentis.com/cart");
	}

}
}

