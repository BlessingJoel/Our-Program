package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from= driver.findElement(By.id("form:drag_content"));
		WebElement to= driver.findElement(By.id("form:drop_content"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
//		act.dragAndDrop(from, to).build().perform();
		
		
		
		

	}

}
