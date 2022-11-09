package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Factory3 
{
	WebDriver driver;
	public Factory3(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="email")
	@CacheLookup
	WebElement useremail;
	@FindBy(how=How.NAME, using="pass")
	@CacheLookup
	WebElement userpassword;
	@FindBy(how=How.XPATH, using="//*[@type='submit']")
	@CacheLookup
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
