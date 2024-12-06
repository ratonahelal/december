package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class ShopByCategoryDefinition {

	
@Given("Open Ebay Homepage")
public void open_ebay_homepage() {
 HomePage homepage = new HomePage();
 homepage.loadPage();
 
}

@When("Click on Shop By Category")
public void click_on_shop_by_category() {
	 HomePage homepage = new HomePage();
	 homepage.Categorylink.click();
}

@When("Click on electronics")
public void click_on_electronics() {
	HomePage homepage = new HomePage();
	homepage.eletroniclink.click();
}

@Then("Electronics page appear")
public void electronics_page_appear() {
	HomePage homepage = new HomePage();
	Assert.assertEquals(homepage.eletronic.getText(),"Electronics");
}
}
