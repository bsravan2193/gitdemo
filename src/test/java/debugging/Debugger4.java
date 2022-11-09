package debugging;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugger4 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.hyrtutorials.com/");
	    Thread.sleep(2000);	
	    driver.findElement(By.xpath("//a[contains(text(),'IBM')]")).getText();
	     
		

	}

}
