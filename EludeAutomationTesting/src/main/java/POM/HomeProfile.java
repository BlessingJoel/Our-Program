package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeProfile {
	
	WebDriver driver;
	public HomeProfile(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[@class='pro-img'])[8]")
	WebElement clickUserProfile;
	
	public void getUserProfile() {
		clickUserProfile.click();
	}
	
	@FindBy(xpath = "(//*[@placeholder='Enter Your Name'])[2]")
    WebElement enterName;
	
	public void getEnterName(String Name) throws Exception {
		enterName.clear();
		Thread.sleep(1000);
		enterName.sendKeys(Name);
	}
	
	@FindBy(xpath = "(//*[@placeholder='28-06-2023'])[1]")
	WebElement clickUserDB;
	
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement clickCancel;
	
	public void getCalendar() throws Exception {
		clickUserDB.click();
		Thread.sleep(1000);
		clickCancel.click();
	}
	@FindBy(xpath = "(//*[@placeholder='Select'])[1]")
	WebElement clickGender;
	
	@FindBy(xpath = "(//*[contains(@class,'select-interface-option')])[2]")
	WebElement clickFemale;
	
	@FindBy(xpath = "(//*[@placeholder='Select'])[2]")
	WebElement clickStatus;
	
	@FindBy(xpath = "(//*[contains(@class,'sc-ion-select-popover-md md i')])[2]")
	WebElement clickMarried;
	
	@FindBy(xpath = "(//*[@placeholder='Spouse Name'])[2]")
	WebElement EnterSpouseName;
	
	@FindBy(xpath = "(//*[@placeholder='Spouse Contact No'])[2]")
	WebElement EnterSpouseNo;
	
	public void getGenderF() throws Exception {
		Thread.sleep(1000);
		clickGender.click();
		Thread.sleep(1000);
		clickFemale.click();
	}
	
	public void getStatusM(String Name,String Number) throws Exception {
		Thread.sleep(1000);
		clickStatus.click();
		Thread.sleep(1000);
		clickMarried.click();
		Thread.sleep(1000);
		EnterSpouseName.sendKeys(Name);
		Thread.sleep(1000);
		EnterSpouseNo.sendKeys(Number);
	}
	@FindBy(xpath = "(//*[contains(@class,'select-interface-option')])[1]")
	WebElement clickMale;
	
	@FindBy(xpath = "(//*[contains(@class,'sc-ion-select-popover-md md i')])[1]")
	WebElement clickSingle;
	
	public void getGenderM() throws Exception {
		Thread.sleep(1000);
		clickGender.click();
		Thread.sleep(1000);
		clickMale.click();
	}  
	
	public void getStatusS() throws Exception {
		Thread.sleep(1000);
		clickStatus.click();
		Thread.sleep(1000);
		clickSingle.click();
	}
	
	@FindBy(xpath = "(//*[contains(@placeholder,'Father')])[2]")
	WebElement EnterFName;
	
	@FindBy(xpath = "(//*[contains(@placeholder,'Father')])[4]")
	WebElement EnterFNo;
	
	@FindBy(xpath = "(//*[contains(@placeholder,'Mother')])[2]")
	WebElement EnterMName;
	
	@FindBy(xpath = "(//*[contains(@placeholder,'Mother')])[4]")
	WebElement EnterMNo;
	
	public void ParentsDetails(String FName,String Number,String MName,String MNumber) throws Exception {
		EnterFName.sendKeys(FName);
		Thread.sleep(1000);
		EnterFNo.sendKeys(Number);
		Thread.sleep(1000);
		EnterMName.sendKeys(MName);
		Thread.sleep(1000);
		EnterMNo.sendKeys(MNumber);
	}
	
	@FindBy(xpath = "(//*[@placeholder='Enter Your First Address'])[2]")
	WebElement EnterAddressOne;
	
	@FindBy(xpath = "(//*[@placeholder='Enter Your Second Address'])[2]")
	WebElement EnterAddressTwo;
	
	public void getAddress(String Place1,String Place2) throws Exception {
		EnterAddressOne.sendKeys(Place1);
		Thread.sleep(1000);
		EnterAddressTwo.sendKeys(Place2);
	}
	
	@FindBy(xpath = "(//*[@placeholder='28-06-2023'])[2]")
	WebElement clickJoinDate;
	
	@FindBy(xpath = "(//*[@placeholder='Select'])[3]")
	WebElement clickOrg;
	
	@FindBy(xpath = "(//*[contains(@class,'select-interface-option')])[2]")
	WebElement SelectOrgContent;
	
	@FindBy(xpath = "(//*[@placeholder='Select'])[4]")
	WebElement clickDept;
	
	@FindBy(xpath = "(//*[contains(@class,'select-interface-option')])[2]")
	WebElement SelectDeptContent;
	
	@FindBy(xpath = "(//*[@placeholder='Select'])[5]")
	WebElement clickDest;
	
	@FindBy(xpath = "(//*[contains(@class,'select-interface-option')])[1]")
	WebElement SelectDestContent;
	
	@FindBy(xpath = "(//*[text()='Save'])[2]")
	WebElement clickPSave;
	
	public void getWorkingProfile() throws Exception {
		clickJoinDate.click();
		Thread.sleep(1000);
		clickCancel.click();
		Thread.sleep(1000);
		clickOrg.click();
		Thread.sleep(1000);
		SelectOrgContent.click();
		Thread.sleep(1000);
		clickDept.click();
		Thread.sleep(1000);
		SelectDeptContent.click();
		Thread.sleep(1000);
		clickDest.click();
		Thread.sleep(1000);
		SelectDestContent.click();
		Thread.sleep(1000);
		clickPSave.click();
	}
}
