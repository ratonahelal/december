package Calculators;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import jxl.Workbook;
import jxl.Cell;
import jxl.Sheet;
import jxl.read.biff.BiffException;

public class Mortgage {

	public static void main(String[] args) throws BiffException, IOException
	{
		String homepricedata = null;
		String Downpay = null;
		String Rate = null;
		String Term = null;
		String ExpectedRes = null;

		File myfile = new File("C:\\TestData\\MyTestData.xls");
		Workbook mywb = Workbook.getWorkbook(myfile);
		Sheet mysheet = mywb.getSheet(0);

		Cell cellhomeprice = mysheet.getCell(0, 1);
		homepricedata = cellhomeprice.getContents();
		System.out.println(homepricedata);

		Cell celldownpay = mysheet.getCell(1, 1);
		Downpay = celldownpay.getContents();
		System.out.println(Downpay);

		Cell cellrate = mysheet.getCell(2, 1);
		Rate = cellrate.getContents();
		System.out.println(Rate);

		Cell cellTerm = mysheet.getCell(3, 1);
		Term = cellTerm.getContents();
		System.out.println(Term);

		Cell cellExpectedRes = mysheet.getCell(7, 1);
		ExpectedRes = cellExpectedRes.getContents();
		
		
		System.out.println(ExpectedRes);
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumServer\\IEDriver\\IEDriverServer.exe");
		WebDriver mrdriver = new EdgeDriver();
		mrdriver.get("https://www.calculator.net/mortgage-calculator.html");

		WebElement homepriceelement = mrdriver.findElement(By.id("chouseprice"));
		homepriceelement.clear();
		homepriceelement.sendKeys(homepricedata);

	}

}