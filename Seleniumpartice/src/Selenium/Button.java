package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		WebElement position=driver.findElement(By.id("j_idt88:j_idt94"));
		Point xyvalue=position.getLocation();
		int xvalue=xyvalue.getX();
		int yvalue=xyvalue.getY();
		System.out.println("x value:"+xvalue+" "+"y value:"+yvalue);
		
		WebElement Bcolor=driver.findElement(By.id("j_idt88:j_idt96"));
		String color=Bcolor.getCssValue("background");
		System.out.println("get the color:"+" "+color);
		
		WebElement Bsize=driver.findElement(By.id("j_idt88:j_idt98"));
		int height=Bsize.getSize().getHeight();
		int width=Bsize.getSize().getWidth();
		
		System.out.println("Height="+height+" "+"Width="+width);
		
		WebElement enable=driver.findElement(By.id("j_idt88:j_idt92"));
		Boolean output=enable.isEnabled();
		System.out.println("button is :"+output);

       
	}

}
