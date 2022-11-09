package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login2 
{
	WebDriver driver;
	By username=By.id("email");
	By password=By.name("pass");
	By login=By.xpath("//*[@type='submit']");
	public Login2(WebDriver driver)
	{
		this.driver=driver;
	}
      public void typeusername(String u)
      {
    	  driver.findElement(username).sendKeys(u);
      }
      public void typepass(String p)
      {
    	  driver.findElement(password).sendKeys(p);
      }
      public void loginbutton()
      {
    	  driver.findElement(login).click();
      }
}
