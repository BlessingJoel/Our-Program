package EludeWeb;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.ContentHeader;
import POM.ELLoginPage;
import POM.UserList;
import Utility.ELWeb;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserListPage {
	
	String number="1234567892";
	String mail="xyz@gmail.com";
	
	WebDriver driver;
	UserList UL;
	ELWeb UW;
	@BeforeTest
	public void OpenBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	    ELLoginPage UList=new ELLoginPage(driver);
	    UList.getURL();
	    UList.GetLogin(number, mail);
	    UL=new UserList(driver);
	    UW=new ELWeb(driver);
	    Thread.sleep(16000);
	}
	
	@Test(priority = 0,enabled = true)
	public void AddEmployee() throws Exception {
		int plus = UW.JavaRandom();
		Thread.sleep(3000);
		UW.getUserList();
		Thread.sleep(1000);
		UL.getStepOne("Aji",plus+"123123888","pandya@gmail.com");
		Thread.sleep(1000);
		UL.getListView();
		Thread.sleep(1000);
		ContentHeader CH=new ContentHeader(driver);
		CH.getCardList();
		Thread.sleep(1000);
		UW.getHome();
	}
	
	@Test(priority = 1,enabled = true)
	public void DeleteEmp() throws Exception {
		Thread.sleep(3000);
		UL.getDP();
	}
	
	@Test(priority = 2,enabled = true)
	public void AddAdmin() throws Exception {
		int plus = UW.JavaRandom();
		Thread.sleep(3000);
		UW.getUserList();
		Thread.sleep(1000);
		UL.getStepSecond("Aj",plus+"123412348", "pandya@gmail.com");
		Thread.sleep(1000);
		UL.getListView();
		Thread.sleep(1000);
		ContentHeader CH=new ContentHeader(driver);
		CH.getCardList();
		
	}
	
	
	@AfterTest(enabled = true)
	public void Close() {
		driver.quit();
	}

}
