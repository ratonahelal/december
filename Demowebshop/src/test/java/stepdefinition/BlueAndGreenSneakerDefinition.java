package stepdefinition;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Page.BlueAndGreenSneakerPage;
import Page.ShoppingCartPage;
import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class BlueAndGreenSneakerDefinition {
		
		@Given("Blue & Green sneaker Page")
		public void blue_green_sneaker_page() {
			BlueAndGreenSneakerPage bgshoe = new BlueAndGreenSneakerPage ();
			bgshoe.loadPage();
		    
		}
		@When("I Selected  size {int}")
		public void i_selected_size(Integer size) {
			
			BlueAndGreenSneakerPage bgshoe = new BlueAndGreenSneakerPage();
		    
		    Select shoeSizeDropDownlist = new Select(bgshoe.ShoeSizeDropDown);
		    shoeSizeDropDownlist.selectByVisibleText("8");

		    // Get the selected option's text
		    WebElement selectedOption = shoeSizeDropDownlist.getFirstSelectedOption();
		    String selectedSize =selectedOption.getText();
		   int selectedSizeint = Integer.valueOf(selectedSize);
		    
		    // Assert that the selected size matches the expected value
		    Assert.assertEquals(selectedSizeint, size);
		}

		@And("I selected Green color")
		public void i_selected_green_color() {
			BlueAndGreenSneakerPage bgshoe = new BlueAndGreenSneakerPage();
			bgshoe.ShoeColor.click();
		}

		@And("I add to cart")
		public void i_add_to_cart() {
			BlueAndGreenSneakerPage bgshoe = new BlueAndGreenSneakerPage();
			bgshoe.AddToCart.click();
		    
		}

		@Then("I will see my item on cart page")
		public void i_will_see_my_item_on_cart_page() throws InterruptedException {
			BlueAndGreenSneakerPage bgshoe = new BlueAndGreenSneakerPage();
			Thread.sleep(5000);
			bgshoe.ShoppingCart.click();
			ShoppingCartPage scp = new ShoppingCartPage ();
			String assertshoe = scp.BlueAndgreenSneaker.getText();
			Assert.assertEquals(assertshoe, "Blue and green Sneaker");
			
//			Assert.assertEquals(scp.BlueAndgreenSneaker.getText(), "Blue and green Sneaker");
		}
	}



