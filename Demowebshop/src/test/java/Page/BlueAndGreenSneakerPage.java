package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class BlueAndGreenSneakerPage {
WebDriver driver;
	
	
	@FindBy(css = "select[name='product_attribute_28_7_10']")
	public WebElement ShoeSizeDropDown;

	@FindBy(css = "span[title='Green'] > .color")
	public WebElement ShoeColor;

	@FindBy(css = ".add-to-cart-button.button-1")
	public WebElement AddToCart;
	
	@FindBy(css = "li#topcartlink  .cart-label")
	public WebElement ShoppingCart;
	
	
	
	
public  BlueAndGreenSneakerPage() {
	driver = BrowserHelper.driver;
	PageFactory.initElements(driver, this); 
}

public void loadPage() {
	String currentURL = driver.getCurrentUrl();
	if (currentURL != "https://demowebshop.tricentis.com/blue-and-green-sneaker") {  
		driver.get("https://demowebshop.tricentis.com/blue-and-green-sneaker");
	}

}
}

