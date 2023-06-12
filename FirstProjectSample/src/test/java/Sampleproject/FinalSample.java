package Sampleproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class FinalSample {
	String[][]data= null;
	WebDriver driver;
	@DataProvider(name="invaild")
	public String[][] dataprovided() throws Throwable {
		data=getexceldata();
		return data;
	}
	
	public String[][] getexceldata() throws Exception {
		FileInputStream file=new FileInputStream("./Datadriven.xls");
		Workbook book = Workbook.getWorkbook(file);
		Sheet sheet = book.getSheet(0);
		int row = sheet.getRows();
		int col = sheet.getColumns();
		String[][]testdata=new String[row-1][col];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				testdata[i-1][j]=sheet.getCell(j, i).getContents();
			}
		}
		return testdata;
	}
	@BeforeTest
	public void before() {
		WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		
	}
	@Test(dataProvider = "invaild")
	public void first(String name,String password) throws Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys(name,
				Keys.TAB,password,Keys.TAB.ENTER);
		}
	@AfterTest
	public void after() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
