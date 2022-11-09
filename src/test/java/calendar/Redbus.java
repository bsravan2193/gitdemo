package calendar;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.redbus.in/");
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@type='text'])[3]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@class='monthTitle']")).getText());
		Thread.sleep(3000);
		while(!driver.findElement(By.xpath("//*[@class='monthTitle']")).getText().contains("Dec 2023"))
		{
		  driver.findElement(By.xpath("//*[@class='monthTitle']/following-sibling::td")).click();
		  Thread.sleep(2000);
		}
		List <WebElement> days=driver.findElements(By.xpath("//*[@class='wd day' or @class='we day']"));
		for (int i=0;i<days.size();i++)
		{
			if(days.get(i).getText().contains("16"))
			{
				days.get(i).click();
				Thread.sleep(2000); 
				break;
			}
		}
		
		driver.quit();
	}

}
