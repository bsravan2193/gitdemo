package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop2 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().window().maximize();
		sravan.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sravan.get("https://www.facebook.com/");
		Thread.sleep(3000);
		sravan.findElement(By.xpath("//a[contains(@data-testid,'open')]")).click();
		Thread.sleep(2000);
		WebElement element=sravan.findElement(By.xpath("//*[@id='month']"));
		Select so=new Select(element);
		so.selectByIndex(0);
		Thread.sleep(3000);
		so.selectByVisibleText("May");
		Thread.sleep(3000);
		so.selectByValue("2");
		Thread.sleep(3000); 
		
		sravan.quit();
	}

}
