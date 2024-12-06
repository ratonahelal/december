package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class LocalAdnCatalogZoomOutDefinations {
	
	@When("Click on Zoom out button")
	public void click_on_zoom_out_button() {
	    HomePage homepage = new HomePage();
	    homepage.zoomoutbtn.click();
	}
	@Then("Display Smaller Images")
	public void display_smaller_images() {
		 HomePage homepage = new HomePage();
		 Assert.assertEquals(homepage.zoomlvls.getText(), "90");
	}

}
