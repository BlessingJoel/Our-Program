package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
    
	WebDriver driver;
	public checkoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[contains(@placeholder,'Select')]")
	WebElement country;
	
	@FindBy(xpath = "(//*[contains(@class,'ta-item')])[2]")
	WebElement selectCountry;
	
	@FindBy(css = ".action__submit")
	WebElement submit;
	
	public void SelectCountry(String CountryName) {
		Actions act=new Actions(driver);
		act.sendKeys(country, CountryName).build().perform();
		selectCountry.click();
	}
	
	public confirmationPage getsubmit() {
		submit.click();
		return new confirmationPage(driver);
	}
}
