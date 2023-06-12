package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml");
		
		WebElement name= driver.findElement(By.id("j_idt88:name"));
		String tool=name.getAttribute("placeholder");
		System.out.println("Hover text="+"  "+tool);

	}

}
