package pomHybridTwelveBD;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class RunnerCreateBD {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		File myfile = new File("C:\\Users\\raton\\eclipse-workspace\\TalenTechProject2024\\TwelveBD.xls");
		Workbook mywb = Workbook.getWorkbook(myfile);
		Sheet mysheet = mywb.getSheet("create");
		
		for(int i =1; i<= mysheet.getRows()-1; i++) 
		{
		// FirstName			
		Cell cellFirstName = mysheet.getCell(0, i);
		String exlfirstname = cellFirstName.getContents();
		System.out.println("1st name: " + exlfirstname);
		
		//LastName
		Cell CellLastName = mysheet.getCell(1, i);
		String exllastname = CellLastName.getContents();
		System.out.println("lastName: " + exllastname);
		
		//Email
		Cell CellEmail = mysheet.getCell(2, i);
		String exlemail = CellEmail.getContents();
		System.out.println("EMAIL: " + exlemail);
		
		//Password
		Cell CellPassword = mysheet.getCell(3, i);
		String exlpassword = CellPassword.getContents();
		System.out.println("pswd: " + exlpassword);
		
		//
		Cell CellExpectedResult = mysheet.getCell(4, i);
		String exlCellexpectedresult = CellExpectedResult.getContents();
		System.out.println("msg result: " + exlCellexpectedresult);
		
		WebDriver Driver = new EdgeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.get("https://twelvebd.com");
		CreatePage cp = new CreatePage();
		cp.loginIcon(Driver).click();
		cp.createaccount(Driver).click();
		cp.firstname(Driver).sendKeys(exlfirstname);
		cp.lastname(Driver).sendKeys(exllastname);
		cp.email(Driver).sendKeys(exlemail);
		cp.password(Driver).sendKeys(exlpassword);
		cp.clickcreate(Driver).click();		
		String popofmsg = cp.verifymsg(Driver).getText();
		System.out.println(popofmsg);
		cp.pwmsg(popofmsg, exlCellexpectedresult);
	}

}
	}
