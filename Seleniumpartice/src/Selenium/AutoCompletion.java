package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.algolia.com/search/?query=&tab=");
		
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.id("autocomplete-0-input"));
		name.sendKeys("s");
		
		
        
		List<WebElement>optionlist= driver.findElements(By.xpath("autocomplete-0-input"));
		
		System.out.println(optionlist.size());
		
		for (WebElement webElement : optionlist) {
			if(webElement.getText().equals("semantic search")) {
				webElement.click();
				
				System.out.println("Answer="+webElement.getText());
				break;
			}
			
		}
		





	}

}
