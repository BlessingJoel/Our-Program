package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatusContentPage {
	
	WebDriver driver;
	public StatusContentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[@placeholder='search'])[2]")
	WebElement sendSearch;
	
	@FindBy(xpath = "(//*[text()='ABSENT'])[2]")
	WebElement clickAbsentContent;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-p')]")
	WebElement clickPresent;
	
	@FindBy(xpath = ".present:nth-of-type(1)")
	WebElement clickStatusPresent;
	
	@FindBy(xpath = "//*[text()='PUNCH OUT']")
	WebElement clickpunchOut;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-y')]")
	WebElement clickYes;
	
	@FindBy(xpath ="(//*[contains(@name,'calendar')])[1]")
	WebElement clickCalendar;
	
	public void getPresent() throws Exception{
		sendSearch.sendKeys("Demouser4");
		Thread.sleep(1000);
		clickAbsentContent.click();
		Thread.sleep(1000);
		clickPresent.click();
//		Thread.sleep(1000);
//		clickStatusPresent.click();
		Thread.sleep(3000);
		clickpunchOut.click();
		Thread.sleep(1000);
		clickYes.click();
		Thread.sleep(3000);
		clickCalendar.click();
	}
	
	@FindBy(xpath = "//*[text()='Half Day']")
	WebElement clickHalfDayContent;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-a')]")
	WebElement clickAbsent;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-la')]")
	WebElement clickLate;
	
	public void getLate() throws Exception {
//		sendSearch.sendKeys("Demouser4");
		Thread.sleep(1000);
		clickHalfDayContent.click();
		Thread.sleep(1000);
		clickAbsent.click();
		Thread.sleep(3000);
		clickAbsentContent.click();
		Thread.sleep(1000);
		clickLate.click();
		Thread.sleep(3000);
		clickCalendar.click();
	}
	
	@FindBy(xpath = "(//*[text()='LATE'])[2]")
	WebElement clickLateContent;
	
	@FindBy(xpath = "(//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-ha')])[1]")
	WebElement clickHalfDay;
	
	public void getHalfDay() throws Exception {
//		sendSearch.sendKeys("Demouser4");
		Thread.sleep(1000);
		clickLateContent.click();
		Thread.sleep(1000);
		clickHalfDay.click();
		Thread.sleep(3000);
		clickCalendar.click(); 
	}
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-ho')]")
	WebElement clickHoliday;
	
	public void getHoliday() throws Exception {
//		sendSearch.sendKeys("Demouser4");
		Thread.sleep(1000);
		clickHalfDayContent.click();
		Thread.sleep(1000);
		clickHoliday.click();
		Thread.sleep(3000);
		clickCalendar.click(); 
	}
	
	@FindBy(xpath = "//*[text()='HOLIDAY']")
	WebElement clickHolidaycontent;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-co')]")
	WebElement clickCompensatory;
	
	public void getCompensatory() throws Exception {
//		sendSearch.sendKeys("Demouser4");
		Thread.sleep(1000);
		clickHolidaycontent.click();
		Thread.sleep(1000);
		clickCompensatory.click();
		Thread.sleep(3000);
		clickCalendar.click();
	}
	
	@FindBy(xpath = "//*[text()='C OFF']")
	WebElement clickCOffContent;
	
	public void getAbsent() throws Exception {
//	sendSearch.sendKeys("Demouser4");
	Thread.sleep(1000);
	clickCOffContent.click();
	Thread.sleep(1000);
	clickAbsent.click();
	Thread.sleep(1000);
	}
}
