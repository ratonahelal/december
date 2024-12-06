package pomHybridTwelveBD;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

	public class POMTwelveBDRun2
	{

		public static void main(String[] args) throws BiffException, IOException, InterruptedException
		{
			File myfile = new File("C:\\MyTestData\\TwelveBD.xls");
			Workbook mywb = Workbook.getWorkbook(myfile);
			Sheet mysheet = mywb.getSheet("Boy");
			
			for(int i = 1; i <=mysheet.getRows()-1; i ++)
			{
			Cell cellDiscountPrice= mysheet.getCell(0, i);
			String DiscountPrice = cellDiscountPrice.getContents();
			System.out.println("DiscountPrice " + DiscountPrice);
			
			Cell cellSize= mysheet.getCell(1, i);
			String Size = cellSize.getContents();
			System.out.println("Size " + Size);
			
			Cell cellColor = mysheet.getCell(2, i);
			String Color = cellColor.getContents();
			System.out.println("Color " + Color);
			
			Cell cellQuantity= mysheet.getCell(3, i);
			String Quantity = cellQuantity.getContents();
			System.out.println("Quantity " + Quantity);
			
			Cell cellER1= mysheet.getCell(4, i);
			String ExpectedResult1 = cellER1.getContents();
			System.out.println("ExpectedResult1 " + ExpectedResult1);
			
			Cell cellER2= mysheet.getCell(5, i);
			String ExpectedResult2 = cellER2.getContents();
			System.out.println("ExpectedResult2 " + ExpectedResult2);

			Cell cellClothing1= mysheet.getCell(6, i);
			String Clothing1 = cellClothing1.getContents();
			System.out.println("Clothing1 " + Clothing1);		 	
					
			Cell cellPrice1= mysheet.getCell(7, i);
			String Price = cellClothing1.getContents();
			System.out.println("Price " + Price);		 	
					
			Cell cellPage= mysheet.getCell(8, i);
			String Page = cellPage.getContents();
			System.out.println("Page " + Page);	
			
			WebDriver nDriver = new EdgeDriver();
			nDriver.manage().window().maximize();
			nDriver.get("https://twelvebd.com/");
			
			POMTwelveBD2 nameobj = new POMTwelveBD2();
			nameobj.WinterClearance(nDriver).click();
			nameobj.BoysSelection(nDriver).click();
			nameobj.ScrollDown(nDriver);
			
	
			String DiscountPrice1 = nameobj.DiscountPrice(nDriver).getText().replace("Tk", "").replace(",", "").replace(" ", "");
			String BoysClothing2 = nameobj.BoysClothing2(nDriver).getText();
			String DiscountPrice2 =nameobj.DiscountPrice2(nDriver).getText().replace("Tk", "").replace(",", "").replace(" ", "");
			
			String AcutalResult1=  nameobj.BoysClothing(nDriver).getText();
			String AcutalResult2= DiscountPrice1;
			String AcutalResult3= BoysClothing2;
			String AcutalResult4= DiscountPrice2;
			
			
			if (AcutalResult1.compareTo(ExpectedResult1)==0 && (AcutalResult2.compareTo(ExpectedResult2)==0))
	{
	System.out.println("The Actual Result1 matches with Expected Result1");
	}
	else
	{
		System.out.println("The Actual Result1 did not match with Expected Result1" );
	}
							
			}}}