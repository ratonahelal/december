package stepdefinition;

import org.testng.Assert;

import Page.BooksPage;
import Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BookPriceDefinition {

@Given("Open Book Page")
public void open_book_page() {
	HomePage hp = new HomePage();
	hp.BookLink.click();
}

@Then("I will see actual Book price.")
public void i_will_see_actual_book_price() {
    BooksPage bp = new BooksPage();
   String  ComputingandInternetPricetestdata = "10.00";
   String ComputingandInternetPrice = bp.ComputingandInternet.getText();
   Assert.assertEquals(ComputingandInternetPrice,
			"10.00");
}
}
