package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.WebRequest;

public class NewWindows {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		String oldwindow=driver.getWindowHandle();
		
		WebElement window=driver.findElement(By.id("j_idt88:new"));
		window.click();
		
		
		Set<String> nwindow=driver.getWindowHandles();
		for (String string : nwindow) {
			driver.switchTo().window(string);
		}
	    WebElement click=driver.findElement(By.id("layout-config-button"));
	    click.click();
	    driver.close();
	    
	    driver.switchTo().window(oldwindow);
	    WebElement next=driver.findElement(By.id("j_idt88:j_idt91"));
	    next.click();
	    int count= driver.getWindowHandles().size();
	    System.out.println(count);
	    
	    Set<String>handle= driver.getWindowHandles();
	    
	    for (String close : handle) {
			if(!close.equals(oldwindow)) {
				driver.switchTo().window(close);
				
				driver.close();
			}
		}
	    
	    Thread.sleep(3000);
	    driver.quit();
	    
		
		
	
	
	

	}

}
