package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
	
	@Test(invocationCount = 8,threadPoolSize = 4)
	public void p() {
		System.out.printf("%n[START] Thread Id : %s is started!",Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
		driver.quit();
		
	}

} 
