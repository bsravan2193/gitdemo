package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom10 
{
	public static WebElement e1;
	public static WebElement search(WebDriver sravan)
	{
		e1=sravan.findElement(By.name("q"));
		return e1; 	 		
	}
	
	public static WebElement click(WebDriver sravan)
	{
		e1=sravan.findElement(By.name("q"));
		return e1; 	 		
	}

}
