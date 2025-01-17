package pomHybridTwelveBD;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

// taking data from the excel file and using pom to identify our elements
//data can be come out from the out sauce such as excel or database using data driven test

	public class POMTwelveBDRun3 
	{
		public static void main(String[] args) throws BiffException, IOException, InterruptedException
		{
			File myfile = new File("C:\\Users\\raton\\eclipse-workspace\\TalenTechProject2024\\TwelveBD.xls");
			Workbook mywb = Workbook.getWorkbook(myfile);
			Sheet mysheet = mywb.getSheet("Mens");
			
			for(int i =1; i<= mysheet.getRows()-1; i++) 
			{
			Cell cellSize = mysheet.getCell(0, i);
			String Size = cellSize.getContents();
			System.out.println("Size: " + Size);

			Cell cellColor = mysheet.getCell(1, i);
			String Color = cellColor.getContents();
			System.out.println("Color: " + Color);
			
			Cell cellQuantity = mysheet.getCell(2, i);
			String Quantity = cellQuantity.getContents();
			System.out.println("Quantity: " + Quantity);
			
			Cell cellER1 = mysheet.getCell(3, i);
			String ExpectedResult1 = cellER1.getContents();
			System.out.println("ExpectedResult1: " + ExpectedResult1);
			
			Cell cellER2 = mysheet.getCell(4, i);
			String ExpectedResult2 = cellER2.getContents();
			System.out.println("ExpectedResult1a: " + ExpectedResult2);
			
			Cell cellverify2 = mysheet.getCell(5, i);
			String vrfy = cellverify2.getContents();
			System.out.println("verify2 " + vrfy);
			
			Cell cellverify3 = mysheet.getCell(6, i);
			String textdata = cellverify3.getContents();
			System.out.println(textdata);
			
			Cell cellverifyPage = mysheet.getCell(7, i);
			String datatest = cellverifyPage.getContents();
			System.out.println(datatest);

			WebDriver nDriver = new EdgeDriver();
			nDriver.manage().deleteAllCookies();
			nDriver.manage().window().maximize();
			nDriver.get("https://twelvebd.com/");
			
			menJacketPage jp = new menJacketPage();
			jp.openurl(nDriver);
			
			String Product = jp.product(nDriver).getText();
			System.out.println(Product);
			jp.Scrolldown1(nDriver);
			jp.verifyPage1(Product, ExpectedResult2);
			jp.clickButton(nDriver).click();
			jp.Scrolldown2(nDriver);
			String VerifyPage2 = jp.verifyPage2(nDriver).getText();
			System.out.println(VerifyPage2);
			jp.verifyPage(VerifyPage2, vrfy);
		
		    jp.clickButton3(nDriver).click();
		    jp.Scrolldown3(nDriver);
		    String actual = jp.verifyPage(nDriver).getText();
		    System.out.println(actual);
		    jp.verifyPage3(actual, textdata);
     
		    jp.clickButton4(nDriver).click();
		    jp.Scrolldown4(nDriver);
		    String VerifyPage4 = jp.verifypage4(nDriver).getText();
		    System.out.println(VerifyPage4);
		    jp.verifyPage_4(VerifyPage4, datatest);
			
		    //click accessories label
		    
			
			
	      // nDriver.close();
	    }
	}
	}