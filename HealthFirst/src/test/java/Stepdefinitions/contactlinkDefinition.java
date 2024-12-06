package Stepdefinitions;

import org.testng.Assert;

import Pages.ContactPage;
import Pages.Homepage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class contactlinkDefinition {

@When("click on contact link")
public void click_on_contact_link() {
   Homepage hp = new Homepage ();
   hp.contact.click();
}
@Then("I landed contact Healthfirst page")
public void i_landed_contact_healthfirst_page() {
	 
 ContactPage cp = new ContactPage();

  Assert.assertEquals(cp.contacttext.getText(), "Contact Healthfirst");
}
}
