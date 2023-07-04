package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Notifications {
	
	WebDriver driver;
	public Notifications(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Late Request']")
	WebElement clickLateRequest;
	
	@FindBy(xpath = "//*[text()='Leave Request']")
    WebElement clickLeaveRequest;
	
	public void getLateRequest() throws Exception {
		clickLateRequest.click();
		Thread.sleep(1000);
		clickLeaveRequest.click();
	}
	
	@FindBy(css = ".approve:nth-of-type(1)")
	WebElement clickApprove;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-c')]")
	WebElement clickCancel;
	
	public void getApprove() throws Exception {
		clickApprove.click();
		Thread.sleep(1000);
		clickCancel.click();
	}
	
	@FindBy(css = ".reject:nth-of-type(2)")
	WebElement clickReject;
	
//	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-c')]")
//    WebElement clickCancel2;
	
	public void getReject() throws Exception {
		clickReject.click();
		Thread.sleep(1000);
		clickCancel.click();
	}
	
	@FindBy(xpath = "//*[@name='trash-outline']")
	WebElement ClickDelete;
	
	
	public void getDelete() throws Exception {
		ClickDelete.click();
		Thread.sleep(1000);
		clickCancel.click();
	}

}
