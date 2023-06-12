package POM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {


	// TODO Auto-generated method stub

	//initialization
	public void Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	
	//declaration
	@FindBy(id="username")
	private WebElement Usertextfile;
	
	@FindBy(name="pwd")
	private WebElement Passwordtextfile;
    
	
	//get methods
	public WebElement getUsertextfile() {
		return Usertextfile;
	}

	public WebElement getPasswordtextfile() {
		return Passwordtextfile;
	}
	
	public void login(String username,String password) {
		Usertextfile.sendKeys(username);
		Passwordtextfile.sendKeys(password);
		
	}
	
	
}


