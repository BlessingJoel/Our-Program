package Sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pagefactory {
	
	
	@FindBy(id="username")
	public static WebElement username;
	@FindBy(name="pwd")
	public static WebElement password;

}
