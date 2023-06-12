package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
//		WebElement dropdown=driver.findElement(By.className("ui-selectonemenu"));
//		Select sel=new Select(dropdown);
//		sel.selectByIndex(2);
//		sel.selectByVisibleText("Selenium");
//		
//		
//		WebElement dropdown1=driver.findElement(By.className("ui-selectonemenu"));
//		Select select=new Select(dropdown1);
//		List<WebElement>getoptio=select.getOptions();
//		int output=getoptio.size();
//		System.out.println(output);
		
		WebElement dropdrown2=driver.findElement(By.className("ui-selectonemenu"));
	
		dropdrown2.sendKeys("Cypress");
//		Select multi=new Select(dropdrown2);
//		multi.selectByIndex(1);
//		multi.selectByIndex(2);
		
		

	}

}
