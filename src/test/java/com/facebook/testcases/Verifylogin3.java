package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.pages.Factory1;
import com.facebook.pages.Login;
import com.facebook.pages.Login2;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifylogin3 
{
	@Test
	public void verifyvalidlogin() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Factory1 F1=new Factory1(driver);
		F1.typeusername();
		F1.typepass();
		F1.loginbutton();
		Thread.sleep(5000);
		driver.quit();
	}  }
