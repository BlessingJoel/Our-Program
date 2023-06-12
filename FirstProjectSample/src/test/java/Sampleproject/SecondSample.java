package Sampleproject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SecondSample {
	
	 String[][] data= {
			 {"dimin","admin"},
			   {"adimin","adimin"},
			   {"Admin","admin123"},
			   {"aji","aj"},
	 };
	 @DataProvider(name="ajith")
	 public String[][] firstsecond(){
		 return data;
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
	
	
