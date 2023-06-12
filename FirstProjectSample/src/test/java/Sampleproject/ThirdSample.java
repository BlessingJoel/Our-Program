package Sampleproject;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;

public class ThirdSample {
	String[][] data= null;
	 @DataProvider(name="ajith")
	 public String[][] firstsecond() throws Exception {
		 data=getexceldata();
		 return data;
	 }
	 public String[][] getexceldata() throws Exception {
		 FileInputStream file=new FileInputStream("./Datadriven.xls");
		 Workbook book=Workbook.getWorkbook(file);
		 Sheet sheet = book.getSheet(0);
		 int row = sheet.getRows();
		 int col = sheet.getColumns();
		 String[][] testdata = new String[row-1][col];
		 
		 for(int i=1;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 testdata[i-1][j]=sheet.getCell(j, i).getContents();
			 }
		 }
		 return testdata;
	 }
	 
	 
	@Test(dataProvider = "ajith")
	public void second(String uname,String upassword) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys(uname,Keys.TAB,upassword,Keys.TAB,Keys.TAB.ENTER);
	Thread.sleep(3000);
		driver.quit();
	}
}
