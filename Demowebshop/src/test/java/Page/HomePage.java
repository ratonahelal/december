package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class HomePage {
WebDriver driver;
	
	@FindBy(css = "img[alt='Tricentis Demo Web Shop']")
	public WebElement demologo;
	
	@FindBy(css = "img[alt='Tricentis Demo Web Shop']")
	public WebElement demoTitle;
	
	
	@FindBy(css = ".ico-register")
	public WebElement RegisterLink;

	@FindBy(css = ".top-menu > li:nth-of-type(1) > a")
	public WebElement BookLink;
	
	@FindBy(css = ".ico-login")
	public WebElement LoginLink;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public WebElement LogoutLink;
	
	@FindBy(css = "input#small-searchterms")
	public WebElement Searchstore;
	
	@FindBy(css = "form[method='get'] > .button-1.search-box-button")
	public WebElement SearchButton;
	
	
	@FindBy(css = "input#newsletter-email")
	public WebElement newslettertextbox;
	
	
	@FindBy(css = "input#newsletter-subscribe-button")
	public WebElement SubscribeButton;
	

	 @FindBy(xpath = "html/body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]")
		public WebElement SubscribeVerify;
	
	// all link check
	 @FindBy(linkText = "BOOKS")
		public WebElement bookslink;
	
	
	
public HomePage() {
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
