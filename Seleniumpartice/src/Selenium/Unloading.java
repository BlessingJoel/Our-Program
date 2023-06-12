package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unloading {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml");
		
		driver.findElement(By.id("j_idt88:j_idt89")).click();
		
		String file = "E:\\AJI\\Testing\\Test Scenario Template.xlsx";
		
		Thread.sleep(3000);
		StringSelection selection=new StringSelection(file);
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    
     Robot robot=new Robot();
     
     robot.keyPress(KeyEvent.VK_CONTROL);
     robot.keyPress(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_CONTROL);
     
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
   
   }

}
