package stepdefinition;


import org.testng.Assert;

import Page.HomePage;
import Page.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDefinition {
	@Given("Demo Webshop Home page open")
	public void demo_webshop_home_page_open() {
	HomePage hp = new HomePage ();
	hp.loadPage();

	}
	@When("click on register")
	public void click_on_register() {
		HomePage hp = new HomePage ();
		hp.RegisterLink.click();
		
	}
	@Then("I can landed register page")
	public void i_can_landed_register_page() {
		RegisterPage Rp = new RegisterPage ();
		Assert.assertEquals(Rp.RegisterTitel.getText(),"Register");
	}
}
