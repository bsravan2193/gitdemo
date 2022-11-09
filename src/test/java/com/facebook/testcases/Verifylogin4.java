package com.facebook.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.facebook.pages.Factory1;
import com.facebook.pages.Factory2;
import com.facebook.pages.Login;
import com.facebook.pages.Login2;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifylogin4 
{
	@Test
	public void verifyvalidlogin() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Factory2 F2=new Factory2(driver);
		F2.typeusername();
		F2.typepass();
		F2.loginbutton();
		Thread.sleep(5000);
		driver.quit();
	}  }
