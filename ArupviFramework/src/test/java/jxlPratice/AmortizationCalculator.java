package jxlPratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import utility.BrowserHelper;

public class AmortizationCalculator extends BrowserHelper {

	@Test
	public void calculator() throws BiffException, IOException, InterruptedException {

		File myfile = new File(
				"C:\\Users\\raton\\eclipse-workspace\\ArupviFramework\\src\\test\\resources\\CalculatorData.xls");

		Workbook mywb = Workbook.getWorkbook(myfile);
		Sheet mysheet = mywb.getSheet("AmortizationCalculator");
		System.out.println("Total rows:" + mysheet.getRows());

		driver.get("https://www.calculator.net/amortization-calculator.html");

		for (int i = 1; i <= mysheet.getRows() - 1; i++) {
			Cell Loanamount = mysheet.getCell(0, i);
			Cell Loanterm = mysheet.getCell(1, i);
			Cell Interestrate = mysheet.getCell(2, i);
			Cell MonthlyPay = mysheet.getCell(3, i);

			String LoanamountString = Loanamount.getContents();
			String LoantermString = Loanterm.getContents();
			String InterestrateString = Interestrate.getContents();
			String MonthlyPayString = MonthlyPay.getContents();

			WebElement LoanAmount = driver.findElement(By.id("cloanamount"));
			LoanAmount.clear();
			LoanAmount.sendKeys(LoanamountString);

			WebElement LoanTerm = driver.findElement(By.id("cloanterm"));
			LoanTerm.clear();
			LoanTerm.sendKeys(LoantermString);

			WebElement InterestRate = driver.findElement(By.id("cinterestrate"));
			InterestRate.clear();
			InterestRate.sendKeys(InterestrateString);

			driver.findElement(By.cssSelector("input[name='x']")).click();

			WebElement resultbox = driver.findElement(By.cssSelector(".h2result"));
			String resultonscreen = resultbox.getText();
			System.out.println(resultonscreen);

			String resultonscreenaftercleanup = resultonscreen.replace("Monthly Pay:   ", "").replace(",", "");

			if (MonthlyPayString.compareTo(resultonscreenaftercleanup) == 0) {
				System.out.print("PASS");
			} else {
				System.out.print("FAIL");
			}
		}
	}
}
