package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	
	@Test(dataProvider = "login",dataProviderClass = Sample1.class)
	public void m1(String name,String pass) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys(name,Keys.TAB,pass,Keys.TAB.ENTER);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		if(url.equalsIgnoreCase("http://localhost:8888/index.php?action=index&module=Home")) {
//			System.out.println("correct username,password");
//		}
//		else {
//			System.out.println("incorrect username,password");
//		}
//		driver.quit();
		}

}
