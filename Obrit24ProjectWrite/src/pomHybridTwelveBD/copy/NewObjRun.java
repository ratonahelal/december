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

public class NewObjRun {

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException, InterruptedException
		{
		
			
			File myfile = new File("C:\\testData\\TwelveBD24.xls");
			Workbook mywb = Workbook.getWorkbook(myfile);
			Sheet mysheet = mywb.getSheet("Store2");
			
			WritableWorkbook rmywb= Workbook.createWorkbook(myfile,mywb);//write mode
			WritableSheet rmysheet = rmywb.getSheet("Store2");//write mode   */
					
			Cell cellSearchBar = mysheet.getCell(1, 1);
			String SearchBar = cellSearchBar.getContents();
			System.out.println("SearchBar " + SearchBar); 
			Cell cellExpectedRes = mysheet.getCell(6, 1);
			String ExpectedResult = cellExpectedRes.getContents();
			System.out.println("ExpectedResult " + ExpectedResult);
			
			Cell cellSearchBar2 = mysheet.getCell(1, 2); 
			String SearchBar2 = cellSearchBar2.getContents(); 
			System.out.println("SearchBar2 " + SearchBar2);
			Cell cellExpectedRes2 = mysheet.getCell(6, 2);
			String ExpectedResult2 = cellExpectedRes2.getContents();
			System.out.println("ExpectedResult2 "+ ExpectedResult2);
			
			Cell cellSearchBar3 = mysheet.getCell(1, 3); 
			String SearchBar3 = cellSearchBar3.getContents(); 
			System.out.println("SearchBar3 " + SearchBar3);
			Cell cellExpectedRes3 = mysheet.getCell(6, 3);
			String ExpectedResult3 = cellExpectedRes3.getContents();
			System.out.println("ExpectedResult3 "+ ExpectedResult3);
			
			
			Cell cellITEMNAME1= mysheet.getCell(2, 4);
			String ITEMNAME1  = cellITEMNAME1.getContents();
			System.out.println("ITEMNAME1: " +ITEMNAME1);

			Cell cellITEMNAME1price = mysheet.getCell(3, 4);
			String ITEMNAME1price = cellITEMNAME1price.getContents();
			System.out.println("ITEMNAME1price: " + ITEMNAME1price);

			Cell cellITEMNAME2 = mysheet.getCell(4, 4);
			String ITEMNAME2 = cellITEMNAME2.getContents();
			System.out.println("ITEMNAME2: " + ITEMNAME2);
			
			Cell cellITEMNAME2price = mysheet.getCell(5, 4);
			String ITEMNAME2price = cellITEMNAME2price.getContents();
			System.out.println("ITEMNAME2price: " + ITEMNAME2price);
			
			Cell cellInput = mysheet.getCell(1, 5);
			String TestData = cellInput.getContents();
			System.out.println("Test Data: " + TestData);
			
			Cell cellITEMONE = mysheet.getCell(6, 5);
			String ITEMONE = cellITEMONE.getContents();
			System.out.println("ITEMONE: " + ITEMONE);
			
			Cell cellER1 = mysheet.getCell(6, 6);
			String ExpectedResult1 = cellER1.getContents();
			System.out.println("Expected Result5: " + ExpectedResult1);
			
			Cell cellStore1 = mysheet.getCell(2, 7);
			String Store1 = cellStore1.getContents();
			System.out.println("Store1: " + Store1);
			
			Cell cellStore2 = mysheet.getCell(4, 7);
			String Store2 = cellStore2.getContents();
			System.out.println("Store2: " + Store2);
			
			Cell cellEmail = mysheet.getCell(2, 8);
			String ExpectedResult8 = cellEmail.getContents();
			System.out.println("ExpectedResult8: " + ExpectedResult8);
			
			Cell cellHotline = mysheet.getCell(4, 8);
			String ExpectedResult9 = cellHotline.getContents();
			System.out.println("ExpectedResult9: " + ExpectedResult9);
			
			Cell cellCheckingOrder1= mysheet.getCell(2,9);
			String  Order1= cellCheckingOrder1.getContents();
			System.out.println("CheckingOrder1:"+"  " + Order1);
			
			Cell cellCheckingOrder2= mysheet.getCell(4,9);
			String  Order2= cellCheckingOrder2.getContents();
			System.out.println("CheckingOrder2:"+"  " + Order2);

			Cell cellTitle= mysheet.getCell(0,10);
			String  Title= cellTitle.getContents();
			System.out.println("Title:"+"  " + Title);
			
			Cell cellTotal1 = mysheet.getCell(6,10);
			String Total1 = cellTotal1.getContents();
			System.out.println("Total1:"+"  "+Total1);

			Cell cellFinalStep = mysheet.getCell(6,11);
			String FinalStep = cellFinalStep.getContents();
			System.out.println("FinalStep:"+"  "+FinalStep);
			
			Cell cellshoesblack = mysheet.getCell(2, 12);
			String exlShoeBlack = cellshoesblack.getContents();
			System.out.println("shoesblack: " + exlShoeBlack);
			
			Cell cellExpectedPrice1 = mysheet.getCell(3, 12);
			String ExpectedPrice1 = cellExpectedPrice1.getContents();
			System.out.println("ExpectedPrice1: " + ExpectedPrice1);

			Cell Cellshoesbrown = mysheet.getCell(4, 12);
			String exlShoesBrown = Cellshoesbrown.getContents();
			System.out.println("shoesbrown: " + exlShoesBrown);
			
			Cell CellExpectedPrice2 = mysheet.getCell(5, 12);
			String ExpectedPrice2 = CellExpectedPrice2.getContents();
			System.out.println("ExpectedPrice2: " + ExpectedPrice2);
			
			Cell cellFirstName = mysheet.getCell(2, 13);
			String exlfirstname = cellFirstName.getContents();
			System.out.println("1st name: " + exlfirstname);
			
			Cell CellLastName = mysheet.getCell(3, 13);
			String exllastname = CellLastName.getContents();
			System.out.println("lastName: " + exllastname);
			
			Cell CellEmail = mysheet.getCell(4, 13);
			String exlemail = CellEmail.getContents();
			System.out.println("EMAIL: " + exlemail);
			
			Cell CellPassword = mysheet.getCell(5, 13);
			String exlpassword = CellPassword.getContents();
			System.out.println("pswd: " + exlpassword);
		
			Cell CellExpectedResult = mysheet.getCell(6, 13);
			String exlCellexpectedresult = CellExpectedResult.getContents();
			System.out.println("msg result: " + exlCellexpectedresult);
			
			
			
			
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumServer2\\IEDriver\\IEDriverServer.exe");

			WebDriver nDriver = new EdgeDriver();
			
			HomePagePOM HPname = new HomePagePOM();
			HPname.openURL(nDriver);
			HPname.Womens(nDriver).click();
			HPname.gown(nDriver).click();
			
			womensgown nameObj = new womensgown();
			nameObj.Scrolldown3(nDriver);
			nameObj.SORTBY(nDriver).click();
			
			nameObj.bestselling(nDriver).click();
			String gownred=nameObj.ethnicgownred(nDriver).getText();
			String price1=nameObj.ethnicgownredprice(nDriver).getText();
			String gownblack=nameObj.ethnicSuperPremiumGownBLACK(nDriver).getText();
			String price2=nameObj.ethnicSuperPremiumGownBLACKprice(nDriver).getText();
			
			String passfailresult4 = null;
			String reason4 = null;
			
			if(gownred.compareTo(ITEMNAME1) == 0 && price1.compareTo(ITEMNAME1price)==0 && gownblack.compareTo(ITEMNAME2) == 0 && price2.compareTo(ITEMNAME2price)==0)
			  	{ 
				  passfailresult4 = "PASS";
				  reason4 = gownred + ", " + price1 + ", " + gownblack + "and " + price2 + " are matches with expected result";
			  	} 
			  	else
			  		{ 
				  passfailresult4 = "FAIL";
				  reason4 = gownred + ", " + price1 + ", " + gownblack + "and " + price2 + " did not match with expected result";
			  		}
			  System.out.println(passfailresult4);
		      
			  Label abcd4 = new Label(7, 4, passfailresult4); // rmysheet.addCell(abcd2);
			  rmysheet.addCell(abcd4);
			  Label xyz4 = new Label(8, 4, reason4); // rmysheet.addCell(xyz2);
		      rmysheet.addCell(xyz4); 

				HPname.logo(nDriver).click();
			search nameObj1 = new search();
			nameObj1.SearchIcon(nDriver).click();
			nameObj1.searchbox(nDriver).sendKeys(TestData);
			nameObj1.searchicon2(nDriver).click();
			String actualresult =nameObj1.itemone(nDriver).getText();
			
			String passfailresult5 = null;
			String reason5 = null;
			
			if(actualresult.compareTo(ITEMONE)==0)
			  	{ 
				  passfailresult5 = "PASS";
				  reason5 =  actualresult + " match with expected result";
			  	} 
			  	else
			  		{ 
				  passfailresult5 = "Fail";
				  reason5 =  actualresult + " did not match with expected result";
			  		}
			  System.out.println(passfailresult5);
		      
			  Label abcd5 = new Label(7, 5, passfailresult5); // rmysheet.addCell(abcd2);
			  rmysheet.addCell(abcd5);
			  Label xyz5 = new Label(8, 5, reason5); // rmysheet.addCell(xyz2);
		      rmysheet.addCell(xyz5); 
			
			HPname.openURL(nDriver);
			HPname.SearchIcon(nDriver).click();
			SearchPage sp = new SearchPage();
			sp.InputSearch(nDriver).sendKeys(SearchBar);
			sp.SubmitIcon(nDriver).click();
			String number = sp.numberResults(nDriver).getText();
			System.out.println(number);
		
		
			String passfailresult=null;
			String reason=null;
			if (number.compareTo(ExpectedResult) == 0)
			
			{
				
				passfailresult="PASS";
				reason= number + " match with expected result";
			} 
			else
			{
				passfailresult="Fail";
				reason= number + " did not match with expected result";
			}
			System.out.println(passfailresult);
			Label abcd = new Label(7,1,passfailresult);
			rmysheet.addCell(abcd);
			
	        Label xyz = new Label(8,1,reason);
	        rmysheet.addCell(xyz);
	   
			
			  HPname.logo(nDriver).click();
			  HPname.SearchIcon(nDriver).click();
			  sp.InputSearch(nDriver).sendKeys(SearchBar2);
			  sp.SubmitIcon(nDriver).click();
			  String pant2 = sp.pantResults(nDriver).getText();
			  System.out.println(pant2);
			  
			  	String passfailresult2 = null;
			  	String reason2 = null;
			  	
			  	if(pant2.compareTo(ExpectedResult2) == 0)
			  	{ 
				  passfailresult2 = "PASS";
				  reason2 = pant2 + " match with expected result";
			  	} 
			  	else
			  		{ 
				  passfailresult2 = "Fail";
				  reason2 = pant2 + " did not match with expected result";
			  		}
			  System.out.println(passfailresult2);
			  
		  	Label abcd2 = new Label(7, 2, passfailresult2); // rmysheet.addCell(abcd2);
			  rmysheet.addCell(abcd2);
			  Label xyz2 = new Label(8, 2, reason2); // rmysheet.addCell(xyz2);
		      rmysheet.addCell(xyz2); 
		      
			  HPname.logo(nDriver).click();
			  HPname.SearchIcon(nDriver).click();
			  sp.InputSearch(nDriver).sendKeys(SearchBar3);
			  sp.SubmitIcon(nDriver).click();
			  String sL = sp.VerifyspecialCharResults(nDriver).getText();
			  System.out.println(sL);
			  
			  String passfailresult3 = null;
			  String reason3 = null;
			  	
			  	if(sL.compareTo(ExpectedResult3) == 0)
			  	{ 
				  passfailresult3 = "PASS";
				  reason3 = sL + " match with expected result";
			  	} 
			  	else
			  		{ 
				  passfailresult3 = "Fail";
				  reason3 = sL + " did not match with expected result";
			  		}
			  System.out.println(passfailresult3);
		      
			  Label abcd3 = new Label(7, 3, passfailresult3); // rmysheet.addCell(abcd2);
			  rmysheet.addCell(abcd3);
			  Label xyz3 = new Label(8, 3, reason3); // rmysheet.addCell(xyz2);
		      rmysheet.addCell(xyz3); 
		      
		      

				HPname.logo(nDriver).click();
				OurStoreLinkPOM Objname = new OurStoreLinkPOM();
				HPname.Scrolldown(nDriver);
				HPname.OurStoreLink(nDriver).click();
				
				Objname.ScrollupBan(nDriver);
				Objname.Banasree1Store(nDriver).click();
				Objname.GoogleStView(nDriver).click();
				String name =Objname.VerfityGoogleStN9(nDriver).getText();
				System.out.println(name);
				Objname.VerfityGoogleStN9(name, ExpectedResult1);
				
				String passfailresult6 = null;
				String reason6 = null;
				
				if(name.compareTo(ExpectedResult1)==0)
				  	{ 
					  passfailresult6 = "PASS";
					  reason6 =  name + " name match with expected result";
				  	} 
				  	else
				  		{ 
					  passfailresult6 = "Fail";
					  reason6 =  " did not match with expected result";
				  		}
				  System.out.println(passfailresult6);
			      
				  Label abcd6 = new Label(7, 6, passfailresult6); // rmysheet.addCell(abcd2);
				  rmysheet.addCell(abcd6);
				  Label xyz6 = new Label(8, 6, reason6); // rmysheet.addCell(xyz2);
			      rmysheet.addCell(xyz6); 
				
			
			  	Objname.openStURL(nDriver);
				Objname.ScrolldownR(nDriver);
				String RajStore = Objname.VerifyRajshahiStore(nDriver).getText();
				System.out.println(RajStore);
				Objname.Scrolldown2(nDriver);
				Objname.Scrolldown3(nDriver);
				Objname.ScrolldownMou(nDriver);
				String MouStore = Objname.VerifyMOULVIBAZARStore(nDriver).getText();
				System.out.println(MouStore);
				
				String passfailresult7 = null;
				String reason7 = null;
				
				if(name.compareTo(ExpectedResult1)==0)
				  	{ 
					  passfailresult7 = "PASS";
					  reason7 = "Stores name bot matches with expected result";
				  	} 
				  	else
				  		{ 
					  passfailresult7 = "Fail";
					  reason7 = RajStore+ "and" + MouStore + " doesnt match with expected result";
				  		}
				  System.out.println(passfailresult7);
			      
				  Label abcd7 = new Label(7, 7, passfailresult7); // rmysheet.addCell(abcd2);
				  rmysheet.addCell(abcd7);
				  Label xyz7 = new Label(8, 7, reason7); // rmysheet.addCell(xyz2);
			      rmysheet.addCell(xyz7); 
			      
			      
			      
			  	HPname.logo(nDriver).click();
				HPname.Scrolldown(nDriver);
				HPname.SupportLink(nDriver).click();
				
				SupportPagePOM nameOBJ = new SupportPagePOM();
				String Email = nameOBJ.VerifyEmail(nDriver).getText();
				String Hotline = nameOBJ.VerifyHotline(nDriver).getText();
				System.out.println("Email " + Email + "Hotline " + Hotline);
				
				
				String passfailresult8 = null;
				String reason8 = null;
				
				if(Email.compareTo(ExpectedResult8)==0 && Hotline.compareTo(ExpectedResult9)==0)
				  	{ 
					  passfailresult8 = "PASS";
					  reason8= "Both " +  Email+ "and " + Hotline + " matches with expected result";
				  	} 
				  	else
				  		{ 
					  passfailresult8 = "Fail";
					  reason8 = Email+ "and/or" + Hotline + " doesnt match with expected result";
				  		}
				  System.out.println(passfailresult8);
			      
				  Label abcd8 = new Label(7, 8, passfailresult8);
				  rmysheet.addCell(abcd8);
				  Label xyz8 = new Label(8, 8, reason8); 
			      rmysheet.addCell(xyz8); 
			      
			      
		    	
			      HomePagePOM Spring = new HomePagePOM();
					Spring.openURL(nDriver);
					Spring.SpringCollecton(nDriver).click();
					Spring.DropdownWomen(nDriver).click();
					
					SpringWomenPage Sort = new SpringWomenPage();
		        	Boolean Title1 =Sort.TitlePage(nDriver).isDisplayed();
					System.out.println( Title1 + "displayed");
					
					if (Title1 == true)
					{
					System.out.println("Eid'24 Women title matches.");	
					}
					else
					{
					System.out.println("Eid'24 Women title does not match");
					}

					
					Sort.SortBy(nDriver).click();
					Sort.Alphabet(nDriver).click();
					Sort.Scrolldown1(nDriver);
					
					String AcutalRes1 =Sort.CheckingOrder1(nDriver).getText();
					Sort.Scrolldown3(nDriver);
					String AcutalRes2 =Sort.CheckingOrder2(nDriver).getText();
					System.out.println("AcutalRes1 "+AcutalRes1 );
					System.out.println("AcutalRes2 "+AcutalRes2 );
					
					Sort.passorfail(AcutalRes1, Order1, AcutalRes2, Order2);
					

					String passfailresult9 = null;
					String reason9 = null;
					
					if(AcutalRes1.compareTo(Order1)==0 && AcutalRes2.compareTo(Order2)==0)
					  	{ 
						  passfailresult9 = "PASS";
						  reason9 ="Both " + AcutalRes1+ "and" + AcutalRes2 + " matches with expected result";
					  	} 
					  	else
					  	{ 
						  passfailresult9 = "Fail";
						  reason9 = AcutalRes1+ "and/or" + AcutalRes2 + " doesnt match with expected result";
					  	}
						System.out.println(passfailresult9);
				      
						Label abcd9 = new Label(7, 9, passfailresult9);
						rmysheet.addCell(abcd9);
						Label xyz9 = new Label(8, 9, reason9); 
						rmysheet.addCell(xyz9); 
						
				SpringWomenPage Select =new SpringWomenPage();
				Select.Green(nDriver).click();
				Select.Cart1(nDriver).click();
				Select.Cartbtn(nDriver).click();
						
				Select.Shopping(nDriver).click();
						
				Select.AddingItems(nDriver).click();
						
				Select.Cart3(nDriver).click();
						
				Select.Cartbtn(nDriver).click();
						
				String Totals =Select.VerifyTotals(nDriver).getText();
				System.out.println("VerifyTotals: " +Totals);
				
				String passfailresult10 = null;
				String reason10 = null;
				
				if(Totals.compareTo(Total1)==0)
				  	{ 
					  passfailresult10 = "PASS";
					  reason10= Totals + " match with expected result";
				  	} 
				  	else
				  	{ 
					  passfailresult10 = "Fail";
					  reason10 = Totals + " doesnt match with expected result";
				  	}
					System.out.println(passfailresult10);
			      
				Label abcd10 = new Label(7, 10, passfailresult10);
					rmysheet.addCell(abcd10);
					Label xyz10 = new Label(8, 10, reason10); 
					rmysheet.addCell(xyz10);  
					
				
				Select.passorfail2(Totals, Total1);
				Select.Remove(nDriver).click();
				Select.Remove2(nDriver).click();
				String Msg =Select.Msg(nDriver).getText();
				System.out.println("Message shown: "+ Msg);
				

				String passfailresult11 = null;
				String reason11 = null;
				
				if(Msg.compareTo(FinalStep)==0)
				  	{ 
					  passfailresult11 = "PASS";
					  reason11 = "messages match with expected result";
				  	}
				  	
				  	else
				  	{ 
				  		passfailresult11 = "Fail";
				  		reason11 = Msg + " doesnt match with expected result";
				  	}
					System.out.println(passfailresult11);
			      
					Label abcd11 = new Label(7, 11, passfailresult11);
					rmysheet.addCell(abcd11);
					Label xyz11 = new Label(8, 11, reason11); 
					rmysheet.addCell(xyz11);		
				
			ShoePagePom sp1 = new ShoePagePom();
			sp1.openURL(nDriver);
			sp1.sortdropdown1(nDriver); 
			sp1.Scrolldown(nDriver);
			String halfshoes= sp1.MENSHALFSHOEBLACK(nDriver).getText();
			System.out.println(halfshoes);
			String shoesbrown = sp1.MensShoesBrown1(nDriver).getText();
			System.out.println(shoesbrown);
			
			String passfailresult12 = null;
			String reason12 = null;
			
			if(halfshoes.compareTo(exlShoeBlack)==0 && shoesbrown.compareTo(exlShoesBrown)==0)
			  	{ 
				  passfailresult12 = "PASS";
				  reason12 = "Shoes matches with expected result";
			  	} 
			  	else
			  	{ 
				  passfailresult12 = "Fail";
				  reason12 = halfshoes+ " and " + shoesbrown + " doesnt match with expected result";
			  	}
				System.out.println(passfailresult12);
		      
				Label abcd12 = new Label(7, 12, passfailresult12);
				rmysheet.addCell(abcd12);
				Label xyz12 = new Label(8, 12, reason12); 
				rmysheet.addCell(xyz12);
				
				
			
		/*	HomePagePOM HPname1 = new HomePagePOM();
	
			HPname1.logo(nDriver).click();
					
			sp1.ACCESSORIES(nDriver).click();
			sp1.Shoes(nDriver).click();
			sp1.sortdropdown(nDriver).click();
			sp1.priceLowToHigh(nDriver).click();
			sp1.Scrolldown(nDriver);
			String data = sp1.VerifyLow(nDriver).getText().replace("Tk","").replace(",", "").replace(" ", "");
			System.out.println(data);
			String data1 = sp1.VerifyHigh(nDriver).getText().replace("Tk","").replace(",", "").replace(" ","");
			System.out.println(data1);
			
			String passfailresult13 = null;
			String reason13 = null;
			
			if(data.compareTo(ExpectedPrice1)==0 && data1.compareTo(ExpectedPrice2)==0)
			  	{ 
				  passfailresult13 = "PASS";
				  reason13 = "Price matches with expected result";
			  	} 
			  	else
			  	{ 
				  passfailresult13 = "Fail";
				  reason13 = data+ " and " + data1 + " doesnt match with expected result";
			  	}
				System.out.println(passfailresult13);
		      
				Label abcd13 = new Label(7, 13, passfailresult13);
				rmysheet.addCell(abcd13);
				Label xyz13 = new Label(8, 13, reason13); 
				rmysheet.addCell(xyz13);
				
			
			HPname1.openURL(nDriver);
			CreatePage cp = new CreatePage();
			cp.loginIcon(nDriver).click();
			cp.createaccount(nDriver).click();
			cp.firstname(nDriver).sendKeys(exlfirstname);
			cp.lastname(nDriver).sendKeys(exllastname);
			cp.email(nDriver).sendKeys(exlemail);
			cp.password(nDriver).sendKeys(exlpassword);
			cp.clickcreate(nDriver).click();	
		
			String popofmsg = cp.verifymsg(nDriver).getText();
			System.out.println(popofmsg);
			
			String passfailresult14 = null;
			String reason14 = null;
			
			if(popofmsg.compareTo(exlCellexpectedresult)==0)
			  	{ 
				  passfailresult14 = "PASS";
				  reason14= "Message matches with expected result";
			  	} 
			  	else
			  	{ 
				  passfailresult14 = "Fail";
				  reason14 = data+ " and " + data1 + " doesnt match with expected result";
			  	}
				System.out.println(passfailresult14);
		      
				Label abcd14 = new Label(7, 14, passfailresult14);
				rmysheet.addCell(abcd14);
				Label xyz14 = new Label(8, 14, reason14); 
				rmysheet.addCell(xyz14);	*/
						
			// should be outside of the loop
				rmywb.write();// it will save now 
				rmywb.close();//close the file 
				nDriver.close();   
		}
	}