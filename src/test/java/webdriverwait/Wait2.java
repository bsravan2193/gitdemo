package webdriverwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait2 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup(); ;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.co.in/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='q']")));
		e1.sendKeys("sravan");
		driver.close();	

	}

}
