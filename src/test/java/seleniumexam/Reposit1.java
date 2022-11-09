package seleniumexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reposit1 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenum1\\Repository\\sample1.properties");
        Properties pro=new Properties();
        pro.load(fis);
        driver.get(pro.getProperty("site"));
        Thread.sleep(5000);
        driver.findElement(By.id(pro.getProperty("emailid"))).sendKeys(pro.getProperty("data1"));
        driver.findElement(By.id(pro.getProperty("emailpassword"))).sendKeys(pro.getProperty("data2"));
        Thread.sleep(5000);
        driver.quit();  	
        
	}  }
