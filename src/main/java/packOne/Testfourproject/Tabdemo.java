package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.id("txtUsername")).sendKeys("Admin");

String firstwindow = driver.getWindowHandle();

driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://demo.guru99.com/test/newtours/index.php");
driver.close();

driver.switchTo().window(firstwindow);
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

}
