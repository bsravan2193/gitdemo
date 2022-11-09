package radiocheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver(); 
		sravan.manage().window().maximize();
		sravan.get("https://www.facebook.com/"); 
		Thread.sleep(3000);
		sravan.findElement(By.xpath("//a[contains(@data-testid,'open')]")).click();
		Thread.sleep(2000);
		List <WebElement> radios=sravan.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radios.size());
		radios.get(0).click();
		Thread.sleep(3000);
		radios.get(1).click();
		Thread.sleep(3000);
		radios.get(2).click();
		Thread.sleep(3000); 		
		sravan.quit(); 
	}

}
