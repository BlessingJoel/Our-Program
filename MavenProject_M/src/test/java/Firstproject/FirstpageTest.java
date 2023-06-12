package Firstproject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstpageTest {

	public static void main(String[] args) {
		createpage();
	}
		public static void createpage() {
		 
//			WebDriverManager.chromedriver().setup();
    String path=System.getProperty("user.dir");
     System.setProperty("webdriver.chrome.driver", path+"/Drivers/chromedriver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
     
     driver.get("https://google.com");
     
     Pages.Firstpage.search(driver).sendKeys("hardik pandya");
     Pages.Firstpage.search(driver).sendKeys(Keys.RETURN);
     
     }
	

}
