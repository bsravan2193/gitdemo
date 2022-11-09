package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.pages.Login;
import com.facebook.pages.Login2;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifylogin2 
{
	@Test
	public void verifyvalidlogin()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Login2 L2=new Login2(driver);
		L2.typeusername("bsravan2193@gmail.com");
		L2.typepass("Gndec@61e");
		L2.loginbutton();
		driver.quit();
	}  }
