package stepdefination;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DIYPage;
import pages.HomePage;

public class DiyPageClickDefinations {
	
	@When("Click on the DIY Projects & Ideas menu")
	public void click_on_the_diy_projects_ideas_menu() {
		HomePage DIYLinkA = new HomePage();
		DIYLinkA.DIYLink.click();
	}
	@Then("DIY Projects & Ideas page appears")
	public void diy_projects_ideas_page_appears() {
		DIYPage DIYLinkB = new DIYPage();
		Assert.assertEquals(DIYLinkB.DIYText.getText(), "DIY Projects and Ideas");
	
}

}

