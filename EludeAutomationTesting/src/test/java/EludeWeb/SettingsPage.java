package EludeWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.ELLoginPage;
import POM.Settings;
import Utility.ELWeb;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SettingsPage {
	
	String number="1234567892";
	String mail="xyz@gmail.com";
	
	String In="80";
	String Out="8";
	
	WebDriver driver;
	@BeforeTest
	public void OpenBroswer() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		ELLoginPage SLog=new ELLoginPage(driver);
		SLog.getURL();
		SLog.GetLogin(number, mail);
		Thread.sleep(16000);
	}
	
	@Test(priority = 0,enabled = true)
	public void SetTime() throws Throwable {
		Thread.sleep(3000);
		ELWeb ES=new ELWeb(driver);
		ES.getSetting();
		Thread.sleep(1000);
		Settings Set=new Settings(driver);
		Set.getInTime();
		Thread.sleep(1000);
		Set.getOutTime();
	}
	
	@Test(priority = 1,enabled = true)
	public void SetRadius() throws Exception {
		Thread.sleep(3000);
		ELWeb ES=new ELWeb(driver);
//		ES.getSetting();
		int Plus = ES.JavaRandom();
		Thread.sleep(1000);
		Settings Set=new Settings(driver);
		Set.getInRadius(In+Plus);
		Thread.sleep(1000);
		Set.getOutRadius(Out+Plus);
		Thread.sleep(1000);
		ES.getHome();
		Thread.sleep(1000);
		ES.getSetting();
	}
	
	@AfterTest
	public void Closed() {
		driver.quit();
	}

}
