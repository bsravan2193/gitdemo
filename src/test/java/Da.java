import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Da {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver sravan=new ChromeDriver();
		sravan.get("https://www.facebook.com/");
		Thread.sleep(3000);
		sravan.quit();

	}

}
