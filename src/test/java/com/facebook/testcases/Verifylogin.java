package com.facebook.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.pages.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifylogin 
{
	@Test
	public void verifyvalidlogin()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Login L1=new Login(driver);
		L1.typeusername();
		L1.typepass();
		L1.loginbutton();
		driver.quit();
	} }
