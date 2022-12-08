package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions3 {

	public static void main(String[] args) {
				System.setProperty("webdriver.gecko.driver", "D:\\sdhumalOneDrive\\OneDrive - Infinite Computing Systems\\Desktop\\Tools\\firefoxdriver\\geckodriver.exe");
				WebDriver driver= new FirefoxDriver();
				driver.get("https://demo.opencart.com/");
				
				WebElement Desktop= driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
				WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions act= new Actions(driver);
	act.moveToElement(Desktop).moveToElement(mac).click().perform();
	
	}

}
