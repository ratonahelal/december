package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utils.BrowserHelper;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	@BeforeAll
	public static void before_all() {
		BrowserHelper.setupDriver();
		BrowserHelper.driver.get("https://www.homedepot.com/");

	}

	@AfterAll
	public static void after_all() {
		BrowserHelper.driver.close();
	}

	@After("@iframe") // <- With @iframe tag it will switch back to the main frame.
	public void switchToDefaultContent() {
		BrowserHelper.driver.switchTo().defaultContent();
	}
}
