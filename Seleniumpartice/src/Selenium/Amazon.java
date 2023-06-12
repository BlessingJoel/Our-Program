package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("amazon login"+Keys.ENTER);
		driver.findElement(By.partialLinkText("Sign in - Amazon job account")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("johnsam");
		driver.findElement(By.id("ap_email")).sendKeys("johnsam@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("12345678");
		driver.findElement(By.id("ap_password_check")).sendKeys("12345678");
		driver.findElement(By.id("continue")).click();

	}

}
