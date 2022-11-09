package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Googlesearch;

public class Googlesearch1 {
	static WebDriver driver;

	public static void main(String[] args) throws Exception 
	{ 	
		googlesearch3();
	}
	public static void googlesearch3() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.google.com/");
	    Googlesearch.search(driver).sendKeys("Automation step by step");
	   // driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	    //driver.findElement(By.name("q")).sendKeys(Keys.ENTER); 
	    Googlesearch.click(driver).sendKeys(Keys.ENTER);
	    driver.close();
	    
	}

}
