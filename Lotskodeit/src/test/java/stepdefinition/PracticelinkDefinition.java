package stepdefinition;

import org.testng.Assert;

import Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticelinkDefinition {
	
	@Given("The letskodeit home page")
	public void the_letskodeit_home_page() throws InterruptedException {
	  HomePage hp = new HomePage();
	  hp.loadPage();
	  Thread.sleep(5000);
	}
	
	@When("click on Practice link")
	public void click_on_practice_link() throws InterruptedException {
		HomePage hp = new HomePage();
		hp.Practicelink.click();
		Thread.sleep(5000);
	}
	
	
	@Then("I landed on the Practice page.")
	public void i_landed_on_the_practice_page() {
		HomePage hp = new HomePage();
		Assert.assertEquals(hp.PracticeTitle.getText(), "Practice");
	}
}
