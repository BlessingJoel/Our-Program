package LoginDemo;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class CorrectUser {
	String[][]data=null;
	WebDriver driver;
	@DataProvider(name="vaild")
	public String[][] datadriver() throws  Exception {
		data=getexceldata();
		return data;
	}
	
	public String[][] getexceldata() throws IOException, Exception {
		FileInputStream file=new FileInputStream("E:/AJI/DataDriven/Datadriven.xls");
		Workbook book=Workbook.getWorkbook(file);
		Sheet sheet = book.getSheet(0);
		int row = sheet.getRows();
		int colm = sheet.getColumns();
		
		String testdata[][]=new String[row-1][colm];
		
		for(int i=1; i<row;i++) {
		  for(int j=0;j<colm;j++) {
			  testdata[i-1][j]=sheet.getCell(j, i).getContents();
			  }
		  }
		return testdata;
	}
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	@Test(dataProvider = "vaild")
	public void correctuser(String uname,String pword) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pword);
		driver.findElement(By.xpath("//*[contains(@class,'oxd-button oxd-button')]")).click();
		}
	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
