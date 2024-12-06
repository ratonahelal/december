package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class StorePickUpDefinations {
	
	@When("search for wood")
	public void search_for_wood() {
		SearchPage searchpage = new SearchPage();
		searchpage.searchInput.sendKeys("Wood");
		searchpage.searchbtn.click();
	 
	}
	@When("Click in stock at Store Today")
	public void click_in_stock_at_store_today() throws InterruptedException {
		SearchPage searchpage = new SearchPage();
		searchpage.checkboxtoday.click();
	
		
	}
	@Then("available items appear for store pickup")
	public void available_items_appear_for_store_pickup() {
		SearchPage searchpage = new SearchPage();
			 Assert.assertEquals(searchpage.pickupmessage.getText(), "Get It Fast: Pick Up Today");
	}

}
