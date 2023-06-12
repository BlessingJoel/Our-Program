package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScroll {
	
	@Test
	public void First() throws Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://docs.phptravels.com/");
		
		WebElement scroll = driver.findElement(By.xpath("(//*[contains(text(),'License')])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		scroll.click();
		
		Thread.sleep(3000);
		WebElement scroll2 = driver.findElement(By.xpath("(//*[text()='API Response Error'])[2]"));
//		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", scroll2);
		scroll2.click();
		
	}

}
