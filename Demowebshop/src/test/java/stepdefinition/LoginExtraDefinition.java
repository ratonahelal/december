package stepdefinition;

import java.util.Map;

import org.testng.Assert;

import Page.BooksPage;
import Page.ComputingAndInternetPage;
import Page.HomePage;
import Page.LoginPage;
import Page.ShoppingCartPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginExtraDefinition {
	@When("I click on login link")
	public void i_click_on_login_link() {
		HomePage hp = new HomePage();
		hp.LoginLink.click();

	}

	@When("I enter username and password")
	public void i_enter_username_and_password(DataTable dataTable) {
		Map<String, String> usernamepass = dataTable.asMap(String.class, String.class);
		
		String Username = usernamepass.get("username");
		String Password = usernamepass.get("password");

		LoginPage lp = new LoginPage();
		lp.EmailField.sendKeys(Username);
		lp.PasswordField.sendKeys(Password);

	}

	@When("I click on Remember me")
	public void i_click_on_remember_me() {

	}

	@When("I click on login")
	public void i_click_on_login() {

		LoginPage lp = new LoginPage();
		lp.LoginButton2.click();
	}

	@When("I will be logged in")
	public void i_will_be_logged_in() {

		/// Assertion
	}

	@Then("I click on Log out")
	public void i_click_on_log_out() {
		HomePage hp = new HomePage();
		hp.LogoutLink.click();
		Assert.assertEquals(hp.LoginLink.isDisplayed(), true);

	}

}
