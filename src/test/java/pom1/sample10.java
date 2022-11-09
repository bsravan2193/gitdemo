package pom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom1.Pom10;

public class sample10 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		sravan.manage().window().maximize();
		sravan.manage().deleteAllCookies();
		sravan.get("https://www.google.com/");
		Thread.sleep(3000);
		Pom10.search(sravan).sendKeys("Hyderabad");		
		//sravan.findElement(By.name("q")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		//sravan.findElement(By.name("q")).sendKeys(Keys.ENTER); 
		Pom10.search(sravan).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		sravan.quit();

	}

}
