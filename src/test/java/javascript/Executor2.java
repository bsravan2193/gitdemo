package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor2 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\shami\\chromedriver.exe");
		WebDriver sravan=new ChromeDriver(); 
		sravan.manage().window().maximize();
		sravan.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html"); 
		WebElement element=sravan.findElement(By.xpath("//div[@id='mCSB_3_container']/p[3]"));
		JavascriptExecutor js=(JavascriptExecutor)sravan;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		System.out.println(element.getText());
		
			}

}
