package Firstproject;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCap {

	public static void main(String[] args) {

         WebDriverManager.chromedriver().setup();
         
		 DesiredCapabilities caps=new DesiredCapabilities();
		 caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		 WebDriver driver=new ChromeDriver();
         driver.get("https://google.com");

	}

}