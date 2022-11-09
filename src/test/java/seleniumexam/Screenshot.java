package seleniumexam;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.get("https://www.w3schools.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
	    TakesScreenshot ts =(TakesScreenshot)driver;
	    File fs=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyDirectory(fs, new File("./screenshot/image1.png") );
	    driver.quit();    	} }
