package stepdefinition;

import org.testng.Assert;

import Page.HomePage;
import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchDefinition extends BrowserHelper {

	@Given("Open home Page")
	public void open_home_page() {
	   HomePage hp = new HomePage();
	   hp.loadPage();
	}
	
	
	@When("click on Search bar")
	public void click_on_search_bar() {
		HomePage hp = new HomePage();
		hp.Searchstore.click();
	}

	@When("Type on gift card")
	public void type_on_gift_card() {
		HomePage hp = new HomePage();
		hp.Searchstore.sendKeys("Gift Card");
	}

	@When("click on search button")
	public void click_on_search_button() {
		HomePage hp = new HomePage();
		hp.SearchButton.click();
	}


    @Then("I will see all the gift card options")
    public void i_will_see_all_the_gift_card_options() {
   	
	String pageURL = driver.getCurrentUrl();
	Assert.assertEquals(pageURL,
			"https://demowebshop.tricentis.com/search?q=Gift+Card");
	}
}

