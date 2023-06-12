package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		WebElement namebox = driver.findElement(By.id("username"));
		namebox.sendKeys("ajith");
		WebElement passbox = driver.findElement(By.id("password"));
		passbox.sendKeys("12345678");

		WebElement classbox = driver.findElement(By.className("decorativeSubmit"));
		String output = classbox.getAttribute("value");
		System.out.println(output);
//      driver.findElement(By.xpath("//*[@id=\'login\']/p[3]/input")).click();
//    driver.findElement(By.className("decorativeSubmit")).click();

	}

}
