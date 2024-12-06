package Stepdefinitions;

import Utils.BrowserHelper;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	@BeforeAll
	public static void before_all() {
		BrowserHelper.setupDriver();
		BrowserHelper.driver.get("https://healthfirst.org/");

	}

	@AfterAll
	public static void after_all() {
		BrowserHelper.driver.close();
	}
}
