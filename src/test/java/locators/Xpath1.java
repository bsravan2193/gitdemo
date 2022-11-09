package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sravan.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(3000);
		sravan.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		sravan.quit();	} }
