package stepdefinition;

import org.testng.Assert;

import Page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newsletterDefinition {
	@When("Type invalid Email address")
	public void type_invalid_email_address() {
		
	 HomePage hp = new HomePage();
	 hp.newslettertextbox.sendKeys("hello");
	}

	@And("click on subscribe box.")
	public void click_on_subscribe_box() {
		 HomePage hp = new HomePage();
		 hp.SubscribeButton.click();
	}

	@Then("I will see  Enter valid email massage.")
	public void i_will_see_enter_valid_email_massage() {
		 HomePage hp = new HomePage();
			
		Assert.assertEquals(hp.SubscribeVerify.isEnabled(), true); 
		 
	}
}
