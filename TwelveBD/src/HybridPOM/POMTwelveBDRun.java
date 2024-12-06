package HybridPOM;

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

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		File myfile = new File("C:\\Users\\raton\\eclipse-workspace\\TwelveBD\\TwelveBD.xls");
		Workbook mywb = Workbook.getWorkbook(myfile);
		Sheet mysheet = mywb.getSheet("Store");

		Cell cellSearchPant = mysheet.getCell(0, 1);
		String SearchPant = cellSearchPant.getContents();
		System.out.println("Expected Result1: " + SearchPant);

		Cell cellSearchSPchar = mysheet.getCell(1, 1);
		String SearchSPchar = cellSearchSPchar.getContents();
		System.out.println("Expected Result2: " + SearchSPchar);

		Cell cellSearchNum = mysheet.getCell(2, 1);
		String SearchNum = cellSearchNum.getContents();
		System.out.println("Expected Result2: " + SearchNum);

		Cell cellEmail = mysheet.getCell(3, 1);
		String ExpectedRes1 = cellEmail.getContents();
		System.out.println("Expected Result3: " + ExpectedRes1);

		Cell cellHotlineNumber = mysheet.getCell(4, 1);
		String ExpectedRes2 = cellHotlineNumber.getContents();
		System.out.println("Expected Result4: " + ExpectedRes2);

		Cell cellER1 = mysheet.getCell(5, 1);
		String ExpectedResult1 = cellER1.getContents();
		System.out.println("Expected Result5: " + ExpectedResult1);

		Cell cellER2 = mysheet.getCell(6, 1);
		String ExpectedResult2 = cellER2.getContents();
		System.out.println("Expected Result6: " + ExpectedResult2);

		Cell cellER3 = mysheet.getCell(7, 1);
		String ExpectedResult3 = cellER3.getContents();
		System.out.println("Expected Result7: " + ExpectedResult3);

		Cell cellPrice1 = mysheet.getCell(8, 1);
		String Price1 = cellPrice1.getContents();
		System.out.println("Expected Result8: " + Price1);

		Cell cellPage = mysheet.getCell(9, 1);
		String Page = cellPage.getContents();
		System.out.println("Expected Result9: " + Page);

		Cell cellInput1 = mysheet.getCell(0, 3);
		String TestData1 = cellInput1.getContents();
		System.out.println("Test Data1: " + TestData1);

		Cell cellInput2 = mysheet.getCell(1, 3);
		String TestData2 = cellInput2.getContents();
		System.out.println("Test Data2: " + TestData2);

		Cell cellInput3 = mysheet.getCell(2, 3);
		String TestData3 = cellInput3.getContents();
		System.out.println("Test Data3: " + TestData3);

		Cell cellInput4 = mysheet.getCell(3, 3);
		String TestData4 = cellInput4.getContents();
		System.out.println("Test Data4: " + TestData4);
		//
		Cell cellExpRes = mysheet.getCell(0, 5);
		String SortBy = cellExpRes.getContents();
		System.out.println("Expected Results:" + "  " + SortBy);

		Cell cellCheckingOrder1 = mysheet.getCell(1, 5);
		String Order1 = cellCheckingOrder1.getContents();
		System.out.println("CheckingOrder1:" + "  " + Order1);

		Cell cellCheckingOrder2 = mysheet.getCell(2, 5);
		String Order2 = cellCheckingOrder2.getContents();
		System.out.println("CheckingOrder2:" + "  " + Order2);

		Cell cellSelectedItems1 = mysheet.getCell(3, 5);
		String Item1 = cellSelectedItems1.getContents();
		System.out.println("SelectedItem:" + "  " + Item1);

		Cell cellTotal1 = mysheet.getCell(4, 5);
		String Total1 = cellTotal1.getContents();
		System.out.println("Total1:" + "  " + Total1);

		Cell cellSelectedItems2 = mysheet.getCell(5, 5);
		String Items2 = cellSelectedItems2.getContents();
		System.out.println("Expected Results3:" + "  " + Items2);

		Cell cellFinalStep = mysheet.getCell(6, 5);
		String FinalStep = cellFinalStep.getContents();
		System.out.println("FinalStep:" + "  " + FinalStep);

		Cell cellExpectedPrice1 = mysheet.getCell(0, 7);
		String ExpectedPrice1 = cellExpectedPrice1.getContents();
		System.out.println("ExpectedPrice1: " + ExpectedPrice1);

		Cell CellExpectedPrice2 = mysheet.getCell(1, 7);
		String ExpectedPrice2 = CellExpectedPrice2.getContents();
		System.out.println("ExpectedPrice2: " + ExpectedPrice2);

		Cell cellshoesblack = mysheet.getCell(2, 7);
		String exlShoeBlack = cellshoesblack.getContents();
		System.out.println("shoesblack: " + exlShoeBlack);

		Cell Cellshoesbrown = mysheet.getCell(3, 7);
		String exlShoesBrown = Cellshoesbrown.getContents();
		System.out.println("shoesbrown: " + exlShoesBrown);

		Cell cellFirstName = mysheet.getCell(4, 7);
		String exlfirstname = cellFirstName.getContents();
		System.out.println("1st name: " + exlfirstname);

		Cell CellLastName = mysheet.getCell(5, 7);
		String exllastname = CellLastName.getContents();
		System.out.println("lastName: " + exllastname);

		Cell CellEmail = mysheet.getCell(6, 7);
		String exlemail = CellEmail.getContents();
		System.out.println("EMAIL: " + exlemail);

		Cell CellPassword = mysheet.getCell(7, 7);
		String exlpassword = CellPassword.getContents();
		System.out.println("pswd: " + exlpassword);

		Cell CellExpectedResult = mysheet.getCell(8, 7);
		String exlCellexpectedresult = CellExpectedResult.getContents();
		System.out.println("msg result: " + exlCellexpectedresult);

		Cell cellITEMNAME1 = mysheet.getCell(0, 9);
		String ITEMNAME1 = cellITEMNAME1.getContents();
		System.out.println("ITEMNAME1: " + ITEMNAME1);

		Cell cellITEMNAME1price = mysheet.getCell(1, 9);
		String ITEMNAME1price = cellITEMNAME1price.getContents();
		System.out.println("ITEMNAME1price: " + ITEMNAME1price);

		Cell cellITEMNAME2 = mysheet.getCell(2, 9);
		String ITEMNAME2 = cellITEMNAME2.getContents();
		System.out.println("ITEMNAME2: " + ITEMNAME2);

		Cell cellITEMNAME2price = mysheet.getCell(3, 9);
		String ITEMNAME2price = cellITEMNAME2price.getContents();
		System.out.println("ITEMNAME2price: " + ITEMNAME2price);

		Cell cellITEMONE = mysheet.getCell(4, 9);
		String ITEMONE = cellITEMONE.getContents();
		System.out.println("ITEMONE: " + ITEMONE);

		WebDriver nDriver = new EdgeDriver();

		HomePagePOM HPname = new HomePagePOM();
		HPname.openURL(nDriver);
		HPname.Womens(nDriver).click();
		HPname.gown(nDriver).click();

		womensgown nameObj = new womensgown();
		nameObj.Scrolldown3(nDriver);
		nameObj.SORTBY(nDriver).click();

		nameObj.bestselling(nDriver).click();
		String gownred = nameObj.ethnicgownred(nDriver).getText();
		String price1 = nameObj.ethnicgownredprice(nDriver).getText();
		String gownblack = nameObj.ethnicSuperPremiumGownBLACK(nDriver).getText();
		String price2 = nameObj.ethnicSuperPremiumGownBLACKprice(nDriver).getText();

		nameObj.passorfail(gownred, ITEMNAME1);
		nameObj.passorfail1(price1, ITEMNAME1price);
		nameObj.passorfail2(gownblack, ITEMNAME2);
		nameObj.passorfail3(price2, ITEMNAME2price);

		HPname.logo(nDriver).click();
		search nameObj1 = new search();
		nameObj1.SearchIcon(nDriver).click();
		nameObj1.searchbox(nDriver).sendKeys(TestData4);
		nameObj1.searchicon2(nDriver).click();
		String actualresult = nameObj1.itemone(nDriver).getText();
		nameObj1.passorfail(actualresult, ITEMONE);

		HPname.SearchIcon(nDriver).click();
		SearchPage sp = new SearchPage();
		sp.InputSearch(nDriver).sendKeys(TestData1);
		sp.SubmitIcon(nDriver).click();
		String number = sp.numberResults(nDriver).getText();
		System.out.println(number);
		sp.VerifySearchNum(number, SearchNum);

		HPname.logo(nDriver).click();
		HPname.SearchIcon(nDriver).click();
		sp.InputSearch(nDriver).sendKeys(TestData2);
		sp.SubmitIcon(nDriver).click();
		String pant = sp.pantResults(nDriver).getText();
		System.out.println(pant);
		sp.VerifySearchpant(pant, SearchPant);

		HPname.logo(nDriver).click();
		HPname.SearchIcon(nDriver).click();
		sp.InputSearch(nDriver).sendKeys(TestData3);
		sp.SubmitIcon(nDriver).click();
		String sL = sp.VerifyspecialCharResults(nDriver).getText();
		System.out.println(sL);
		sp.VerfitySpChar(sL, SearchSPchar);

		HPname.logo(nDriver).click();
		OurStoreLinkPOM Objname = new OurStoreLinkPOM();
		HPname.Scrolldown(nDriver);
		HPname.OurStoreLink(nDriver).click();

		Objname.ScrollupBan(nDriver);
		Objname.Banasree1Store(nDriver).click();
		Objname.GoogleStView(nDriver).click();
		String name = Objname.VerfityGoogleStN9(nDriver).getText();
		System.out.println(name);
		Objname.VerfityGoogleStN9(name, ExpectedResult1);

		Objname.openStURL(nDriver);
		Objname.ScrolldownR(nDriver);
		String RajStore = Objname.VerifyRajshahiStore(nDriver).getText();
		System.out.println(RajStore);
		Objname.Scrolldown2(nDriver);
		Objname.Scrolldown3(nDriver);
		Objname.ScrolldownMou(nDriver);
		String MouStore = Objname.VerifyMOULVIBAZARStore(nDriver).getText();
		System.out.println(MouStore);
		Objname.VerfityStoreNameInfo(RajStore, ExpectedResult2, MouStore, ExpectedResult3);

		HPname.logo(nDriver).click();
		HPname.Scrolldown(nDriver);
		HPname.SupportLink(nDriver).click();

		SupportPagePOM nameOBJ = new SupportPagePOM();
		String Email = nameOBJ.VerifyEmail(nDriver).getText();
		String Hotline = nameOBJ.VerifyHotline(nDriver).getText();
		System.out.println("Email " + Email + "Hotline " + Hotline);
		nameOBJ.VerfityStoreNameInfo(Email, ExpectedRes1, Hotline, ExpectedRes2);
