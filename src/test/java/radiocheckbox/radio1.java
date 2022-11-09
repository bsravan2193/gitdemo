package radiocheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver(); 
		sravan.manage().window().maximize();
		sravan.get("https://www.hyrtutorials.com/p/basic-controls.html"); 
		Thread.sleep(3000);
		System.out.println(sravan.findElement(By.id("malerb")).isEnabled());
		System.out.println(sravan.findElement(By.id("malerb")).isDisplayed());
		System.out.println(sravan.findElement(By.id("malerb")).isSelected());
		sravan.findElement(By.id("femalerb")).click();
		
		sravan.quit();

	}

}
