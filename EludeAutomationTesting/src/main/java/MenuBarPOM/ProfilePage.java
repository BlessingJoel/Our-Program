package MenuBarPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utility.ELWeb;


public class ProfilePage {
	
	WebDriver driver;
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[name='person-circle-outline']")
	WebElement clickProfile;
	
	@FindBy(xpath = "(//*[@placeholder='28-06-2023'])[1]")
	WebElement clickDBCalendar;
	
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement clickCancel;
	
	@FindBy(xpath = "(//*[@placeholder='Select'])[1]")
	WebElement clickGender;
	
	@FindBy(xpath = "//*[contains(@class,'sc-ion-select-popover-md md in-item interactive ra')]")
	WebElement clickMale;
	
	@FindBy(xpath = "(//*[@placeholder='Select'])[2]")
	WebElement clickStatus;
	
	@FindBy(xpath = "(//*[contains(@class,'sc-ion-select-popover-md md i')])[1]")
	WebElement clickSingle;
   
	public void getProfile() throws Exception {
		
		clickProfile.click();
		Thread.sleep(1000);
		clickDBCalendar.click();
		Thread.sleep(1000);
		clickCancel.click();
	}
	
	public void getGender() throws Exception {
		Thread.sleep(1000);
		clickGender.click();
		Thread.sleep(1000);
		clickMale.click();
	}
	
	public void getStatus() throws Exception {
		Thread.sleep(1000);
		clickStatus.click();
		Thread.sleep(1000);
		clickSingle.click();
	}
	
	@FindBy(xpath = "(//*[@placeholder='Enter Your Address'])[2]")
	WebElement enterAddress;
	
	@FindBy(css = "[aria-checked='false']")
	WebElement clickCheckBox;
	
	@FindBy(xpath = "(//*[text()='Save'])[2]")
	WebElement clickSaveButton;
	
	@FindBy(name = "arrow-back")
	WebElement clickBackArrow;
	
	
	public void getAddress() throws Exception {
		enterAddress.clear();
		enterAddress.sendKeys("udangudi");
		Thread.sleep(1000);
		clickCheckBox.click();
	}
	
	public void getSave() {
		clickSaveButton.click();
		}
	public void getBackArrow() {
		clickBackArrow.click();
	}
}
