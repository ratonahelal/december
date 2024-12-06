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

public class ConversionCalculatorFootToInch extends BrowserHelper {

	@Test
	public void salesCalculator() throws BiffException, IOException, InterruptedException {

		File myfile = new File(
				"C:\\Users\\raton\\eclipse-workspace\\ArupviFramework\\src\\test\\resources\\CalculatorData.xls");

		Workbook mywb = Workbook.getWorkbook(myfile);
		Sheet mysheet = mywb.getSheet("convFootToInch");
		System.out.println("Total rows:" + mysheet.getRows());

		driver.get("https://www.calculator.net/conversion-calculator.html");
		driver.findElement(By.cssSelector("select#calFrom > option[value='9']")).click();
		driver.findElement(By.cssSelector("select#calTo > option[value='10']")).click();
		// select#calFrom > option[value='9']]

		for (int i = 1; i <= mysheet.getRows() - 1; i++) {
			Cell FootData = mysheet.getCell(0, i);
			Cell InchData = mysheet.getCell(1, i);
			String FootDatastring = FootData.getContents();
			String InchDatastring = InchData.getContents();

			WebElement footData = driver.findElement(
					By.xpath("/html//div[@id='content']//form[@name='calForm']/table//input[@name='fromVal']"));
			footData.clear();
			footData.sendKeys(FootDatastring);
			Thread.sleep(1000);
		}

	}
}
