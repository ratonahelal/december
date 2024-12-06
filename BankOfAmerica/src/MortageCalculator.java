import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MortageCalculator {

	public static void main(String[] args) {
		
		System.getProperty("webdriver.ie.driver\", \"c:\\\\SeleniunServer\\\\IEDriver\\\\IEDriverServer.exe");
		
		EdgeDriver drv= new EdgeDriver();
		drv.get("https://www.calculator.net/mortgage-calculator.html");

		WebElement hpricebox= drv.findElement(By.id("chouseprice"));
		hpricebox.clear();
		hpricebox.sendKeys("500000");

		WebElement downPayment= drv.findElement(By.id("cdownpayment"));
		downPayment.clear();
		downPayment.sendKeys("30");
		
		WebElement Loan= drv.findElement(By.id("cloanterm"));
		Loan.clear();
		Loan.sendKeys("20");
		
		WebElement Interest= drv.findElement(By.id("cinterestrate"));
		Interest.clear();
		Interest.sendKeys("6");
		
		
	}

}
