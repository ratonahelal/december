package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class YourRecentSearchesDefinations {
	
	@When("search for Glue Guns")
	public void search_for_glue_guns() throws InterruptedException {
		SearchPage searchpage = new SearchPage();
		searchpage.searchInput.sendKeys("Glue Guns");
		searchpage.searchInput.click();
		Thread.sleep(3000);
	}
	@When("search for Paint on the search")
	public void search_for_paint_on_the_search() throws InterruptedException {
	    SearchPage searchpage = new SearchPage();
	    searchpage.searchInput.clear();
		searchpage.searchInput.sendKeys("Paint");
		searchpage.searchInput.click();
		Thread.sleep(3000);
	}
	@Then("all the recent search items appear")
	public void all_the_recent_search_items_appear() {
		SearchPage searchpage = new SearchPage();
		searchpage.searchInput.clear();
		searchpage.searchInput.click();
		Assert.assertEquals(searchpage.yourrecentsearchmessage.getText(), "Your recent searches");

}
	}

