package packOne.Testfourproject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sdhumalOneDrive\\OneDrive - Infinite Computing Systems\\Desktop\\Tools\\firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.DOWN).perform();
		
		Thread.sleep(2000);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
	}

}
