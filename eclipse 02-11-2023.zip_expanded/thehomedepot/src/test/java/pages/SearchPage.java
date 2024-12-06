package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPage {
	
	
	WebDriver driver;
	
	@FindBy(id ="headerSearch")
	public WebElement searchInput;
	
	@FindBy(id = "headerSearchButton")
	public WebElement searchbtn;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div/div/h1")
	public WebElement heatertitle;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div")
	public WebElement sinktitle;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[2]/div/div")
	public WebElement snowblowertitle;
	
	@FindBy (css ="[for='1z175a5-0']")
	public WebElement checkboxtoday;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div[3]/div/div[5]/div[1]/div/button/span")
	public WebElement pickupmessage;
	
	@FindBy (xpath = "//*[@id=\"browse-search-pods-1\"]/div[1]/div/div[3]/a/div/img[2]")
	public WebElement clickimageproduct;
	
	@FindBy (css = ".card-deck.fulfillment__content-wrapper > a:nth-of-type(1)")
	public WebElement clickpickupbtn;
	
	@FindBy (xpath = "//*[@id=\"browse-search-dimensions\"]/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement clickfreedeliverybox;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div[3]/div/div[5]/div[1]/div/button")
	public WebElement freedeliverymessage;
	
	@FindBy (xpath ="//*[@id=\"browse-search-dimensions\"]/div/div[1]/div/div[2]/div/div[4]/div")
	public WebElement clicknextdaybox;
	
	@FindBy (xpath ="//*[@id=\"root\"]/div/div[3]/div/div[5]/div[1]/div/button/span")
	public WebElement nextdaydeliverymessage;
	
	@FindBy (xpath = "//*[@id=\"searchHistory\"]/div/div[1]")
	public WebElement yourrecentsearchmessage;
	
	@FindBy (xpath = "//*[@id=\"media-gallery\"]/div/div/div[1]/div[3]/button")
	public WebElement mediagallery;
	
	@FindBy (xpath = "//*[@id=\"thd-brightcove-iframe-4687710888001_1672679805099\"]")
	public WebElement iframe;
	
	@FindBy (xpath ="//*[@id=\"vjs_video_3\"]")
	public WebElement playmedia;
	
	@FindBy (xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div[3]/div/div/div[10]/div/div/div[4]/div/div/div[2]/div[1]/div/div/button")
	public WebElement addtocartbtn;
	
	@FindBy(xpath = "/html//div[@id='root']")
		public WebElement clickveiwcartbtn;
	
	public SearchPage() {
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
