package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factory1 
{
	WebDriver driver;
	public Factory1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	WebElement useremail;
	@FindBy(name="pass")
	WebElement userpassword;
	@FindBy(xpath="//*[@type='submit']")
	WebElement usersubmit;
	public void typeusername()
    {
		useremail.sendKeys("bsravan2193@gmail.com");   	  
    }
    public void typepass()
    {
    	userpassword.sendKeys("Gndec@61e");   	  
    }
    public void loginbutton()
    {
    	usersubmit.click();   	  
    } 	}
