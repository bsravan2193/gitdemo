package rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingclass {
	WebDriver driver;
	public Landingclass(WebDriver driver)
	{
		this.driver=driver; 
		PageFactory.initElements(driver,this);
	}
	//WebElement useremail=driver.findElement(By.id("email"));
	//page factory
	@FindBy(id="email")
	WebElement useremail;
	@FindBy(id="password")
	WebElement pass;
	@FindBy(name="commit")
	WebElement submit;
	public void loginapp(String email1,String password1) 	
	{
		useremail.sendKeys(email1);
		pass.sendKeys(password1);
		submit.click();
	}
	}
	

	

