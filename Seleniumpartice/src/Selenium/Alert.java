package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement alert=driver.findElement(By.id("j_idt88:j_idt91"));
		alert.click();
		
		org.openqa.selenium.Alert alert1=driver.switchTo().alert();
		alert1.accept();
		
		WebElement confrim=driver.findElement(By.id("j_idt88:j_idt93"));
		confrim.click();
		
		
		org.openqa.selenium.Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
		
		WebElement prompt=driver.findElement(By.id("j_idt88:j_idt104"));
		prompt.click();
		
		
		org.openqa.selenium.Alert alert3=driver.switchTo().alert();
		alert3.sendKeys("aji");
		alert3.accept();
	}

}
