package radiocheckbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver(); 
		sravan.manage().window().maximize();
		sravan.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		sravan.get("https://www.facebook.com/"); 
		Thread.sleep(3000);
		sravan.findElement(By.xpath("//a[contains(@data-testid,'open')]")).click();
		Thread.sleep(2000);
		List <WebElement> radios=sravan.findElements(By.xpath("//*[@class='_58mt']"));
		String exp="Male";
		System.out.println(radios.size());
		
		for (int i=0;i<radios.size();i++)
		{
			if(radios.get(i).getText().equalsIgnoreCase(exp))
			{
				radios.get(i).click();
				System.out.println("clicked");
			}
			
		}
		sravan.quit(); 
	}  } 