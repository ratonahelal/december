package stepdefinition;

import org.testng.Assert;

import Page.PracticelinkPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DropDownDefinition {
	
	@Given("Practice page open")
	public void practice_page_open() {
		PracticelinkPage prp = new PracticelinkPage();
	    prp.loadPage();
	}	
	
	
	@When("click drop down list")
	public void click_drop_down_list() {
		PracticelinkPage prp = new PracticelinkPage();
		prp.DropDownMenu.click();
	}
	@When("Select BMW")
	public void select_bmw() {
		PracticelinkPage prp = new PracticelinkPage();
	   prp.BMW.click();
	}
	@Then("I only see BMW selected.")
	public void i_only_see_bmw_selected() {
		PracticelinkPage prp = new PracticelinkPage();
		Assert.assertEquals(prp.BMWTitle.getText(),"BMW");
	}
}
