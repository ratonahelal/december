package Stepdefinitions;

import org.testng.Assert;

import Pages.Homepage;
import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class healthfirsturlDefinition extends BrowserHelper  {

@Given("Enter to healthfirst url.")
public void enter_to_healthfirst_url() {
    Homepage hp = new Homepage();
    hp.loadPage();
}

@When("healthfirst home page open")
public void healthfirst_home_page_open() {
	String pageURL = driver.getCurrentUrl();
	Assert.assertEquals(pageURL,
			"https://healthfirst.org/");
}

}

//String pageURL = driver.getCurrentUrl();
//Assert.assertEquals(pageURL,
		//"https://www.homedepot.com/c/localad");