package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver();
		sravan.manage().window().maximize();
		sravan.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sravan.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement element=sravan.findElement(By.xpath("//select[@id='course']"));
		Select so=new Select(element);
		so.selectByIndex(0);
		Thread.sleep(3000);
		so.selectByVisibleText("Python");
		Thread.sleep(3000);
		so.selectByValue("net");
		Thread.sleep(3000);
		WebElement element1=sravan.findElement(By.xpath("//select[@id='ide']"));
		Select so1=new Select(element1);
		so1.selectByIndex(0);
		so1.selectByIndex(1);
		Thread.sleep(3000);
		so1.deselectByIndex(0);
		Thread.sleep(3000);
	    so1.deselectAll();
	    List <WebElement> element2 =so1.getOptions();
	    for(WebElement a:element2)
	    {
	    	System.out.println(a.getText()); 	    	
	    }
	    System.out.println(so.getFirstSelectedOption().getText());
		sravan.quit();
	}

}
