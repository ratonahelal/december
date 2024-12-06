package stepdefination;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StoreLocatorPage;

public class NJStoreLocatorDefinaitons {
	
	@When("enter NJ zipcode")
	public void enter_nj_zipcode() throws InterruptedException {
		StoreLocatorPage storelocator = new StoreLocatorPage();
		storelocator.zipcodefield.sendKeys("08721");
		storelocator.zipcodefield.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	 
	}
	@Then("NJ Stores options appear")
	public void nj_stores_options_appear() throws InterruptedException {
		
		
		 StoreLocatorPage storelocator = new StoreLocatorPage();
		 Thread.sleep(2000);
		    Assert.assertEquals(storelocator.NJlocation.getText(), "Forked River, NJ 08731");
	 
	}

}
