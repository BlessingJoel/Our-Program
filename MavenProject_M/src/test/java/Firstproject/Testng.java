package Firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng {
	
	
	WebDriver driver=null;
	
//	@BeforeTest
//	public void testng() {
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver/chromedriver.exe");
//		driver=new ChromeDriver();
//		
//		driver.get("https://google.com");
//		
//	}
	@Test
	public void second() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Hardik pandya");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
//	@AfterTest
//	public void third() {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://google.com");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
	
	                    

}
