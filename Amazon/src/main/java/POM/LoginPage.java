package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Goto() {
		driver.get("https://rahulshettyacademy.com/client");
	}
	@FindBy(css = "#userEmail")
	WebElement name;
	
	@FindBy(css = "#userPassword")
	WebElement password;
	
	@FindBy(css = "#login")
	WebElement click;
	
	public ProductCatalogue getlogin(String Name,String Password) {
		name.sendKeys(Name);
		password.sendKeys(Password);
		click.click();
		ProductCatalogue productCart=new ProductCatalogue(driver);
		return productCart;
	}
	
 }
