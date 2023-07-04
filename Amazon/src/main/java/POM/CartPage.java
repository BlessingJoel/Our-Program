package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(xpath = "//*[text()='Checkout']")
	WebElement checkEle;
	
	public boolean VerifyProductDisplay(String productName) {
		boolean match = cartProducts.stream().anyMatch(cart->cart.getText().equalsIgnoreCase(productName));
		return match;
	}
	
	public checkoutPage getcheckout() {
		checkEle.click();
		return new checkoutPage(driver);
	}

}
