package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {

	@Test
	public void m1() {
		String Browser = System.getProperty("browser");
		String Url = System.getProperty("url");
		System.out.println(Browser);
		System.out.println(Url);
		
		WebDriver driver;
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
		driver.get(Url);
	}
}
