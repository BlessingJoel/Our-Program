package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserList {
	
	WebDriver driver;
	public UserList(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Admin')])[2]")
	WebElement clickAdmin;
	
	@FindBy(xpath = "(//*[contains(text(),'Employee')])[2]")
	WebElement clickEmployee;
	
	@FindBy(xpath = "//*[text()=' Add Employee']")
	WebElement clickAddEmp;
	
	@FindBy(xpath = "(//*[@placeholder='Enter Employee Name'])[2]")
	WebElement sendEmpName;
	
	@FindBy(xpath = "(//*[@placeholder='Enter Mobile number'])[2]")
	WebElement sendNumber;
	
	@FindBy(xpath = "(//*[@placeholder='Enter Email-Id'])[2]")
	WebElement sendMail;
	
	@FindBy(css = ".buttons1:nth-of-type(2)")
	WebElement clickAdd;
	
	public void getStepOne(String Name,String Number,String Mail) throws Exception {
		clickAdmin.click();
        clickEmployee.click();
		clickAddEmp.click();
		Thread.sleep(1000);
		sendEmpName.sendKeys(Name);
		sendNumber.sendKeys(Number);
		sendMail.sendKeys(Mail);
		Thread.sleep(1000);
		clickAdd.click();
	}
	
	@FindBy(xpath = "//*[text()=' Add Admin']")
	WebElement clickAddAdm;
	
	@FindBy(xpath = "(//*[@placeholder='Enter Admin Name'])[2]")
	WebElement sendAdmName;
	
	public void getStepSecond(String Name,String Number,String Mail) throws Exception {
		clickAdmin.click();
		clickAddAdm.click();
		sendAdmName.sendKeys(Name);
		sendNumber.sendKeys(Number);
		sendMail.sendKeys(Mail);
		Thread.sleep(1000);
		clickAdd.click();
	}
	
	@FindBy(xpath = "(//*[@class='pro-img'])[10]")
	WebElement clickDP;
	
	@FindBy(xpath = "(//*[@class='btn delete'])[2]")
	WebElement clickDelete;
	
	public void getDP() {
		clickDP.click();
		clickDelete.click();
	}
	
	@FindBy(xpath = "(//*[text()='List View'])[2]")
	WebElement clickListView;
	
	public void getListView() {
		clickListView.click();
	}
}
