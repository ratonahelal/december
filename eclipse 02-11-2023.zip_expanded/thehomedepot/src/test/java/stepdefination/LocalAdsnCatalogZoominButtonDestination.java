package stepdefination;

import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class LocalAdsnCatalogZoominButtonDestination {
	
	@When("Click Local Ads & Catalog tab")
	public void click_local_ads_catalog_tab() {
	HomePage homepage = new HomePage();
	homepage.localAdlink.click();
	}
	@When("Click Weekly Ads")
	public void click_weekly_ads() throws InterruptedException {
	HomePage homepage = new HomePage();
	BrowserHelper.driver.switchTo().frame(homepage.iframe);	
	Thread.sleep(1000);
	homepage.weeklyAdlink.click();
	
	}
	@When("Click on Zoom in buttons")
	public void click_on_zoom_in_buttons() throws InterruptedException {
		HomePage homepage = new HomePage();
		Thread.sleep(1000);
		homepage.zoominbtn.click();
		homepage.zoominbtn.click();
	}
	@Then("Display Bigger Images")
	public void display_bigger_images() {
		HomePage homepage = new HomePage();
		Assert.assertEquals(homepage.zoomlvls.getText(), "120");
	
}
	
}

