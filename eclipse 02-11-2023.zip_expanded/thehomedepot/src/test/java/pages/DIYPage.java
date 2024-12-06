package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class DIYPage {
	

	WebDriver driver;

	@FindBy(css = "[class='section-heading__text--6fd88 section-heading__text--plain--6fd88']")
	public WebElement DIYText;
	
	@FindBy(xpath ="/html//iframe[@role='presentation']")
			public WebElement iframe;
	
	//@FindBy(xpath ="[class] .visualNav__container-sm [link-id='EtchVisualNav_thd_4d2d']:nth-of-type(1)")
	//public WebElement DIYvideolink;
	
	
	@FindBy(xpath = "//div[@id='topguides']/div[2]//div[@class='EtchVisualNav']/nav/div[1]/span[1]/img[@alt=' ']")
	public WebElement DIYvideolink;

	@FindBy(linkText = "DIY Wood Projects")
	public WebElement DIYwoodlink;

	@FindBy(css = "#tgw6")
	public WebElement DIYwoodkitchenlink;

	@FindBy(css = "[class='pill-text--12gxt']")
	public WebElement kitchenMessage;

	public DIYPage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this);
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/") { // <- this way it will not reload the page twice. only if the
															// url is not the same page>
			driver.get("https://www.homedepot.com/");
		}
	}
}
