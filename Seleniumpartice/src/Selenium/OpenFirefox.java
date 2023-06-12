package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.className("gLFyf")).sendKeys("lining bat"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Home | Li-Ning Studio - Official Li-Ning Store")).click();
		driver.findElement(By.linkText("BADMINTON")).click();
		driver.findElement(By.linkText("Rackets")).click();
	
	

	}

}
