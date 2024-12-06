package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;

public class SearchHeaterDefinations {

	@Given("Open Home Depot Homepage")
	public void open_home_depot_homepage() {
		HomePage homepage = new HomePage();
		homepage.loadPage();
	}
	
	@When("Search for heater")
	public void search_for_heater() {
		SearchPage searchpage = new SearchPage();
		searchpage.searchInput.sendKeys("Heater");

	}

	@When("Click on Submit Search Button")
	public void click_on_submit_search_button() {
		SearchPage searchpage = new SearchPage();
		searchpage.searchbtn.click();
		
	}

	@Then("Item list should have only Heater relates products")
	public void item_list_should_have_only_heater_relates_products() {
		SearchPage searchpage = new SearchPage();
		Assert.assertEquals(searchpage.heatertitle.getText(),"Heater");

	}
}