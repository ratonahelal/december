package stepdefinition;

import Page.HomePage;
import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition {

@When("Click on login")
public void click_on_login() {
   HomePage hp = new HomePage ();
   hp.LoginLink.click();
}

@And("Type on email address & Password")
public void type_on_email_address_password() {
    LoginPage lp = new LoginPage();
   lp.EmailField.sendKeys("mrjon@gmail.com");
   lp.PasswordField.sendKeys("mrjon123456");
}

@And("Click on login button")
public void click_on_login_button() {
	LoginPage lp = new LoginPage();
	lp.LoginButton2.click();	
	
}

@Then("I will be logged in.")
public void i_will_be_logged_in() {
	HomePage hp = new HomePage ();
	hp.LogoutLink.isDisplayed()
;	
}

}
