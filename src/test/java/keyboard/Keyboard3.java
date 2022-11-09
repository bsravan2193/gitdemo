package keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard3 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://demoqa.com/text-box");
	    Thread.sleep(2000);
	    WebElement name=driver.findElement(By.id("userName"));
	    name.sendKeys("sravan kumar");
	    WebElement email=driver.findElement(By.id("userEmail"));
	    email.sendKeys("bsravan2193@gmail.com");
	    WebElement currentaddress=driver.findElement(By.id("currentAddress"));
	    currentaddress.sendKeys("LB NAGAR, HYDERABAD");
	    Actions actions=new Actions(driver);
	    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	    actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        actions.sendKeys(Keys.TAB).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(2000);
	         
	}  }
