package radiocheckbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radio4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver(); 
		sravan.manage().window().maximize();
		sravan.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		sravan.get("https://www.hyrtutorials.com/p/basic-controls.html"); 
		Thread.sleep(3000);
		List <WebElement> check=sravan.findElements(By.xpath("//input[@name='language']"));
		for(int i=0;i<check.size();i++)
		{
			check.get(i).click();
			Thread.sleep(1000);
		}
		for(int i=0;i<check.size();i++)
		{
			check.get(i).click();
			Thread.sleep(1000);
		}
		
			
		sravan.quit();
	} }
