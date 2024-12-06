package Calculators;


	import java.io.File;

	import java.io.IOException;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.edge.EdgeDriver;

	import jxl.Cell;

	import jxl.Sheet;

	import jxl.Workbook;

	import jxl.read.biff.BiffException;


	public class D {



		public static void main(String[] args) throws BiffException, IOException 

		{

			String loanAmount = null;

			String loanTerm = null;

			String interestRate = null;

			String expectedResult = null;

			
			File myfile = new File("C:\\MyTestData\\MyTestData.xls");
		//	Workbook mywb = Workbook.getWorkbook(myfile);
		//	Sheet nSheet = mywb.getSheet("SaleTax");
			
	//		File myFile = new File("C:\\testData\\mortgagetestdata.xls");
			Workbook wb = Workbook.getWorkbook(myfile);
			Sheet Newsheet = wb.getSheet("SaleTax");
			
			for(int i = 1; i <= Newsheet.getRows()-1; i++) 
				
			{
			//	Cell cellTax = nSheet.getCell(0, i);
			//	loanAmount = cellTax.getContents();
			//	System.out.println("loanAmount " + loanAmount);
			
				Cell cellbell = Newsheet.getCell(0, i);
				loanAmount = cellbell.getContents();
				System.out.println(loanAmount);

				
				
				
				Cell cellBeforeTax = Newsheet.getCell(1, i);
				loanTerm = cellBeforeTax.getContents();
				System.out.println("loanTerm " + loanTerm);

				Cell cellTaxRate = Newsheet.getCell(2, i);
				interestRate = cellTaxRate.getContents();
				System.out.println("interestRate " + interestRate);

				Cell cellExpectedResult = Newsheet.getCell(3, i);
				expectedResult = cellExpectedResult.getContents();
				System.out.println("ExpectedResult " + expectedResult);
				

			
			
			
			System.setProperty("weddriver.ie.driver", "C:\\SeleniumServer2\\IEDriver\\IEDriverServer.exe");


			EdgeDriver drv= new EdgeDriver();

			drv.get("https://www.calculator.net/amortization-calculator.html");

			

			WebElement LoanAmount= drv.findElement(By.id("cloanamount"));

			LoanAmount.clear();

			LoanAmount.sendKeys("500000");

			

			WebElement LoanTerm= drv.findElement(By.id("cloanterm"));

			LoanTerm.clear();

			LoanTerm.sendKeys("30");

			

			WebElement InterestRate= drv.findElement(By.id("cinterestrate"));

			InterestRate.clear();

			InterestRate.sendKeys("7");

			WebElement calcbtn = drv.findElement(By.name("x"));
			calcbtn.click();


			String resultonscreen;

			WebElement resultbox= drv.findElement(By.xpath("//*[@id=\"content\"]/div[5]/table/tbody/tr/td/h2"));

			resultonscreen=resultbox.getText();

			System.out.println(resultonscreen);

			

			String resultonscreenaftercleanup=resultonscreen.replace("Monthly Pay:   ","").replace(",", "");

			String expectedres = "$1687.71";

			

			if (expectedres.compareTo(resultonscreenaftercleanup)==0)

			{

				System.out.print("PASS");

			}

			else

			{

				System.out.print("FAIL"); 

			}	

			}}}