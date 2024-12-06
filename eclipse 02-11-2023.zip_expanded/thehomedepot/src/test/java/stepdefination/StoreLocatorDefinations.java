package stepdefination;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.StoreLocatorPage;

public class StoreLocatorDefinations extends BrowserHelper{
	 
	
	
	
	@When("click store finder link")
	public void click_store_finder_link() {
		StoreLocatorPage storelocator = new StoreLocatorPage();
		storelocator.storelocatorlink.click();
		
	
	}
	@When("enter NY zipcode")
	public void enter_ny_zipcode() {
			StoreLocatorPage storelocator = new StoreLocatorPage();
		storelocator.zipcodefield.sendKeys("11550");
		storelocator.zipcodefield.sendKeys(Keys.ENTER);
		
	    
	}
	@Then("NY Stores options appear")
	public void ny_stores_options_appear() {
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL,
				"https://www.homedepot.com/l/search/11550");
	    
	}

}



