package seleniumexam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alerts {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		sravan.manage().window().maximize();
		sravan.manage().deleteAllCookies();
		sravan.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		sravan.findElement(By.xpath("//button[@id='promtButton']"));
		Thread.sleep(3000);
		sravan.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		sravan.switchTo().alert().accept();   	
		Thread.sleep(3000);
		sravan.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		sravan.switchTo().alert().dismiss();
		Thread.sleep(3000);
		sravan.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		sravan.switchTo().alert().sendKeys("sraavan"); 		
		Thread.sleep(3000);
				
		
	}

}
