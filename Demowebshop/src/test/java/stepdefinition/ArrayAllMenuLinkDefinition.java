package stepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Page.HomePage;
import Utils.BrowserHelper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayAllMenuLinkDefinition extends BrowserHelper {
	
		
	@When("I click on menu links")
	public void i_click_on_menu_links() throws InterruptedException {
		  
        ArrayList<String> itemListXpath = new ArrayList<>();

        itemListXpath.add("/html/body//ul[@class='top-menu']//a[@href='/books']");
        itemListXpath.add("/html/body//ul[@class='top-menu']//a[@href='/computers']");
        itemListXpath.add("/html/body//ul[@class='top-menu']//a[@href='/electronics']");
        itemListXpath.add("/html/body//ul[@class='top-menu']//a[@href='/apparel-shoes']");
        itemListXpath.add("/html/body//ul[@class='top-menu']//a[@href='/digital-downloads']");
        itemListXpath.add("/html/body//ul[@class='top-menu']//a[@href='/jewelry']");
        itemListXpath.add("/html/body//ul[@class='top-menu']//a[@href='/gift-cards']");
        
       
        for (int i = 0; i < itemListXpath.size(); i++) {
        	 driver.findElement(By.xpath(itemListXpath.get(i))).click();
            Thread.sleep(2000);
            if (i == itemListXpath.size() - 1) {
                break; // Break the loop after the last item
            }
        }
                
	}
	 
	public void clickMenuLink(String linkText) {
		WebElement menuLink = driver.findElement(By.linkText(linkText));
		menuLink.click();
	}

	@Then("the right page appears")
	public void the_right_page_appears() {
	 
	}



	


}


