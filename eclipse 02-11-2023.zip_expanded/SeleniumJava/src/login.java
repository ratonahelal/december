import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.Base;

public class login {

	public static void main(String[] args) {
		
	 WebDriver driver=Base.getDriver();
	 
     driver.get("https://thestockmarketwatch.com/markets/today.aspx");
		
       driver.findElement(By.id("sectors"));
     
           System.out.println(driver.findElement(By.id("sectors")));
     

	}

}
