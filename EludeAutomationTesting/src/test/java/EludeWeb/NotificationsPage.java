package EludeWeb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.ELLoginPage;
import POM.Notifications;
import Utility.ELWeb;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationsPage {
	
	String number="1234567892";
	String mail="xyz@gmail.com";
	
	WebDriver driver;
	@BeforeTest
	public void OpenBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		ELLoginPage NLog=new ELLoginPage(driver);
		NLog.getURL();
		NLog.GetLogin(number, mail);
		Thread.sleep(16000);
	}
	
	@Test
	public void NotifictionsFunction() throws Exception {
		Thread.sleep(3000);
		ELWeb EN=new ELWeb(driver);
		EN.getNotification();
		Thread.sleep(1000);
		Notifications Not=new Notifications(driver);
		Not.getLateRequest();
		Thread.sleep(1000);
		Not.getApprove();
		Thread.sleep(1000);
		Not.getReject();
		Thread.sleep(1000);
		Not.getDelete();
	}
	
	@AfterTest
	public void Closed() {
		driver.quit();
	}

}
