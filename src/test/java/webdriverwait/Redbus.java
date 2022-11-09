package webdriverwait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    driver.get("https://www.redbus.in/");
	    WebElement e1=driver.findElement(By.xpath("(//*[@type='text'])[3]"));
	    WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait1.until(ExpectedConditions.visibilityOf(e1));
		e1.click();
		WebElement e2=driver.findElement(By.xpath("//*[@class='monthTitle']"));
		WebElement e3=driver.findElement(By.xpath("//*[@class='monthTitle']/following-sibling::td"));
		
		while(!e2.getText().contains("Dec 2023"))
		{
		  e3.click();
		 }
		List <WebElement> days=driver.findElements(By.xpath("//*[@class='wd day' or @class='we day']"));
		for (int i=0;i<days.size();i++)
		{
			if(days.get(i).getText().contains("16"))
			{
				days.get(i).click();
				break;
			}
		}
		
		driver.quit();
	}

}
