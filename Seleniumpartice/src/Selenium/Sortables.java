package Selenium;

import java.util.List;

import org.openqa.grid.web.servlet.beta.WebProxyHtmlRendererBeta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/sortable/");
		
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		
		WebElement formelement=elements.get(1);
		WebElement toelement=elements.get(6);
		Actions act=new Actions(driver);
		act.clickAndHold(formelement);
		act.moveToElement(toelement);
		act.build().perform();
	}

}
