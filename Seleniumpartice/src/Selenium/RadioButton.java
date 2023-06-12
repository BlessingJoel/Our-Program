package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\AJI\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node0br6tg2rl0garqwbr1l7m347h2938.node0");

		WebElement Radio1 = driver.findElement(By.id("j_idt87:console2:0"));
		boolean unselect = Radio1.isSelected();
		System.out.println("chrome=" + unselect);
		WebElement Radio2 = driver.findElement(By.id("j_idt87:console2:2"));
		boolean select = Radio2.isSelected();
		System.out.println("safari" + select);

		WebElement aji = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/label"));
		aji.click();

		WebElement aji1 = driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]/span"));
		aji1.click();

		WebElement Chennai = driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[1]/label"));
		boolean chennai = Chennai.isSelected();
		System.out.println("Chennai=" + chennai);
		WebElement Hyderabad = driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[3]/label"));
		boolean hyderabad = Hyderabad.isSelected();
		System.out.println("Hyderabad=" + hyderabad);

		WebElement Bengaluru = driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[2]/label"));
		boolean bengaluru = Bengaluru.isSelected();
		System.out.println("Bengaluru=" + bengaluru);

	}

}
