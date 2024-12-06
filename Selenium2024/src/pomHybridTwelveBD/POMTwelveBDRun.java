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


	public class POMTwelveBDRun {

		public static void main(String[] args) throws BiffException, IOException, InterruptedException
		{
			File myfile = new File("C:\\Users\\raton\\eclipse-workspace\\Selenium2024\\src\\pomHybridTwelveBD\\TwelveBD.xls");
			Workbook mywb = Workbook.getWorkbook(myfile);
			Sheet mysheet = mywb.getSheet("Boy");
			
			for(int i =1; i<= mysheet.getRows()-1; i++) 
			{

			Cell cellDiscountPrice = mysheet.getCell(0, i);
			String DiscountPrice = cellDiscountPrice.getContents();
			System.out.println("DiscountPrice: " +DiscountPrice);

			Cell cellSize = mysheet.getCell(1, i);
			String Size = cellSize.getContents();
			System.out.println("Size: " + Size);

			Cell cellColor = mysheet.getCell(2, i);
			String Color = cellColor.getContents();
			System.out.println("Color: " + Color);
			
			Cell cellQuantity = mysheet.getCell(3, i);
			String Quantity = cellQuantity.getContents();
			System.out.println("Quantity: " + Quantity);
			
			Cell cellER1 = mysheet.getCell(4, i);
			String ExpectedResult1 = cellER1.getContents();
			System.out.println("ExpectedResult1: " + ExpectedResult1);
			
			Cell cellER2 = mysheet.getCell(5, i);
			String ExpectedResult2 = cellER2.getContents();
			System.out.println("ExpectedResult1a: " + ExpectedResult2);
			
			Cell cellClothing1 = mysheet.getCell(6, i);
			String Clothing1 = cellClothing1.getContents();
			System.out.println("ExpectedResult2 " + Clothing1);
			
			Cell cellPrice1 = mysheet.getCell(7, i);
			String Price1 = cellPrice1.getContents();
			System.out.println("ExpectedResult2a: " + Price1);
			
			Cell cellPage = mysheet.getCell(8, i);
			String Page = cellPage.getContents();
			System.out.println("ExpectedResult3: " + Page);

			WebDriver nDriver = new EdgeDriver();
			nDriver.manage().window().maximize();
			nDriver.get("https://twelvebd.com/");
			
			POMTwelveBD nameObj = new POMTwelveBD();
			nameObj.WinterClearance(nDriver).click();
			nameObj.BoysSelection(nDriver).click();
			nameObj.Scrolldown3(nDriver);
			String ActualResultBC =nameObj.BoysClothing(nDriver).getText();
			String ActualResultDC =nameObj.DiscountPrice(nDriver).getText().replace("Tk","").replace(",", "").replace(" ", "");
			String ActualResultBC2 =nameObj.BoysClothing2(nDriver).getText();
			String ActualResultDC2 = nameObj.DiscountPrice2(nDriver).getText().replace("Tk","").replace(",", "").replace(" ", "");
			nameObj.Scrolldown(nDriver);
			nameObj.Clickrightarrow(nDriver).click();
			nameObj.Scrolldown2(nDriver);
			String ActualResult3 = nameObj.Page2of2(nDriver).getText();
			
			
			String passorfail = null; 
			
			if (ActualResultBC.equals(ExpectedResult1) && ActualResultDC.equals(ExpectedResult2))
			{
	            passorfail = "Pass";
	            System.out.println("The actual result1 matches the expected result1.");
	        } 
			else
	        {
	            passorfail = "Fail";
	            System.out.println("The actual result1 did not match the expected result1.");
	        }
	        System.out.println(passorfail);
	    	System.out.println("ActualResult BoyClothing: " + ActualResultBC);
			System.out.println("ExpectedResult1: " + ExpectedResult1);
			System.out.println("ActualResult Discount Price: " + ActualResultDC);
			System.out.println("ExpectedResult2: " + ExpectedResult2);
			System.out.println("");
	    
	        
	        if (ActualResultBC2.equals(Clothing1) && ActualResultDC2.equals(Price1))
			{
	            passorfail = "Pass";
	            System.out.println("The actual result2 matches the expected result2.");
	        } 
			else
	        {
	            passorfail = "Fail";
	            System.out.println("The actual result2 did not match the expected result2.");
	        }
	        System.out.println(passorfail);
			System.out.println("ActualResult BoyClothing1: " + ActualResultBC2);
			System.out.println("ExpectedResult1: " + Clothing1);
			System.out.println("ActualResult Discount Price2: " + ActualResultDC2);
			System.out.println("ExpectedResult2: " + Price1);
	        System.out.println("");
	        
	        if (ActualResult3.equals(Page))
			{
	            passorfail = "Pass";
	            System.out.println("The actual result3 matches the expected result3.");
	        } 
			else
	        {
	            passorfail = "Fail";
	            System.out.println("The actual result3 did not match the expected result3.");
	        }
	        System.out.println(passorfail);
	        System.out.println("ActualResult3: " + ActualResult3);
			System.out.println("ExpectedResult3: " + Page);
	        System.out.println("");
	        nDriver.close();
	    }
	}
	}