package seleniumexam;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		List <WebElement> auto=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(auto.size());
		String Expected="hyderabad metro map";
		for (int i=0;i<auto.size();i++)
		{
		
		if (auto.get(i).getText().equalsIgnoreCase(Expected))
		{
		auto.get(i).click();
		Thread.sleep(3000);
		System.out.println("clicked");
		break;
		}
		} 
		driver.quit();
		
		
	}  }
