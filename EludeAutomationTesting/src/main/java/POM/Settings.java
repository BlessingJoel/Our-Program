package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings {
	
	WebDriver driver;
	public Settings(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[contains(@class,'sc-ion-input-md-h sc-ion-input-md-s md hydrated h')])[1]")
	WebElement clickInTime;
	
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement clickCancel;
	
	public void getInTime() throws Throwable {
		clickInTime.click();
		Thread.sleep(1000);
		clickCancel.click();
	}
	
	@FindBy(xpath = "(//*[contains(@class,'sc-ion-input-md-h sc-ion-input-md-s md hydrated h')])[2]")
	WebElement clickOutTime;
	
	public void getOutTime() throws InterruptedException {
		clickOutTime.click();
		Thread.sleep(1000);
		clickCancel.click();
	}
	
	@FindBy(xpath = "(//*[@class='native-input sc-ion-input-md'])[6]")
	WebElement cleardataIn;
	
	@FindBy(xpath = "//*[text()='OK']")
	WebElement clickOk;
	
	public void getInRadius(String In) throws Exception {
		
		Thread.sleep(1000);
		cleardataIn.clear();
		Thread.sleep(1000);
	    cleardataIn.sendKeys(In);
	    Thread.sleep(1000);
	    clickOk.click();
	}
	
	@FindBy(xpath = "(//*[@class='native-input sc-ion-input-md'])[7]")
	WebElement cleardataOut; 
	
	public void getOutRadius(String Out) throws Exception {
		cleardataOut.clear();
		Thread.sleep(1000);
		cleardataOut.sendKeys(Out);
		Thread.sleep(1000);
		clickOk.click();
	}

}
