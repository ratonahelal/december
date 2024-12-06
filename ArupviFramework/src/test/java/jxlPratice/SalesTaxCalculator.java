package jxlPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

import utility.BrowserHelper;

public class SalesTaxCalculator extends BrowserHelper {

	@Test
	public void salesCalculator() throws BiffException, IOException, InterruptedException {

		File myfile = new File(
				"C:\\Users\\raton\\eclipse-workspace\\ArupviFramework\\src\\test\\resources\\CalculatorData.xls");
		//C:\Users\raton\eclipse-workspace\ArupviFramework\src\test\resources\CalculatorData.xls
		Workbook mywb = Workbook.getWorkbook(myfile);
		Sheet mysheet = mywb.getSheet("salesCalculatorData");
		System.out.println("Total rows:" + mysheet.getRows());
		for (int i = 1; i <= mysheet.getRows() - 1; i++) {
			Cell beforetaxData = mysheet.getCell(0, i);
			Cell aftertaxData = mysheet.getCell(1, i);
			String beforetaxstring = beforetaxData.getContents();
			String aftertaxDatastring = aftertaxData.getContents();

			driver.get("https://www.calculator.net/sales-tax-calculator.html");

			WebElement beforeTax = driver.findElement(By.cssSelector("#beforetax"));
			beforeTax.clear();
			beforeTax.sendKeys(beforetaxstring);
			WebElement salesTaxRate = driver.findElement(By.cssSelector("input[name='taxrate']"));
			salesTaxRate.clear();
			salesTaxRate.sendKeys("6");
			// calculate button
			driver.findElement(By.cssSelector("[type='submit']")).click();
			// from website
			String afterTaxPrice = driver.findElement(By.cssSelector("div:nth-of-type(3) > font > b")).getText()
					.replace("$", "");
			Assert.assertEquals(afterTaxPrice, aftertaxDatastring);
			Thread.sleep(2000);
		}
	}
}