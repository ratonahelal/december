package stepdefinition;

import org.testng.Assert;

import Page.PracticelinkPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisableButtonDefinition {
	@Given("Practice home page open")
	public void practice_home_page_open() throws InterruptedException {
		PracticelinkPage prp = new PracticelinkPage();
		prp.loadPage();
		Thread.sleep(5000);
	}

	@When("Click Enable button")
	public void click_enable_button() throws InterruptedException {
		PracticelinkPage prp = new PracticelinkPage();
		prp.EnableButton.click();
		Thread.sleep(5000);
	}

	@When("Type On input field")
	public void type_on_input_field() throws InterruptedException {
		PracticelinkPage prp = new PracticelinkPage();
		prp.InputField.sendKeys("raton");
		Thread.sleep(5000);
	}

	@Then("Written info inside the input field")
	public void written_info_inside_the_input_field() {
		PracticelinkPage prp = new PracticelinkPage();
		Assert.assertEquals(prp.InputTitel.getText(), "");

	}

}
