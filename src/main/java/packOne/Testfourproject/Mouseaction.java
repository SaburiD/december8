package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sdhumalOneDrive\\OneDrive - Infinite Computing Systems\\Desktop\\Tools\\firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
WebElement rightclick=		driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act= new Actions(driver);
		act.contextClick(rightclick).perform();
		Thread.sleep(2000);
		WebElement doubleclick= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleclick).build().perform();
	}

}
