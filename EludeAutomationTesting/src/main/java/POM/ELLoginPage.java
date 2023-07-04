package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELLoginPage {
	
	WebDriver driver;
	public ELLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".btn:nth-of-type(1)")
	WebElement getclick;
	
	@FindBy(xpath = "(//*[@placeholder='Enter Your Number'])[2]")
	WebElement number;
	
	@FindBy(xpath = "(//*[@placeholder='Enter Your Mail-Id'])[2]")
	WebElement mail;
	
	@FindBy(xpath = "//*[text()='Get OTP']")
	WebElement Loginclick;
	
	public void getURL() {
		driver.get("http://elude.co.in");
	}
	
	public void GetLogin(String Number,String Mail) {
		getclick.click();
		number.sendKeys(Number);
		mail.sendKeys(Mail);
		Loginclick.click();
	}

}
