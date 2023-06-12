package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node0pmln8bnsefoiz20krxnjiub60675.node0");
		
		driver.switchTo().frame(0);
		WebElement frame=driver.findElement(By.id("Click"));
		frame.click();
		
		String out=driver.findElement(By.id("Click")).getText();
		System.out.println(out);
      
		
		driver.switchTo().defaultContent();
		List<WebElement>output= driver.findElements(By.tagName("iframe"));
		int input=output.size();
		System.out.println(input);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement Fbutton= driver.findElement(By.id("Click"));
		Fbutton.click();
		
		
		
	}

}
