package packOne.Testfourproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Relativelocatordemo {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();

WebDriver driver= new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/");

driver.manage().window().fullscreen();

	}

}
