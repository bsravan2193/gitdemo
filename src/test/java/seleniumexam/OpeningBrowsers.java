package seleniumexam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningBrowsers {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.quit();
		System.setProperty("webdriver.gecko.driver","D:\\shami\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.quit();
		System.setProperty("webdriver.edge.driver","D:\\shami\\msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();
		driver2.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.quit();
	}

}
