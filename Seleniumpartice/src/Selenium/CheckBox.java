package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
      
		WebElement check=driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[1]/div/div[2]"));
		check.click();
//		
//	     WebElement check1=driver.findElement(By.className("ui-toggleswitch-slider"));
//	     if(check1.isSelected()) {
//	    check1.click();
	   
		
		WebElement check1=driver.findElement(By.xpath("//*[@id=\'j_idt87:basic\']/tbody/tr/td[2]/div/div[2]"));
		check1.click();
	    
	    
	   
	     }
		
	}



