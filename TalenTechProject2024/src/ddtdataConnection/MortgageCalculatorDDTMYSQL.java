package ddtdataConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MortgageCalculatorDDTMYSQL
{

	public static void main(String[] args) throws SQLException
	{


			String Homeprice= null;
			String Downpayment= null;
			String InterestRate = null;
			String LoanTerm = null;
			String ExpectResult = null;
		
		
		   Connection linkontunnel= DriverManager.getConnection("JDBC:mysql://localhost:3307/TestDB2024", "root","root");
		   Statement inst=linkontunnel.createStatement();
		   
		   ResultSet res= inst.executeQuery("select * from MORTGAGEDATATABLE;");
		  	
		   while(res.next())  //<- it will loop until end
		  	{
			   Homeprice=res.getString("HOMEPRICE"); //<- get data from the column(HOMEPRICE) row by row
			   System.out.println(Homeprice);
			   
			   Downpayment=res.getString("DOWNPAYMENT");
			   System.out.println(Downpayment);
			   
			   InterestRate=res.getString("INTERESTRATE");
			   System.out.println(InterestRate);
			   
			   LoanTerm=res.getString("LOANTERM");
			   System.out.println(LoanTerm);
			   
			   ExpectResult=res.getString("EXPECTEDRESULT");
			   System.out.println(ExpectResult);
			   
				
				System.setProperty("webdriver.ie.driver", "C:\\SeleniumServer\\IEDriver\\IEDriverServer.exe");
				WebDriver mrdriver = new EdgeDriver();
				mrdriver.get("https://www.calculator.net/mortgage-calculator.html");

				WebElement homepriceelement = mrdriver.findElement(By.id("chouseprice"));
				homepriceelement.clear();
				homepriceelement.sendKeys(Homeprice);
				
				WebElement downpaymentelement = mrdriver.findElement(By.id("cdownpayment"));
				downpaymentelement.clear();
				downpaymentelement.sendKeys(Downpayment);
			   
				
				WebElement InterestRateelement = mrdriver.findElement(By.id("cinterestrate"));
				InterestRateelement.clear();
				InterestRateelement.sendKeys(InterestRate);
			   
				WebElement LoanTermelement = mrdriver.findElement(By.id("cloanterm"));
				LoanTermelement.clear();
				LoanTermelement.sendKeys(LoanTerm);
				
				WebElement calcbtn = mrdriver.findElement(By.name("x"));
				calcbtn.click();
				
				String resultonscreen;
				
				WebElement resultbox= mrdriver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/table/tbody/tr/td/h2"));
				resultonscreen=resultbox.getText();
				
				String resultonscreenaftercleanup = resultonscreen.replace("$", "").replace(",", "").replace("Monthly Pay:   ", "");
				
				System.out.println("Actual Result " + resultonscreenaftercleanup);

				if (ExpectResult.compareTo(resultonscreenaftercleanup) == 0)
				{
					System.out.println("PASS");
				} 
				else
				{
					System.out.println("FAIL");
				}
				System.out.println("");
				mrdriver.close();
		  	}
	}
}
