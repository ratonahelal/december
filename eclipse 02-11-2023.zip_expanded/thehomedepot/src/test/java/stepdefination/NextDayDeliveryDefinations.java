package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class NextDayDeliveryDefinations {
	
	@When("search for Nails")
	public void search_for_nails() {
		SearchPage searchpage = new SearchPage();
	    searchpage.searchInput.sendKeys("Nails");
	    searchpage.searchbtn.click();
	}
	@When("Click in Next day delivery")
	public void click_in_next_day_delivery() {
		SearchPage searchpage = new SearchPage();
		searchpage.clicknextdaybox.click();
	}
	   
	@Then("Item list should have only delivery scheduled")
	public void item_list_should_have_only_delivery_scheduled() {
		SearchPage searchpage = new SearchPage();
		Assert.assertEquals(searchpage.nextdaydeliverymessage.getText(), "[Get It Fast: Next-Day Delivery");
		
	}
	   
	}


