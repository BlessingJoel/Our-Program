package MenuBarPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	
	WebDriver driver;
	public LogOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "log-out-outline")
	WebElement clickLogOut;
	
	@FindBy(xpath = "//*[text()='No']")
	WebElement clickNO;
	
	public void getLogOutNO() {
		clickLogOut.click();
		clickNO.click();
	}
	
	@FindBy(xpath = "//*[text()='Yes']")
	WebElement clickYes;
	
	public void getLogOutYes() {
		clickLogOut.click();
		clickYes.click();
	}

}
