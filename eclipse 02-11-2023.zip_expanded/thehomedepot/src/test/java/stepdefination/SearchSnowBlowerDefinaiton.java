package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchSnowBlowerDefinaiton {
	
	@When("search for SnowBlower")
	public void search_for_snowblower() {
	    SearchPage searchpage = new SearchPage();
	    searchpage.searchInput.sendKeys("Snow Blower");
	    searchpage.searchbtn.click();
	}
	@Then("Item list should have only Snow Blower relates products")
	public void item_list_should_have_only_snow_blower_relates_products() {
	    SearchPage searchpage = new SearchPage();
	    Assert.assertEquals(searchpage.snowblowertitle.getText(), "Snow Blowers");
	}	    

}
