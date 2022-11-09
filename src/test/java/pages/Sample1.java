package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sample1 
{
	WebDriver driver;
	By search=By.name("q");
	
	public Sample1(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void enter() throws Exception
	{
		driver.findElement(search).sendKeys("Hyderabad");
		Thread.sleep(3000);
	}
	}




