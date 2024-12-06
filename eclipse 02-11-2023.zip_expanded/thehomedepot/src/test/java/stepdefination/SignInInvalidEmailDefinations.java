package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SigninPage;

public class SignInInvalidEmailDefinations {
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
	    HomePage homepage = new HomePage();
	    homepage.loadPage();
	}
	@Given("I navigate to the loginpage")
	public void i_navigate_to_the_loginpage() throws InterruptedException {
		 HomePage homepage = new HomePage();
		    homepage.myAccount.click();
		    Thread.sleep(3000);
		    homepage.signinButton.click();
		    Thread.sleep(3000);
	}
	@When("I enter invalid email address")
	public void i_enter_invalid_email_address() {
	   SigninPage signinpage = new SigninPage();
	   signinpage.usernamefield.sendKeys("Billygately22.com");
	   
	}
	@When("click continue button")
	public void click_continue_button() {
		SigninPage signinpage = new SigninPage();
		signinpage.selectcontinuebtn.click();
	}
	@Then("Input error message will pop up")
	public void input_error_message_will_pop_up() {
		SigninPage signinpage = new SigninPage();
		Assert.assertEquals(signinpage.inputErrorMessage.getText(), "Please provide your email address, formatted as you@domain.com.");
	    
	}

}



