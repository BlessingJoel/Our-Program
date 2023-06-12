package POM;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Loginpage;

public class Demo {
	
	public void Class14() throws Throwable {
	WebDriver driver=new ChromeDriver();
	
	FileInputStream file=new FileInputStream("./FIRST");
	Properties pro=new Properties();
	pro.load(file);
	
	 String URL = pro.getProperty("url");
	 
	 driver.get(URL);
	 
	 Loginpage log=new Loginpage();
	  

}
}
