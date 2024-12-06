package stepdefination;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StoreLocatorPage;

public class CADLocatorDefinations {
	

	@When("enter Canada zipcode")
	public void enter_canada_zipcode() {
	    StoreLocatorPage storelocator = new StoreLocatorPage();
	    storelocator.zipcodefield.sendKeys("M4B 1G5");
	    storelocator.zipcodefield.sendKeys(Keys.ENTER);
	}
	@Then("Canada Stores options appear")
	public void canada_stores_options_appear() {
		StoreLocatorPage storelocator = new StoreLocatorPage();
		Assert.assertEquals(storelocator.CADlocation.getText(), "Toronto, ON M4B 3L8");
		System.out.println(storelocator);

}
}