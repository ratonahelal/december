package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class Free2DaysDeliveryDefination {

@When("search for snow blower")
public void search_for_snow_blower() {
    SearchPage searchpage = new SearchPage();
    searchpage.searchInput.sendKeys("Snow Blower");
    searchpage.searchbtn.click();
}
@When("Click in free 2 days delivery")
public void click_in_free_2_days_delivery() throws InterruptedException {
    SearchPage searchpage = new SearchPage();
    searchpage.clickfreedeliverybox.click();
    Thread.sleep(2000);
}
@Then("Item list should have only for free delivery")
public void item_list_should_have_only_for_free_delivery() throws InterruptedException {
	SearchPage searchpage = new SearchPage();
	 Thread.sleep(2000);
Assert.assertEquals(searchpage.freedeliverymessage.getText(), "Get It Fast: Free 2-Day Delivery");
	
}
	}

