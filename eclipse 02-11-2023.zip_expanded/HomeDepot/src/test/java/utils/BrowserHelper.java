package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserHelper {
public static WebDriver driver;

public static void SetupDriver() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}
}
