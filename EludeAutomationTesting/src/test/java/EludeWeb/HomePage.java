package EludeWeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.ContentHeader;
import POM.ELLoginPage;
import POM.Home;
import POM.PresentPage;
import POM.StatusContentPage;
import Utility.ELWeb;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
	
     String mail="xyz@gmail.com";
     String number="1234567892";
     
	WebDriver driver;
	Home home;
	ELWeb web;
	
	@BeforeTest
	public void OpenBrowser() throws Exception {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	driver.manage().window().maximize();
//	driver.get("http://elude.co.in");
	ELLoginPage login=new ELLoginPage(driver);
	login.getURL();
	login.GetLogin(number,mail );
	home=new Home(driver);
	web=new ELWeb(driver);
    Thread.sleep(16000);
	}
	
	@Test(priority = 0,enabled = true)
	public void FootContent() throws Exception {
		web.getUserList();
		Thread.sleep(1000);
		web.getNotification();
		Thread.sleep(1000);
		web.getSetting();
		Thread.sleep(1000);
		web.getHome();
	}
	
	@Test(priority = 1,enabled = true)
	public void StatusHContent() throws InterruptedException{
		
		Thread.sleep(3000);
		home.getPresent();
		home.getLate();
		home.getLeave();
		home.getAbsent();
		home.getTotal();
		
//		driver.findElement(By.cssSelector(".present:nth-of-type(1)")).click();
//		List<WebElement> present = driver.findElements(By.cssSelector(".emp-card:nth-of-type(2)"));
//		WebElement one = present.stream().filter(pro->pro.findElement(By.cssSelector("ion-label")).getText().equalsIgnoreCase("BLESSING   ")).findFirst().orElse(null);
//		one.findElement(By.xpath("//*[@name='calendar-number-outline']")).click();
	}
	
	@Test(priority = 2,enabled = true)
	public void Present() throws Exception {
		//Blessing
		Thread.sleep(3000);
		home.getPresent();
		PresentPage page=new PresentPage(driver);
		page.getCalendar();
		Thread.sleep(1000);
		web.Back(driver);
		Thread.sleep(2000);
		home.getPresent();
		Thread.sleep(1000);
		page.getWhats();
		Thread.sleep(1000);
		web.Back(driver);
		Thread.sleep(2000);
		home.getPresent();
		Thread.sleep(1000);
		page.getDetails();
	}
	
	@Test(priority = 3,enabled = true)
	public void PresentDetails() throws Exception {
		Thread.sleep(3000);
		PresentPage page=new PresentPage(driver);
		page.getPermission();
		page.getLeave();
		Thread.sleep(2000);
		page.getOk();
	}
	
	@Test(priority = 4,enabled = false)
	public void Late() {
		//Vijay
		home.getLate();
		PresentPage page=new PresentPage(driver);
		page.getCalendar();
		web.Back(driver);
		home.getLate();
		page.getWhats();
		web.Back(driver);
		home.getLate();
		page.getDetails();
		web.Back(driver);
	}
	
	@Test(priority = 5,enabled = false)
	public void LateDetails() throws Exception {
		Thread.sleep(3000);
		PresentPage page=new PresentPage(driver);
		page.getPermission();
		page.getLeave();
		Thread.sleep(2000);
		page.getDelete();
		page.getCancel();
		web.Back(driver);
	}
	
	@Test(priority = 6,enabled = true)
	public void Leave() throws Exception {
		//Demouser223
		Thread.sleep(3000);
		home.getLeave();
		PresentPage page=new PresentPage(driver);
		page.getCalendar();
		web.Back(driver);
		Thread.sleep(1000);
		home.getLeave();
		Thread.sleep(2000);
		page.getWhats();
		web.Back(driver);
		Thread.sleep(2000);
		home.getLeave();
		page.getDetails();
		web.Back(driver);
	}
	
	@Test(priority = 7,enabled = false)
	public void Absent() {
		home.getAbsent();
//		driver.findElement(By.cssSelector(".present:nth-of-type(1)")).click();
		List<WebElement> present = driver.findElements(By.cssSelector(".emp-card:nth-of-type(2)"));
		WebElement one = present.stream().filter(pro->pro.findElement(By.cssSelector("ion-label")).getText().equals("+915589098543")).findFirst().orElse(null);
		one.findElement(By.xpath("//*[@name='calendar-number-outline']")).click();
//		PresentPage page=new PresentPage(driver);
//		page.getCalendar();
	}
	
	
	//21
	@Test(priority = 8,enabled = true)
	public void CHStepOne() throws Throwable {
		Thread.sleep(1000);
	ContentHeader CH=new ContentHeader(driver);
	CH.getClickRArrow();
//	Thread.sleep(3000);
	CH.getSearch("demouser4");
	Thread.sleep(1000);
	CH.getFirstContent();
	Thread.sleep(1000);
	CH.getHday();
	Thread.sleep(1000);
	CH.getSecondContent();
	Thread.sleep(1000);
	CH.getAbsent();
	Thread.sleep(1000);
	CH.getPageRefresh();
	}
	
	
	//20
	@Test(priority = 9,enabled = true)
	public void CHStepTwo() throws Exception {
		
		Thread.sleep(1000);
		ContentHeader CH=new ContentHeader(driver);
		CH.getClickRArrow();
		CH.getClickRArrow();
		CH.getSearch("blessing");
		Thread.sleep(1000);
		CH.getFirstContent();
		Thread.sleep(1000);
		CH.getPresentContent();
		Thread.sleep(1000);
		CH.getThirdContent();
		Thread.sleep(1000);
		CH.getAbsent();
		Thread.sleep(1000);
		CH.getPageRefresh();
	}
	
	@Test(priority = 10,enabled = true)
	public void ContentHeaderIcon() throws Exception {
		Thread.sleep(1000);
		ContentHeader CH=new ContentHeader(driver);
		CH.getIconView();
		Thread.sleep(1000);
		home.getContentPresent();
		Thread.sleep(1000);
		home.getContentLeave();
		Thread.sleep(1000);
		home.getContentLate();
		Thread.sleep(1000);
		home.getContentAbsent();
		Thread.sleep(1000);
		CH.getContentCalendar();
		Thread.sleep(1000);
		web.getMenuBar();
		Thread.sleep(1000);
		web.getHome();
		Thread.sleep(1000);
		CH.getIconView();
		Thread.sleep(1000);
		CH.getBlack();
	}
	
	@Test(priority = 11,enabled = true)
	public void ContentHeaderList() throws Exception {
		ContentHeader CH=new ContentHeader(driver);
		Thread.sleep(1000);
		CH.getListView();
		Thread.sleep(1000);
		web.getMenuBar();
		Thread.sleep(1000);
		web.getHome();
//		Thread.sleep(1000);
//		CH.getListView();
		Thread.sleep(1000);
		CH.getCardList();
	}
	
	@Test(priority = 12,enabled = true)
	public void StatusContent() throws Exception {
		Thread.sleep(1000);
		StatusContentPage Sc=new StatusContentPage(driver);
		Sc.getPresent();
		Thread.sleep(1000);
		web.Back(driver);
		Thread.sleep(1000);
		Sc.getLate();
		Thread.sleep(1000);
		web.Back(driver);
		Thread.sleep(1000);
		Sc.getHalfDay();
		Thread.sleep(1000);
		web.Back(driver);
		Thread.sleep(1000);
		Sc.getHoliday();
		Thread.sleep(1000);
		web.Back(driver);
		Thread.sleep(1000);
		Sc.getCompensatory();
		Thread.sleep(1000);
		web.Back(driver);
		Thread.sleep(1000);
		Sc.getAbsent();
		Thread.sleep(1000);
		web.Back(driver);
	}
	
	@AfterTest(enabled = true)
	public void close() {
		driver.quit();
	}

}
