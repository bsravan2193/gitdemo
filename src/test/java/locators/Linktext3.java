package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sravan.get("https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		sravan.findElement(By.linkText("contact"));
		Thread.sleep(3000);
		sravan.quit();
		

	}

}
