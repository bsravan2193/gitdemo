package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) throws Exception
	{
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
	    Thread.sleep(2000);
	    
	    while(!driver.findElement(By.xpath("//*[@class='flatpickr-month']")).getText().contains("April"))
	    {
	    	driver.findElement(By.xpath("//*[@class='flatpickr-month']/span[2]")).click();
	    }
	    List <WebElement> cal=driver.findElements(By.xpath("//*[@class='flatpickr-day ' or @class='flatpickr-day today']"));
          System.out.println(driver.findElement(By.xpath("//*[@class='flatpickr-month']")).getText());
        
        for(int i=0;i<cal.size();i++)
        {
        	
        	if(cal.get(i).getText().equalsIgnoreCase("28"))
        	{
        		cal.get(i).click();
        		Thread.sleep(2000);
        		System.out.println("clicked");
        		break;
        	}
        }
       
     
	} 
}
