package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahul1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sravan.get("https://rahulshettyacademy.com/locatorspractice/");
		sravan.findElement(By.id("inputUsername")).sendKeys("sravan");
		sravan.findElement(By.name("inputPassword")).sendKeys("kumar");
		sravan.findElement(By.className("submit")).click();
		System.out.println(sravan.findElement(By.cssSelector(".error")).getText());
		sravan.findElement(By.linkText("Forgot your password?")).click();
		sravan.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jogn");
		sravan.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("hytr");
		sravan.findElement(By.xpath("//input[@type='text'][2]")).clear();
		sravan.findElement(By.xpath("//form/input[2]")).sendKeys("hi");
		sravan.findElement(By.xpath("//input[@placeholder='Name']")).clear();
		sravan.findElement(By.className("input[type='text']:nth-child(2)")).sendKeys("sravan");
		sravan.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		
		
		
		
		

	}  }
