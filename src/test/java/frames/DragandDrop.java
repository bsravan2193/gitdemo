package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://jqueryui.com/droppable/");
	    Thread.sleep(2000);
	    WebElement frame1=driver.findElement(By.className("demo-frame"));
	    driver.switchTo().frame(frame1);
	    Actions act=new Actions(driver);
	    WebElement target=driver.findElement(By.id("droppable"));
	    WebElement source=driver.findElement(By.id("draggable"));
	    act.dragAndDrop(source, target).build().perform();
	    Thread.sleep(3000); 
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000); 
	    driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]")).click();
	    Thread.sleep(3000);     
	    driver.quit(); 
	}

}