// good  
		HomePagePOM Spring = new HomePagePOM();
		Spring.openURL(nDriver);
		Spring.SpringCollecton(nDriver).click();
		Spring.Women(nDriver).click();

		SpringWomenPage Sort = new SpringWomenPage();
		Boolean Title = Sort.TitlePage(nDriver).isDisplayed();
		System.out.println(Title + "displayed");

		if (Title == true) {
			System.out.println("The spring collection title matches.");
		} else {
			System.out.println("The spring collection title does not match");
		}

		Sort.SortBy(nDriver).click();
		Sort.Alphabet(nDriver).click();
		Sort.Scrolldown1(nDriver);

		String AcutalRes1 = Sort.CheckingOrder1(nDriver).getText();
		Sort.Scrolldown3(nDriver);
		String AcutalRes2 = Sort.CheckingOrder2(nDriver).getText();
		System.out.println("AcutalRes1 " + AcutalRes1);
		System.out.println("AcutalRes2 " + AcutalRes2);

		Sort.passorfail(AcutalRes1, Order1, AcutalRes2, Order2);

		SpringWomenPage Select = new SpringWomenPage();
		Select.Green(nDriver).click();

		Select.Cart1(nDriver).click();

		Select.Cart2(nDriver).click();

		Select.Shopping(nDriver).click();

		Select.AddingItems(nDriver).click();

		Select.Cart3(nDriver).click();

		Select.Cart2(nDriver).click();

		String Totals = Select.VerifyTotals(nDriver).getText();
		System.out.println("VerifyTotals: " + Totals);
		Select.passorfail2(Totals, Total1);
		Select.Remove(nDriver).click();
		Select.Remove2(nDriver).click();
		String Msg = Select.Msg(nDriver).getText();
		System.out.println("Message shown: " + Msg);

		Select.passorfail3(Msg, FinalStep);

		ShoePagePom sp1 = new ShoePagePom();
		sp1.openURL(nDriver);
		sp1.sortdropdown1(nDriver);

		String halfshoes = sp1.MENSHALFSHOEBLACK(nDriver).getText();
		System.out.println(halfshoes);
		String shoesbrown = sp1.MensShoesBrown1(nDriver).getText();
		System.out.println(shoesbrown);

		sp1.verifyMENSHALFSHOEBLACK(halfshoes, exlShoeBlack);
		sp1.VerifyMensShoesBrown1(shoesbrown, exlShoesBrown);

		HomePagePOM HPname1 = new HomePagePOM();

		HPname1.logo(nDriver).click();

		sp1.ACCESSORIES(nDriver).click();
		sp1.Shoes(nDriver).click();
		sp1.sortdropdown(nDriver).click();

		sp1.priceLowToHigh(nDriver).click();
		String data = sp1.VerifyLow(nDriver).getText().replace("Tk", "").replace(",", "").replace(" ", "");
		System.out.println(data);

		String data1 = sp1.VerifyHigh(nDriver).getText().replace("Tk", "").replace(",", "").replace(" ", "");
		System.out.println(data1);
		sp1.VerifyLowHigh1(data, ExpectedPrice1, data1, ExpectedPrice2);

		HPname1.openURL(nDriver);
		CreatePage cp = new CreatePage();
		cp.loginIcon(nDriver).click();
		cp.createaccount(nDriver).click();
		cp.firstname(nDriver).sendKeys(exlfirstname);
		cp.lastname(nDriver).sendKeys(exllastname);
		cp.email(nDriver).sendKeys(exlemail);
		cp.password(nDriver).sendKeys(exlpassword);

		try {
			cp.clickcreate(nDriver).click();
			String popofmsg = cp.verifymsg(nDriver).getText();
			System.out.println(popofmsg);
			cp.pwmsg(popofmsg, exlCellexpectedresult);
		} catch (InterruptedException e) {

			System.out.println("It is thinking i am a robot.");
			e.printStackTrace();
		}

		nDriver.close();

	}
}