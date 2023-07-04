package Utility;

import java.util.List;
import java.util.Random;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ELWeb {
	
	
	WebDriver driver;
	public ELWeb(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Back(WebDriver driver) {
		driver.navigate().back();
	}
	
	public void Refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	public int JavaRandom() {
		Random ran=new Random();
		int plus = ran.nextInt(10);
		return plus;
	}
	
	@FindBy(xpath = "(//*[@name='document-outline'])[1]")
	WebElement clickUserList;
	
	@FindBy(xpath = "(//*[@name='notifications-outline'])[1]")
	WebElement clickNotification;
	
	@FindBy(xpath = "(//*[@name='settings-outline'])[1]")
	WebElement clickSetting;
	
	@FindBy(xpath = "(//*[@name='home-outline'])[1]")
	WebElement clickHome;
	
	@FindBy(name = "menu-outline")
	WebElement clickMenuBar;
	
	public void getUserList() {
		clickUserList.click();
	}
	
	public void getNotification() {
		clickNotification.click();
	}
	
	public void getSetting() {
		clickSetting.click();
	}
	
	public void getHome() {
		clickHome.click();
	}
	
	public void getMenuBar() {
		clickMenuBar.click();
	}
}
