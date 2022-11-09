package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		RemoteWebDriver sravan=new ChromeDriver();
		sravan.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sravan.get("https://www.google.com");
		sravan.navigate().to("https://www.google.com");

	}

}
