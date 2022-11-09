package com.facebook.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.pages.Factory1;
import com.facebook.pages.Factory2;
import com.facebook.pages.Factory3;
import com.facebook.pages.Login;
import com.facebook.pages.Login2;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifylogin5 
{
	@Test
	public void verifyvalidlogin() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Factory3 F3=new Factory3(driver);
		F3.typeusername();
		F3.typepass();
		F3.loginbutton();
		Thread.sleep(5000);
		driver.quit();
	}  }
