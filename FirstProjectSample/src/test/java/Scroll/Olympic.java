package Scroll;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympic {

	public static void main(String[] args) throws Throwable {
      
		String countryName="Australia";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)", "");
		Thread.sleep(3000);
		List<WebElement> countryList = driver.findElements(By.xpath("//span[@data-cy='country-name']"));
		for(int i=0; i < countryList.size();i++) {
			if(countryList.get(i).getText().equalsIgnoreCase(countryName)) {
				String goldMedal = driver.findElement(By.xpath("//div[@title='Gold']/span['+(i+1)+']")).getText();
				
				System.out.println("\nGold Medal ==>"+goldMedal+" \n");
				break;
			}
		}
//		Thread.sleep(3000);
//		driver.quit();
		
	}

}
