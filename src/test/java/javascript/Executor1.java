package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor1 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver(); 
		sravan.manage().window().maximize();
		sravan.get("https://www.facebook.com/"); 
		WebElement element=sravan.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)sravan;
		js.executeScript("arguments[0].value='acvvf'",element);
		
			}

}
