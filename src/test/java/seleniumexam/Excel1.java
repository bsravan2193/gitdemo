package seleniumexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel1 {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("D:\\shami\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("sravan");
		System.out.println(sh.getSheetName());
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getPhysicalNumberOfRows()); 	
		System.out.println(sh.getRow(0).getLastCellNum());
        int rows=sh.getPhysicalNumberOfRows();
        int col=sh.getRow(0).getLastCellNum();
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		System.out.print(sh.getRow(i).getCell(j).getStringCellValue());
        		System.out.print("   ");
        	}
        	System.out.println();
        }
        XSSFSheet sh1=wb.getSheet("facebook");
       String username=sh1.getRow(0).getCell(0).getStringCellValue();
       String userpassword=sh1.getRow(0).getCell(1).getStringCellValue();
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("email")).sendKeys(userpassword);
        Thread.sleep(5000);
        driver.quit();
	} }
