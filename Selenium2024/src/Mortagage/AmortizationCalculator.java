package Mortagage;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AmortizationCalculator 
{

	public static void main(String[] args) throws BiffException, IOException, InterruptedException 
	{
		String loanAmount = null;
		String loanTerm = null;
		String interestRate = null;
		String expectedResult = null;
		
		
		File myFile = new File("C:\\testData\\CalculatorData.xls");
		Workbook wb = Workbook.getWorkbook(myFile);
		Sheet sheet = wb.getSheet("cal");
		
		for(int x = 1; x<= sheet.getRows()-1; x++) {
		
		Cell cellbell = sheet.getCell(0, x);
		loanAmount = cellbell.getContents();
		System.out.println(loanAmount);
		
		Cell cloanTerm = sheet.getCell(1, x);
		loanTerm = cloanTerm.getContents();
		System.out.println(loanTerm);
		
		Cell cinterestRate = sheet.getCell(2, x);
		interestRate = cinterestRate.getContents();
		System.out.println(interestRate);
		
		Cell cexpectedResult = sheet.getCell(3, x);
		expectedResult = cexpectedResult.getContents();
		System.out.println(expectedResult);
		
		
		
		
		
	//	System.getProperty("webdriver.ie.driver","C:\\SeleniumServer\\IEDriver\\IEDriverServer.exe");
		
		WebDriver drv= new ChromeDriver();
		drv.get("https://www.calculator.net/amortization-calculator.html");
		
		WebElement LoanAmount= drv.findElement(By.id("cloanamount"));
		LoanAmount.clear();
		LoanAmount.sendKeys(loanAmount);
		
		WebElement LoanTerm= drv.findElement(By.id("cloanterm"));
		LoanTerm.clear();
		LoanTerm.sendKeys(loanTerm);
		
		
		WebElement InterestRate= drv.findElement(By.id("cinterestrate"));
		InterestRate.clear();
		InterestRate.sendKeys(interestRate);
		WebElement button= drv.findElement(By.name("x"));
		button.click();
		
		String resultonscreen;
		WebElement resultbox= drv.findElement(By.cssSelector(".h2result"));
		resultonscreen=resultbox.getText();
		System.out.println(resultonscreen);
		
		String resultonscreenaftercleanup=resultonscreen.replace("Monthly Pay:   ","").replace(",", "").replace("$", "");
		
		System.out.println("actualResult "+ resultonscreenaftercleanup);
		if (expectedResult.compareTo(resultonscreenaftercleanup)==0)
		{
			System.out.println("PASS");
			
		}
		else
		{
			System.out.println("FAIL"); 
		}
		drv.close();
		System.out.println();
	}
	}
}
