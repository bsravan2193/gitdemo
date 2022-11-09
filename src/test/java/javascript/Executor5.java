package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor5 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver(); 
		sravan.manage().window().maximize();
		sravan.get("https://www.hyrtutorials.com/"); 
		WebElement element=sravan.findElement(By.xpath("//div[@id='sidebar(2)']/div[@id='Label1']/div[@class='widget-title']/h2"));
		System.out.println(element.getText()); 	
				
			}}
