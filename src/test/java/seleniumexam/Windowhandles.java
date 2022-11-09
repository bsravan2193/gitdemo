package seleniumexam;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rahulshetty.Landingclass;

public class Windowhandles {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Landingclass lc=new Landingclass(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(3000);
		Set<String> handles=driver.getWindowHandles();
		for(String a1:handles)
		{
			System.out.println(a1);
		}
		System.out.println(handles);
		Iterator<String> I1=handles.iterator();
		String parent=I1.next();
		String child=I1.next();
		driver.switchTo().window(child);
		driver.findElement(By.id("firstName")).sendKeys("sravan");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.id("name")).sendKeys("kumar");
		Thread.sleep(3000);
		driver.close(); 
		
	}

}
