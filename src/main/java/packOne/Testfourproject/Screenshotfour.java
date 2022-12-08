package packOne.Testfourproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotfour {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
 File src=((ChromeDriver)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("./Screenshots//orangehrmpage.png"));
	
	driver.close();
	}

}
