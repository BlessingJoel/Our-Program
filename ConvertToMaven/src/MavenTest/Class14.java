package MavenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.xerces.impl.xs.models.XSAllCM;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class14 {


	public void Class14() throws Throwable {
		// TODO Auto-generated method stub
		
		//properties files
		WebDriver driver=new ChromeDriver();
		
		FileInputStream file=new FileInputStream("./FIRST");
		Properties pro=new Properties();
		pro.load(file);
		
		 String URL = pro.getProperty("url");
//		String USERNAME=pro.getProperty("username");
//		String PASSWORD = pro.getProperty("password");
		
		System.out.println("URL = "+pro.getProperty("url"));
		System.out.println("NAME = "+pro.getProperty("username"));
		System.out.println("PASSWORD = "+pro.getProperty("password"));
		
		
		
		driver.get(URL);
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//     	driver.findElement(By.id("loginButton")).click();
		
		
		
		}

}
