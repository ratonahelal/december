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

	public class RunnerShoes 
	{
		public static void main(String[] args) throws BiffException, IOException, InterruptedException
		{
			File myfile = new File("C:\\Users\\raton\\eclipse-workspace\\TalenTechProject2024\\TwelveBD.xls");
			Workbook mywb = Workbook.getWorkbook(myfile);
			Sheet mysheet = mywb.getSheet("shoes");
			
			for(int i =1; i<= mysheet.getRows()-1; i++) 
			{
			Cell cellExpectedPrice1 = mysheet.getCell(0, i);
			String ExpectedPrice1 = cellExpectedPrice1.getContents();
			System.out.println("ExpectedPrice1: " + ExpectedPrice1);

			Cell CellExpectedPrice2 = mysheet.getCell(1, i);
			String ExpectedPrice2 = CellExpectedPrice2.getContents();
			System.out.println("ExpectedPrice2: " + ExpectedPrice2);
	
			WebDriver Driver = new EdgeDriver();
			Driver.manage().deleteAllCookies();
			Driver.manage().window().maximize();
			Driver.get("https://twelvebd.com/");
			
			ShoePagePom sp = new ShoePagePom ();
			sp.ACCESSORIES(Driver).click();
			sp.Shoes(Driver).click();
			sp.sortdropdown(Driver).click();
			
			sp.priceLowToHigh(Driver).click();
			String data = sp.VerifyLow(Driver).getText().replace("Tk","").replace(",", "").replace(" ", "");
			System.out.println(data);
			
			String data1 = sp.VerifyHigh(Driver).getText().replace("Tk","").replace(",", "").replace(" ","");
			System.out.println(data1);
			sp.VerifyLowHigh1(data, ExpectedPrice1, data1, ExpectedPrice2);
		    Driver.close();
	    }
	}
	}