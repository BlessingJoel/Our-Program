package EludeWeb;

import java.time.Duration;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.AccountPage;
import POM.ELLoginPage;
import POM.HomeProfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserProfilePage {
	String number="1234567892";
	String mail="xyz@gmail.com";
	
//	Change the Calendar Date(POM-HomeProfile,AccountPage)
	
    WebDriver driver;
    HomeProfile HP;
	@BeforeTest
	public void OpenBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		ELLoginPage Plog=new ELLoginPage(driver);
		Plog.getURL();
		Plog.GetLogin(number, mail);
		HP=new HomeProfile(driver);
		Thread.sleep(16000);
	}
	
	@Test(priority = 0,enabled = true)
	public void EnterName() throws Exception {
		HP.getUserProfile();
		Thread.sleep(1000);
		HP.getEnterName("Pandya");
	}
	
	@Test(priority = 1,enabled = true)
	public void Calendar() throws Exception {
		Thread.sleep(1000);
		HP.getCalendar();
	}
	
	@Test(priority = 2,enabled = true)
	public void SetStatusMarried() throws Exception {
		Thread.sleep(1000);
		HP.getGenderF();
		Thread.sleep(1000);
		HP.getStatusM("Princess","1234512345");
	}
	
	@Test(priority = 3,enabled = true)
	public void SetStatusSingle() throws Exception {
		Thread.sleep(1000);
		HP.getGenderM();
		Thread.sleep(1000);
		HP.getStatusS();
	}
	
	@Test(priority = 4,enabled = true)
	public void EnterParentsDetails() throws Exception {
		Thread.sleep(1000);
		HP.ParentsDetails("King", "1231237239", "Queen", "1231237238");
	}
	
	@Test(priority = 5,enabled = true)
	public void Address() throws Exception {
		Thread.sleep(1000);
		HP.getAddress("Udangudi,Tuti", "Tuti");
	}
	
	@Test(priority = 6)
	public void WorkingProfile() throws Exception {
		Thread.sleep(1000);
		HP.getWorkingProfile();
	}
	
	@Test(priority = 7)
	public void AccountDetails() throws Exception {
		Thread.sleep(5000);
		HP.getUserProfile();
		Thread.sleep(1000);
		AccountPage AD=new AccountPage(driver);
		AD.getAccDetails();
		Thread.sleep(1000);
		AD.getPayRole();
	}
	
	@Test(priority = 8)
	public void Check() throws Exception {
		Thread.sleep(5000);
		HP.getUserProfile();
		Thread.sleep(1000);
		AccountPage AD=new AccountPage(driver);
		AD.getCheck();
		Thread.sleep(2000);
	}
	
	
	@AfterTest(enabled = true)
	public void Closed() {
		driver.quit();
	}
}

