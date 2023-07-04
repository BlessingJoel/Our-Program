package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PresentPage {
	
	WebDriver driver;
	public PresentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[contains(@name,'calendar')])[1]")
	WebElement clickCalendar;
	
	@FindBy(xpath = "(//*[@name='logo-whatsapp'])[1]")
	WebElement clickWhats;
	
	@FindBy(xpath = "(//*[@name='calendar-outline'])[1]")
	WebElement clickDetails;
	
	@FindBy(xpath = "//*[text()='Permissions']")
	WebElement clickPermission;
	
	@FindBy(xpath = "//*[text()='Leave']")
	WebElement clickLeave;
	
	@FindBy(xpath = "//*[text()='OK']")
	WebElement clickOk;
	
	@FindBy(xpath = "//*[@class='delete md hydrated']")
	WebElement clickDelete;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-group a')]")
	WebElement clickCancel;
	
	public void getCalendar() {
		clickCalendar.click();
	}
	
	public void getWhats() {
		clickWhats.click();
	}
	
	public void getDetails() {
		clickDetails.click();
	}
	
	public void getPermission() {
		clickPermission.click();
	}
	
	public void getLeave() {
		clickLeave.click();
	}
	
	public void getOk() {
		clickOk.click();
	}
	
	public void getDelete() {
		clickDelete.click();
	}
	
	public void getCancel() {
		clickCancel.click();
	}

}
