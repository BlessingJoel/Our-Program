package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM.CartPage;

public class WebUtility {
	
	WebDriver driver;
	public WebUtility(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//button[@class='btn btn-custom'])[3]")
	WebElement clickCart;
	
	public CartPage gotoCart() {
		clickCart.click();
		 return new CartPage(driver);
	}
	
}
