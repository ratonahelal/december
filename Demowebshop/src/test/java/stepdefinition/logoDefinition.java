package stepdefinition;

import org.testng.Assert;

import Page.HomePage;
import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logoDefinition extends BrowserHelper {

	@Given("Open Demowebshop Homepage")
	public void open_demowebshop_homepage() {
		HomePage hp = new HomePage ();
			hp.loadPage();
	}

	@When("Click Demowebshop Logo")
	public void click_demowebshop_logo() {
		HomePage hp = new HomePage ();
		hp.demologo.click();
	}

	@Then("The page will refresh to home page.")
	public void the_page_will_refresh_to_home_page() {
		
		String pageURL = driver.getCurrentUrl();
		Assert.assertEquals(pageURL,
				"https://demowebshop.tricentis.com/");
	}
}
