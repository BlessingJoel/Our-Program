package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	
	   public void username() {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   }
}
