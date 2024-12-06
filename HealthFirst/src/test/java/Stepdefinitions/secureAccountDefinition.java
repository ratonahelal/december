package Stepdefinitions;

import Pages.ContactPage;
import Pages.Homepage;
import Pages.secureAccount;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class secureAccountDefinition {
	@When("click contact link")
	public void click_contact_link() {
	    Homepage hp = new Homepage ();
	    hp.contact.click();
	}
	@When("click visit Your Secure account.")
	public void click_visit_your_secure_account() {
		ContactPage cp = new ContactPage ();
		cp.secureaccountlink.click();
	}
	@Then("I landed on the login page.")
	public void i_landed_on_the_login_page() {
		secureAccount sa = new secureAccount ();
		String title = sa.loginpage.getText();
		System.out.println(title);
		
		
	}
}
