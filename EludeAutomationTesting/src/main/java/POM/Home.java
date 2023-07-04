package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = ".present:nth-of-type(1)")
	WebElement clickPresent;
	
	@FindBy(css = ".late:nth-of-type(2)")
	WebElement clickLate;
	
	@FindBy(css = ".leave:nth-of-type(3)")
	WebElement clickLeave;
	
	@FindBy(css = ".absent:nth-of-type(4)")
	WebElement clickAbsent;
	
	@FindBy(css = ".total:nth-of-type(5)")
	WebElement clickTotal;
	
	@FindBy(xpath = "(//*[@class='present'])[2]")
	WebElement ContentclickPresent;
	
	@FindBy(xpath = "(//*[@class='leave'])[2]")
	WebElement ContentclickLeave;
	
	@FindBy(xpath = "(//*[@class='late'])[2]")
	WebElement ContentclickLate;
	
	@FindBy(xpath = "(//*[@class='absent'])[2]")
	WebElement ContentclickAbsent;
	
	public void getPresent() {
		clickPresent.click();
	}
	
	public void getLate(){
		clickLate.click();
	}
	
	public void getLeave() {
		clickLeave.click();
	}
	
	public void getAbsent() {
		clickAbsent.click();
	}
	
	public void getTotal() {
		clickTotal.click();
	}
	
	public void getContentPresent() {
		ContentclickPresent.click();
	}
	
	public void getContentLeave() {
		ContentclickLeave.click();
	}
	
	public void getContentLate() {
		ContentclickLate.click();
	}
	
	public void getContentAbsent() {
		ContentclickAbsent.click();
	}
}
