package net;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Base.getDriver();
		
		driver.get("https://thestockmarketwatch.com/markets/today.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.findElement(By.id("sectors"));
	//	driver.findElement(By.xpath("//a[normalize-space()='Con. Discret']")).click();	
		//driver.findElement(By.xpath("//a[normalize-space()='Con. Staples']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Energy']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Financial']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Health Care']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Industrial']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Basic Materials']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Technology']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Utilities']")).click();
		
		//System.out.println("//a[normalize-space()='Utilities']");
		driver.findElement(By.cssSelector("#email")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("ratonahelal@gmail.com");
		
		driver.quit();
		
	
	}

}
