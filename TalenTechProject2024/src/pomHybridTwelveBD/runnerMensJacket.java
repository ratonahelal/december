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

	public class runnerMensJacket 
	{
		public static void main(String[] args) throws BiffException, IOException, InterruptedException
		{
			File myfile = new File("C:\\Users\\raton\\eclipse-workspace\\TalenTechProject2024\\TwelveBD.xls");
			Workbook mywb = Workbook.getWorkbook(myfile);
			Sheet mysheet = mywb.getSheet("Mens");
			
			for(int i =1; i<= mysheet.getRows()-1; i++) 
			{
				
				  Cell cellSize = mysheet.getCell(0, i); String Size = cellSize.getContents();
				  System.out.println("Size: " + Size);
				  
				  Cell cellColor = mysheet.getCell(1, i); String Color =
				  cellColor.getContents(); System.out.println("Color: " + Color);
				  
				  Cell cellQuantity = mysheet.getCell(2, i); String Quantity =
				  cellQuantity.getContents(); System.out.println("Quantity: " + Quantity);
				  
				  Cell cellER1 = mysheet.getCell(3, i); String ExpectedResult1 =
				  cellER1.getContents(); System.out.println("ExpectedResult1: " +
				  ExpectedResult1);
				 
			Cell cellER2 = mysheet.getCell(4, i);
			String ExpectedResult2 = cellER2.getContents();
			System.out.println("ExpectedResult1a: " + ExpectedResult2);
			
			Cell cellClothing1 = mysheet.getCell(5, i);
			String Clothing1 = cellClothing1.getContents();
			System.out.println("ExpectedResult2 " + Clothing1);
			
			Cell cellPrice1 = mysheet.getCell(6, i);
			String Price1 = cellPrice1.getContents();
			System.out.println("ExpectedResult2a: " + Price1);
			
			Cell cellPage = mysheet.getCell(7, i);
			String Page = cellPage.getContents();
			System.out.println("ExpectedResult3: " + Page);

			WebDriver nDriver = new EdgeDriver();
			nDriver.manage().deleteAllCookies();
			nDriver.manage().window().maximize();
			nDriver.get("https://twelvebd.com/");
			
			HomePagePOM hp = new HomePagePOM ();
			hp.Mens(nDriver).click();
			hp.jacket(nDriver).click();
			
			menJacketPage jp = new menJacketPage();
			jp.urlmatching(nDriver, ExpectedResult1);
			 nDriver.close();
			 
			jp.openurl(nDriver);
		
	      // nDriver.close();
	    }
	}
	}