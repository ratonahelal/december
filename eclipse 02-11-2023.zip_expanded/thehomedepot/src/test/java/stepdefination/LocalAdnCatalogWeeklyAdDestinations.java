package stepdefination;

import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

	
	public class LocalAdnCatalogWeeklyAdDestinations extends BrowserHelper{
		

		@When("Click Local Ad & Catalog tab")
		public void click_local_ad_catalog_tab() {
			HomePage homepage = new HomePage();
			homepage.localAdlink.click();
			
		}
		    
		@When("Click Weekly Ad")
		public void click_weekly_ad() throws InterruptedException {
			HomePage homepage = new HomePage();
			BrowserHelper.driver.switchTo().frame(homepage.iframe);	
			Thread.sleep(1000);
			homepage.weeklyAdlink.click();
		}
		    
		@Then("Displayed All Weekly Deals")
		public void displayed_all_weekly_deals() {
			HomePage homepage = new HomePage();
			String pageURL = driver.getCurrentUrl();
			Assert.assertEquals(pageURL,
					"https://www.homedepot.com/c/localad");

		}
	}
			


