package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radha1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().window().maximize();
		sravan.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sravan.get("https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		System.out.println(sravan.findElement(By.xpath("//*[@id='BlogArchive1']/div[1]/h2")).getText());
		Thread.sleep(2000);
		sravan.quit();		
			}

}
