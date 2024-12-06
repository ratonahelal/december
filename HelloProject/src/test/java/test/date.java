package test;

import org.testng.annotations.Test;

import Utils.BrowserHelper;

public class date extends BrowserHelper {

	@Test
	public void visitGoogle() {
		driver.get("https://www.google.com/");
	}
	
	
}
