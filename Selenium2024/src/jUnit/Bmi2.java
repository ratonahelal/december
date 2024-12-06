package jUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;



public class Bmi2 {

	static Sheet mysheet = null;
	static Workbook mywb = null;
	static WebDriver dr = new EdgeDriver();
		
		@Test
		public void testBmiCal() throws BiffException, IOException, RowsExceededException, WriteException
		{
		
			
			// DATA DRIVEN TEST FRAMEWORK
					String ExpectResultData=null;
					String AgeData=null;
					String GenderData=null;
					String HeightData=null;
					String WeightData=null;
					// We will read data from excel file
					
					for (int i=1;i<=mysheet.getRows()-1;i++)
					{
						Cell Age = mysheet.getCell(0,i);
						AgeData=Age.getContents();
						
						
						Cell Gender = mysheet.getCell(1,i);
						GenderData=Gender.getContents();
						
						Cell Height = mysheet.getCell(2,i);
						HeightData=Height.getContents();
						
						Cell Weight = mysheet.getCell(3,i);
						WeightData=Weight.getContents();

	

						Cell ExpectResult = mysheet.getCell(4,i);
						ExpectResultData=ExpectResult.getContents();
						

						WebElement age=dr.findElement(By.id("cage"));
						age.clear();
						age.sendKeys(AgeData);
						
						
						WebElement gender =dr.findElement(By.xpath("/html/body/div[3]/div[1]/div[4]/div[2]/table/tbody/tr/td/form/table[1]/tbody/tr[2]/td[2]/label[1]/span"));
						gender.click();
						
						
						WebElement height=dr.findElement(By.name("cheightfeet"));
						height.clear();
						height.sendKeys(HeightData);
						
						
						WebElement weight=dr.findElement(By.id("cpound"));
						weight.clear();
						weight.sendKeys(WeightData);
						
						WebElement submit=dr.findElement(By.name("x"));
						submit.click();
					// i need work	
						WebElement resultonscreenelement = dr.findElement(By.xpath("//body[1]/div[3]/div[1]/div[4]/div[1]/b[1]"));
						//element fixed
						String ActualResult =resultonscreenelement.getText();
						System.out.println(ActualResult);
				
						
						String ActualResAfterClean= ActualResult.replaceAll("[^\\d.]", "");
						System.out.println(ActualResAfterClean);
						//String passfailresult=null;
						//String failreason=null;
						assertEquals(ActualResAfterClean, ExpectResultData);
					}		
		}
		@Before
		public void openurl()
		{
					
			dr.get("https://www.calculator.net/bmi-calculator.html");
		}
		
	/*	@After
		public void closeurl()
		{
			dr.close();
		}*/
		
		@BeforeClass
		public static void setproperty() throws BiffException, IOException
		{
			//System.setProperty("webdriver.chrome.driver",
					// "/Users/mahamudun/Documents/SeleniumServer/Driver/chromedriver");
			System.setProperty("webdriver.ie.driver", "c:\\SeleniunServer\\IEDriver\\IEDriverServer.exe");
			File myfile= new File("TestData\\BmiJunit1.xls");
			Workbook mywb=Workbook.getWorkbook(myfile);//Read mode
			 mysheet= mywb.getSheet("Sheet2");//read mode
		}
	
		@AfterClass
		public static void clearobjects()
		{
		dr.quit();
			
		}

	// ratonahelal@gmail.com
//"C:\testData\BmiJunit1.xls"
		
		
}
	

