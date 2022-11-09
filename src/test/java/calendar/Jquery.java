package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jquery {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://jqueryui.com/datepicker/");
	    Thread.sleep(2000);
	    WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@class='hasDatepicker']")).click();
		Thread.sleep(2000);
		while(!driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText().contains("June 2023"))
		{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		List <WebElement> days=driver.findElements(By.xpath("//*[@class='ui-state-default']"));
		for (int i=0;i<days.size();i++)
		{
			if(days.get(i).getText().contains("23"))
			{
				days.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
		
		driver.quit();

	}

}
