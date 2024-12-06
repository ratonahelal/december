package stepdefination;

import org.testng.Assert;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;
import pages.HomePage;

public class VideoPlaybackDefinations extends BrowserHelper{
	
	@Given("DIY Projects & Ideas page")
	public void diy_projects_ideas_page() {
		HomePage DIYLinkA = new HomePage();
		DIYLinkA.DIYLink.click();
	}

	@When("Click on the first video")
	public void click_on_the_first_video() throws InterruptedException {
		DIYPage DIYvideo = new DIYPage();
		Thread.sleep(5000);
		DIYvideo.DIYvideolink.click();
	}

	@Then("User can watch the first video")
	public void user_can_watch_the_first_video() throws InterruptedException {
		Thread.sleep(1500);
		String diypageURL = driver.getCurrentUrl();
		Assert.assertEquals(diypageURL, "https://www.homedepot.com/c/diy_projects_and_ideas#overlay");
	}
} 
