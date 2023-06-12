package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shutterstock.com/search/dead-leaf-ground");
		
//		WebElement firstimage= driver.findElement(By.className("mui-t7xql4-a-inherit-link"));
//		firstimage.click();
		
		WebElement broken =driver.findElement(By.className("mui-t7xql4-a-inherit-link"));
		
		if(broken.getAttribute("naturalWidth").equals("0")) {
			System.out.println("image is broken");
		}
		else {
			System.err.println("image is not broken");
		}

	}

}
