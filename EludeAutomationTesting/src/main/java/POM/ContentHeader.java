package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentHeader {
  
	WebDriver driver;
	public ContentHeader(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@name='caret-back-outline']")
	WebElement clickPday;
	
	@FindBy(xpath  = "(//*[@placeholder='search'])[2]")
	WebElement sendSearch;
	
	@FindBy(xpath = "(//*[text()='ABSENT'])[2]")
	WebElement FirstclickContent;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-halfDayM')]")
	WebElement clickHday;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-a')]")
	WebElement clickAbsent;
	
	@FindBy(xpath = "//*[text()='Half Day']")
	WebElement SecondclickContent;
	
	@FindBy(className = "Curentdate")
	WebElement clickRefresh;
	
	@FindBy(xpath = "//*[contains(@class,'action-sheet-button ion-activatable ion-focusable action-sheet-p')]")
	WebElement clickPresent;
	
	@FindBy(xpath = "(//*[text()='PRESENT'])[2]")
	WebElement 	ThirdclickContent;
	
	@FindBy(xpath = "(//*[@class='table'])[1]")
	WebElement clickIconview;
	
	public void getClickRArrow() {
		clickPday.click();
	}
	
	public void getSearch(String send) {
		sendSearch.sendKeys(send);
	}
	
	public void getFirstContent() {
		FirstclickContent.click();
	}
	
	public void getHday() {
		clickHday.click();
	}
	
	public void getAbsent() {
		clickAbsent.click();
	}
	
	public void getSecondContent() {
		SecondclickContent.click();
	}
	
	public void getPageRefresh() {
		clickRefresh.click();
	}
	
	public void getPresentContent() {
		clickPresent.click();
	}
	
	public void getThirdContent() {
		ThirdclickContent.click();
	}
	
	public void getIconView() {
		clickIconview.click();
	}
	
	//Icon View
	@FindBy(xpath = "(//*[contains(@class,'native-input')])[4]")
	WebElement clickContentCalendar;
	
	@FindBy(xpath = "//*[text()='CANCEL']")
	WebElement clickCancel;
	
	@FindBy(css = ".backbtn:nth-of-type(1)")
	WebElement clickBack;
	
	
	public void getContentCalendar() throws Exception {
		clickContentCalendar.click();
		Thread.sleep(3000);
		clickCancel.click();
		}
	
	public void getBlack() {
		clickBack.click();
	}
	
	//List View
	@FindBy(xpath = "(//*[@class='table'])[2]")
	WebElement clickListView;
	
	@FindBy(xpath = "//*[text()='Card View']")
	WebElement clickCardList;
	
	public void getListView() {
		clickListView.click();
	}
	
	public void getCardList() {
		clickCardList.click();
	}
}
