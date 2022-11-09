package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Googlesearch 
{
	private static WebElement element1;
	public static WebElement search(WebDriver driver) 
	{
		element1=driver.findElement(By.name("q"));
		return element1;
	}
	public static WebElement click(WebDriver driver) 
	{
		element1=driver.findElement(By.name("btnK"));
		return element1;
	}

}
