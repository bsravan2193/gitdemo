package seleniumexam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autodownloaddriverexecutables {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver2=new EdgeDriver();
		driver2.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver2.quit(); 
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver1.quit(); 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.quit(); 
		
		
	}

}
