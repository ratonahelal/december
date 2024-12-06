package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class BooksPage {
WebDriver driver;
	
	
	@FindBy(css = ".product-item  a[title='Show details for Computing and Internet'] > img[alt='Picture of Computing and Internet']")
	public WebElement ComputingandInternetBooks;

	@FindBy(css = "[data-productid='13'] .actual-price")
	public WebElement ComputingandInternet;

	
	
	
	
	
	
	
public  BooksPage() {
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

