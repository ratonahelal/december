package pomHybridTwelveBD;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class RunnerShoesAlpha {

	public static void main(String[] args) throws BiffException, IOException {
		File myfile = new File("C:\\Users\\raton\\eclipse-workspace\\TalenTechProject2024\\TwelveBD.xls");
		Workbook mywb = Workbook.getWorkbook(myfile);
		Sheet mysheet = mywb.getSheet("shoes");
		
		for(int i =1; i<= mysheet.getRows()-1; i++) 
		{
		
		Cell cellshoesblack = mysheet.getCell(2, i);
		String exlShoeBlack = cellshoesblack.getContents();
		System.out.println("shoesblack: " + exlShoeBlack);

		Cell Cellshoesbrown = mysheet.getCell(3, i);
		String exlShoesBrown = Cellshoesbrown.getContents();
		System.out.println("shoesbrown: " + exlShoesBrown);
		
		
		WebDriver Driver = new EdgeDriver();
		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.get("https://twelvebd.com/collections/shoes");
		ShoePagePom sp = new ShoePagePom();
		sp.sortdropdown1(Driver); 
	
		String halfshoes= sp.MENSHALFSHOEBLACK(Driver).getText();
		System.out.println(halfshoes);
		String shoesbrown = sp.MensShoesBrown1(Driver).getText();
		System.out.println(shoesbrown);
		
		sp.verifyMENSHALFSHOEBLACK(halfshoes,exlShoeBlack);
		sp.VerifyMensShoesBrown1(shoesbrown,exlShoesBrown);
	
		  // nDriver.close();
	}
	}
}
