package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Firstpage {
	
	  private  static WebElement element=null;
     
	 public static WebElement search(WebDriver driver) {
		WebElement element = driver.findElement(By.name("q"));
	    return element; 
		}	
//	 public void button(WebDriver driver) {
//		 driver.findElement(By.)
//	 }
	 
	 

}
