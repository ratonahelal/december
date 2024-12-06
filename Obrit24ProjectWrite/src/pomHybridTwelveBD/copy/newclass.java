package pomHybridTwelveBD.copy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class newclass
{
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException, InterruptedException
	{
	
		
		File myfile = new File("C:\\MyTestData\\TwelveBDnew.xls");
		Workbook mywb = Workbook.getWorkbook(myfile);
		Sheet mysheet = mywb.getSheet("Store2");
		
/*		WritableWorkbook rmywb= Workbook.createWorkbook(myfile,mywb);//write mode
		WritableSheet rmysheet = rmywb.getSheet("Store2");//write mode   */
		

		Cell cellSearchBar = mysheet.getCell(0, 1);
		String SearchBar = cellSearchBar.getContents();
		System.out.println("SearchBar " + SearchBar); 
		Cell cellTestData = mysheet.getCell(1, 1);
		String TestData = cellTestData.getContents();
		System.out.println("TestData "+TestData);

		Cell cellExpectedResultItemname1 = mysheet.getCell(2, 1);
		String ExpectedResultItemname1 = cellExpectedResultItemname1.getContents();
		System.out.println("ExpectedResultItemname1 " +ExpectedResultItemname1);

		Cell cellExpectedResultItemprice1 = mysheet.getCell(3, 1);
		String ExpectedResultItemprice1 = cellExpectedResultItemprice1.getContents();
		System.out.println("ExpectedResultItemprice1 " +ExpectedResultItemprice1);
		
		Cell cellExpectedResultItemname2 = mysheet.getCell(4, 1);
		String ExpectedResultItemname2 = cellExpectedResultItemname2.getContents();
		System.out.println("ExpectedResultItemname2 " + ExpectedResultItemname2);

		Cell cellExpectedResultItemprice2 = mysheet.getCell(5, 1);
		String ExpectedResultItemprice2 = cellExpectedResultItemprice2.getContents();
		System.out.println("ExpectedResultItemprice2 " + ExpectedResultItemprice2);

		Cell cellExpectedRes = mysheet.getCell(6, 1);
		String ExpectedResult = cellExpectedRes.getContents();
		System.out.println("ExpectedResult " + ExpectedResult);
		
		System.setProperty("weddriver.ie.driver", "C:\\SeleniumServer2\\IEDriver\\IEDriverServer.exe");

		WebDriver nDriver = new EdgeDriver();
		
		HomePagePOM HPname = new HomePagePOM();
		HPname.openURL(nDriver);
		HPname.SearchIcon(nDriver).click();
		SearchPage sp = new SearchPage();
		sp.InputSearch(nDriver).sendKeys(SearchBar);
		sp.SubmitIcon(nDriver).click();
		String number = sp.numberResults(nDriver).getText();
		System.out.println(number);
	
	
		String passfailresult=null;
		String failreason=null;
		if (number.compareTo(ExpectedResult) == 0)
		
		{
			
			passfailresult="PASS";
		} 
		else
		{
			passfailresult="Fail";
			failreason= number + " did not match with expected result";
		}
/*		Label abcd = new Label(7,1,passfailresult);
		rmysheet.addCell(abcd);
		
        Label xyz = new Label(8,1,failreason);
        rmysheet.addCell(xyz);
        nDriver.close();
	
	//should be outside of the loop
	rmywb.write();// it will save now
	rmywb.close();//close the file
	*/
	}
}