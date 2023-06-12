package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/link.xhtml");
		
		WebElement home= driver.findElement(By.linkText(""));
		home.click();
		driver.navigate().back();
		
		WebElement wheretogo=driver.findElement(By.partialLinkText("Find the URL"));
		String where=wheretogo.getAttribute("href");
		System.out.println("find the url:"+where);
		
		WebElement broken=driver.findElement(By.linkText("Broken?"));
		broken.click();
		
		String title=driver.getTitle();
		if (title.contains("404")) {
			System.out.println("link is broken");
		}
		else {
			System.out.println("link is not broken");
		}
		driver.navigate().back();
		
		List<WebElement> totallink=driver.findElements(By.tagName("a"));
		int output=totallink.size();
		System.out.println("Total link:"+output);
		
		}
	
	}


