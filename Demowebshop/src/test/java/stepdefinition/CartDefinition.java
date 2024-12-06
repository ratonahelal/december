package stepdefinition;

import Page.BooksPage;
import Page.ComputingAndInternetPage;
import Page.HomePage;
import Page.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartDefinition {
	@Given("Demowebshop home page open")
	public void demowebshop_home_page_open() {
	   HomePage hp = new HomePage();
	   hp.loadPage();
	}
	@When("Click on Book Tab")
	public void click_on_book_tab() {
		HomePage hp = new HomePage();
		hp.BookLink.click();
		 
		
	}
	@When("Click Add  Computing and Internet Book to cart button")
	public void click_add_computing_and_internet_book_to_cart_button() {
		BooksPage bp = new BooksPage();
		bp.ComputingandInternetBooks.click();
	    
	}
	@When("Click Shopping Cart link")
	public void click_shopping_cart_link() {
		ComputingAndInternetPage co = new ComputingAndInternetPage();
		co.AddCart.click();
	    
	}
	@Then("the book is on the shopping cart page.")
	public void the_book_is_on_the_shopping_cart_page() {
		ComputingAndInternetPage co = new ComputingAndInternetPage();
		co.ShoppingCartLink.click();
		ShoppingCartPage cart = new ShoppingCartPage ();
		cart.ComputingandInternetBooksCheck.isDisplayed();
	   
	}
}
