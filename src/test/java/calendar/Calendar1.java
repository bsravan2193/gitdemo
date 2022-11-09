package calendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.path2usa.com/travel-companion/");
	    Thread.sleep(3000);
	    JavascriptExecutor j = (JavascriptExecutor) driver;
	    j.executeScript("window.scrollBy(208,730)");
	    Thread.sleep(3000);
	    driver.findElement(By.id("form-field-travel_comp_date")).click();
	   Thread.sleep(3000);
	   //click calendar icon
	   System.out.println(driver.findElement(By.xpath("//*[@class='flatpickr-month']")).getText());
	   while(!driver.findElement(By.xpath("//*[@class='flatpickr-month']")).getText().contains("April"))
     {
		   driver.findElement(By.xpath("//*[@class='flatpickr-month']/child::span[2]")).click();
	
     }
	 	 Thread.sleep(3000);
	    driver.quit();
  

	}

}
