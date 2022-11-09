package keyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAndReleaseControl {

	public static void main(String[] args) throws Exception 
	{   
     WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    driver.get("https://www.amazon.in/");
    Thread.sleep(2000);
    Actions act=new Actions(driver);
    WebElement target1=driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[4]"));
    act.moveToElement(target1).contextClick().perform();
    Thread.sleep(5000);
    act.moveToElement(target1).release().build().perform();
    WebElement target2=driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[9]"));
    act.moveToElement(target2).contextClick().perform();
    Thread.sleep(5000);
    driver.quit();
	}

}
