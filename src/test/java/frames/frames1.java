package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sravan.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);
		sravan.findElement(By.id("name")).sendKeys("sravan");
		sravan.switchTo().frame(sravan.findElement(By.id("frm1")));
		Select cdd=new Select(sravan.findElement(By.id("selectnav1")));
		cdd.selectByVisibleText("java");
		Thread.sleep(3000);
		sravan.switchTo().defaultContent();
		sravan.findElement(By.id("name")).sendKeys("kumar");
		

	}

}
