package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");
		
		List<WebElement> column=driver.findElements(By.tagName("th")); 
		int output=column.size();
		System.out.println("No of column:"+output);
		
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		int output1=row.size();
		System.out.println("No of rows:"+output1);
		
		WebElement getcountry= driver.findElement(By.xpath("//*[@id=\'form:j_idt89_data\']/tr[3]/td[2]"));
		String value=getcountry.getText();
		System.out.println("find the values="+value);
	
	
	}

}

