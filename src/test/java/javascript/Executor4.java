package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor4 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver(); 
		sravan.manage().window().maximize();
		sravan.get("https://www.hyrtutorials.com/"); 
		JavascriptExecutor js=(JavascriptExecutor)sravan;
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		
				
			}}
