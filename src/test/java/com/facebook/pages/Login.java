package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;
	By username=By.id("email");
	By password=By.name("pass");
	By login=By.xpath("//*[@type='submit']");
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
      public void typeusername()
      {
    	  driver.findElement(username).sendKeys("");
      }
      public void typepass()
      {
    	  driver.findElement(password).sendKeys("");
      }
      public void loginbutton()
      {
    	  driver.findElement(login).click();
      }
}
