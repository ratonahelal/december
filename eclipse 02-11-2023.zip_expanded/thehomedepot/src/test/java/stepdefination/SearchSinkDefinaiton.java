package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSinkDefinaiton {
	
//	@Given("Open Home Depot Homepage")
//	public void open_home_depot_homepage() {
//		HomePage homepage = new HomePage();
//		homepage.loadPage();
//	}
	@When("search for Sink")
	public void search_for_sink() {
		SearchPage searchpage = new SearchPage();
			searchpage.searchInput.sendKeys("Sink");
			searchpage.searchbtn.click();
		}
	   
		
	@Then("Item list should have only Sink relates products")
	public void item_list_should_have_only_sink_relates_products() {
		SearchPage searchpage = new SearchPage();
		Assert.assertEquals(searchpage.sinktitle.getText(), "Sink");
	}
}
