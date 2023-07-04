package Shop;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addcart {
    
	@Test
	public  void OpenBrowser() throws Throwable {
		
		String productName = "ADIDAS ORIGINAL";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.cssSelector("#userPassword")).sendKeys("Iamking@000");
		driver.findElement(By.cssSelector("#login")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		 List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod = products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("")))

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		
		List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
		boolean match = cartproducts.stream().anyMatch(cart->cart.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);
		driver.findElement(By.xpath("//*[text()='Checkout']")).click();
		
		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(By.xpath("//*[contains(@placeholder,'Select')]")), "india").build().perform();
		driver.findElement(By.xpath("(//*[contains(@class,'ta-item')])[2]")).click();
		
		driver.findElement(By.cssSelector(".action__submit")).click();
		
		String finish = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(finish.equalsIgnoreCase("Thankyou for the order."));
		driver.close();
	}

		
}
