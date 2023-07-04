package MenuBarPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ELWeb;

public class OrganizationPage {
	
	WebDriver driver;
	public OrganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "cog-outline")
	WebElement clickOrg;
	
	public void getOrg() {
		clickOrg.click();
	}
	
	@FindBy(xpath = "(//*[@class='Org-name'])[1]")
	WebElement clickFirstContent;
	
	@FindBy(xpath = "(//*[@class='Org-name'])[2]")
	WebElement clickSecondContent;
	
	@FindBy(xpath = "(//*[@class='Org-name'])[3]")
	WebElement clickThirdContent;
	
	@FindBy(xpath = "(//*[@class='Org-name'])[4]")
	WebElement clickFourthContent;
	
	@FindBy(xpath = "(//*[@class='Org-name'])[5]")
	WebElement clickFifthContent;
	
	
	@FindBy(xpath = "(//*[@class='Org-name'])[6]")
	WebElement clickSixthContent;
	
	@FindBy(xpath = "(//*[@class='Org-name'])[7]")
	WebElement clickSeventhContent;
	
	@FindBy(xpath = "(//*[@class='Org-name'])[8]")
	WebElement clickEighthContent;
	
	public void getOrgContent() throws Exception {
		ELWeb OB=new ELWeb(driver);
		clickFirstContent.click();
		Thread.sleep(1000);
		OB.Back(driver);
		clickSecondContent.click();
		Thread.sleep(1000);
		OB.Back(driver);
		clickThirdContent.click();
		Thread.sleep(1000);
		OB.Back(driver);
		clickFourthContent.click();
		Thread.sleep(1000);
		OB.Back(driver);
		clickFifthContent.click();
		Thread.sleep(1000);
		OB.Back(driver);
		clickSixthContent.click();
		Thread.sleep(1000);
		OB.Back(driver);
		clickSeventhContent.click();
		Thread.sleep(1000);
		OB.Back(driver);
		clickEighthContent.click();
		OB.Back(driver);
	}

}
