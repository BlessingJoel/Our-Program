package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	

}
