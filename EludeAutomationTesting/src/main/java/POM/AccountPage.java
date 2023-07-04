package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	WebDriver driver;
	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[text()='Acc Details >>'])[2]")
	WebElement clickAccount;
	
	@FindBy(xpath = "(//*[@placeholder='Account Holder Name'])[2]")
	WebElement EnterHName;
	
	@FindBy(xpath = "(//*[@placeholder='Account No'])[2]")
	WebElement EnterAccNo;
	
	@FindBy(xpath = "(//*[@placeholder='IFSC Code'])[2]")
	WebElement EnterIFSC;
	
	@FindBy(xpath = "(//*[@placeholder='Branch Name'])[2]") 
	WebElement EnterBName;
	
	@FindBy(xpath = "(//*[@placeholder='Aadhar No'])[2]")
	WebElement EnterAadharNO;
	
	@FindBy(xpath = "(//*[@placeholder='Pan No'])[2]")
	WebElement EnterPanNo;
	
	public void getAccDetails() throws Exception {
		clickAccount.click();
		Thread.sleep(1000);
		EnterHName.clear();
		EnterHName.sendKeys("Hardik");
		Thread.sleep(1000);
		EnterAccNo.clear();
		EnterAccNo.sendKeys("2501502056524");
		Thread.sleep(1000);
		EnterIFSC.clear();
		EnterIFSC.sendKeys("SBIN0005943");
		Thread.sleep(1000);
		EnterBName.clear();
		EnterBName.sendKeys("Udangudi");
		Thread.sleep(1000);
		EnterAadharNO.clear();
		EnterAadharNO.sendKeys("0000 1111 2222");
		Thread.sleep(1000);
		EnterPanNo.clear();
		EnterPanNo.sendKeys("ABCTY1234D");
	}
	
	@FindBy(xpath = "(//*[@placeholder='Initial Pay'])[2]")
	WebElement EnterInitialPay;
	
	@FindBy(xpath = "(//*[@placeholder='28-06-2023'])[1]")
	WebElement clickFrstCalendar;

	@FindBy(xpath = "//*[text()='CANCEL']")
	WebElement clickCancel;
	
	@FindBy(xpath = "(//*[@placeholder='First Increament'])[2]")
	WebElement EnterFirstIncretment;
	
	@FindBy(xpath = "(//*[text()='Save'])[2]")
	WebElement clickPASave;
	
	public void getPayRole() throws Exception {
		EnterInitialPay.clear();
		EnterInitialPay.sendKeys("1000");
		Thread.sleep(1000);
		clickFrstCalendar.click();
		Thread.sleep(1000);
		clickCancel.click();
		Thread.sleep(1000);
		EnterFirstIncretment.clear();
		EnterFirstIncretment.sendKeys("500");
		Thread.sleep(1000);
		clickPASave.click();
	}
	
	@FindBy(name  = "arrow-back-outline")
	WebElement clickBackArrow;
	
	public void getCheck() throws InterruptedException {
		clickAccount.click();
		Thread.sleep(1000);
		clickBackArrow.click();
	}
}
