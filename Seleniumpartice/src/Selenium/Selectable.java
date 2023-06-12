package Selenium;

import java.util.List;

import org.apache.http.impl.cookie.AbstractCookieAttributeHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Selectable.html");
		
		List<WebElement> name= driver.findElements(By.xpath("//*[@id=\'Default\']/ul/li"));
		int output=name.size();
		System.out.println(output);
		
//		Actions act=new Actions(driver);
//		act.keyDown(Keys.CONTROL)
//		.click(name.get(0))
//		.click(name.get(1)).click(name.get(2))
//		.build().perform();
		
		Actions act=new  Actions(driver);
		act.clickAndHold(name.get(0));
		act.clickAndHold(name.get(1));
		act.clickAndHold(name.get(2));
		act.build().perform();
	    
		
		

	}

}
