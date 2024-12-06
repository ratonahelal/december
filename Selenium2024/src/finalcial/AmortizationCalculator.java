package finalcial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmortizationCalculator 
{

	public static void main(String[] args) 
	{
		
		System.getProperty("webdriver.ie.driver\", \"c:\\SeleniunServer\\IEDriver\\IEDriverServer.exe");
		
		
		EdgeDriver drv= new EdgeDriver();
		drv.get("https://www.calculator.net/amortization-calculator.html");
		
	
		WebElement LoanAmount= drv.findElement(By.id("cloanamount"));
		
		WebElement loan = drv.findElement(By.id(" cloanamount"));
		loan .clear();
		loan.sendKeys("5000");
		
		// cloanamount
		LoanAmount.clear();
		LoanAmount.sendKeys("500000");
		
		WebElement LoanTerm= drv.findElement(By.id("cloanterm"));
		LoanTerm.clear();
		LoanTerm.sendKeys("30");
		
		WebElement InterestRate= drv.findElement(By.id("cinterestrate"));
		InterestRate.clear();
		InterestRate.sendKeys("7");
		
		String resultonscreen;
		WebElement resultbox= drv.findElement(By.xpath("//*[@id=\"content\"]/div[5]/table/tbody/tr/td/h2"));
		
		resultonscreen=resultbox.getText();
		System.out.println(resultonscreen);
		
		String resultonscreenaftercleanup=resultonscreen.replace("Monthly Pay:   ","").replace(",", "");
		String expectedres = "$1687.71";
		
		if (expectedres.compareTo(resultonscreenaftercleanup)==0)
		{
			System.out.print("PASS");
		}
		else
		{
			System.out.print("FAIL"); 
		}	
	}
}
