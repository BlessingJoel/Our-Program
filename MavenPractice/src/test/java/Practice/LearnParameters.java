package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnParameters {
	
	WebDriver driver;
	@Parameters({"Browser"})
	@Test(priority = 1)
	public void learn(String browser) {
		
		System.out.println("browser");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equals("safari")) {
			driver =new SafariDriver();
		}
		else if(browser.equals("i.e")) {
			driver =new InternetExplorerDriver();
		}
		else if(browser.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.get("http://localhost:8888/");
	}
	@Parameters({"username","password"})
	@Test(priority = 2)
	public void locall888(String name,String pass) {
		System.out.println(name);
		driver.findElement(By.name("user_name")).sendKeys(name,Keys.TAB,pass,Keys.ENTER);
	}

}
