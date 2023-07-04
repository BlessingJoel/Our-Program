package EludeWeb;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.ELLoginPage;
import MenuBarPOM.LogOutPage;
import MenuBarPOM.OrganizationPage;
import MenuBarPOM.ProfilePage;
import Utility.ELWeb;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuBarPage {
	String number="1234567892";
	String mail="xyz@gmail.com";
	
//	Change the Calendar Date(POM-ProfilePage)
	
	WebDriver driver;
	@BeforeTest
	public void OpenBroswer() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		ELLoginPage EM=new ELLoginPage(driver);
		EM.getURL();
		EM.GetLogin(number,mail );
		Thread.sleep(16000);
	}
	
	@Test(priority = 0,enabled = true)
	public void Profile() throws Exception {
		Thread.sleep(1000);
		ELWeb EP=new ELWeb(driver);
		EP.getUserList();
		Thread.sleep(1000);
		EP.getMenuBar();
		Thread.sleep(1000);
		ProfilePage MP=new ProfilePage(driver);
		MP.getProfile();
		MP.getGender();
		MP.getStatus();
		Thread.sleep(1000);
		MP.getAddress();
		Thread.sleep(1000);
		MP.getSave();
		Thread.sleep(1000);
		EP.Refresh(driver);
		Thread.sleep(1000);
		MP.getBackArrow();
		Thread.sleep(1000);
		EP.Back(driver);
	}
	
	@Test(priority = 1,enabled = true)
	public void SetOrg() throws Exception {
		Thread.sleep(1000);
		ELWeb EO=new ELWeb(driver);
		EO.getNotification();
		Thread.sleep(1000);
		EO.getMenuBar();
		Thread.sleep(1000);
		OrganizationPage MO=new OrganizationPage(driver);
		MO.getOrg();
		Thread.sleep(1000);
		MO.getOrgContent();
//		Thread.sleep(1000);
//		EO.getSetting();
	}
	
	@Test(priority = 2)
	public void LogOut() throws Exception {
		ELWeb EL=new ELWeb(driver);
		EL.getSetting();
		Thread.sleep(1000);
		EL.getMenuBar();
		Thread.sleep(1000);
		LogOutPage ML=new LogOutPage(driver);
		ML.getLogOutNO();
		Thread.sleep(1000);
		EL.getMenuBar();
		Thread.sleep(1000);
		ML.getLogOutYes();
	}
	
	@AfterTest
	public void Closed() {
		driver.quit();
	}

}
