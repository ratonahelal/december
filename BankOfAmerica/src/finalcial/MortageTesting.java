package finalcial;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MortageTesting {

	public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "c:\\SeleniunServer\\IEDriver\\IEDriverServer.exe");
		
		WebDriver drv= new EdgeDriver();
		drv.get("https://www.calculator.net/mortgage-calculator.html");

	}

}
