package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileInput {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		FileInputStream file=new FileInputStream("./Sample");
		
		Properties pro=new Properties();
		pro.load(file);
		
		String files=pro.getProperty("url");
		
		driver.get(files);
		
		driver.findElement(By.id("username")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(pro.getProperty("password"));
		
		driver.findElement(By.id("loginButton")).click();

	}

}
