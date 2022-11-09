package keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Constructor1 C1 =new Constructor1(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    Actions act=new Actions(driver);
	    WebElement target=driver.findElement(By.id("twotabsearchtextbox"));
	    act.moveToElement(target).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	    Thread.sleep(3000);
	    driver.quit(); 	

	}

}
