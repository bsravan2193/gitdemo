package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Factory2 
{
	WebDriver driver;
	public Factory2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID, using="email")
	WebElement useremail;
	@FindBy(how=How.NAME, using="pass")
	WebElement userpassword;
	@FindBy(how=How.XPATH, using="//*[@type='submit']")
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
