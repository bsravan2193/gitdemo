package alerts;

import java.util.concurrent.TimeUnit;

import org.dataloader.impl.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alerttextverifying {

	@Test    
	public void a() throws Exception
	    {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		sravan.manage().window().maximize();
		sravan.manage().deleteAllCookies();
		sravan.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		sravan.findElement(By.id("alertButton")).click();
		String exp=sravan.switchTo().alert().getText();	
		Assert.assertEquals(sravan.switchTo().alert().getText(),exp);
		sravan.quit();
	    }

	

}
