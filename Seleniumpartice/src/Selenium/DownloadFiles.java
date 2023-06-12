package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class DownloadFiles {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		
		
		WebElement first= driver.findElement(By.linkText("32 bit Windows IE"));
		first.click();
		
	
		
		
	    java.io.File location=new java.io.File("C:\\Users\\This-Pc\\Downloads");
	   java.io.File[] totalfiles= location.listFiles();
	   
	 for (java.io.File file : totalfiles) {
		 file.getName().equals("32 bit Windows IE") ;
			 System.out.println("file is download");
			 break;
	
			
			 
		 }
		
	 }
		
	}
	   
 
	


