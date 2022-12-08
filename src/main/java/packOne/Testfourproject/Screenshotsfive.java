package packOne.Testfourproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotsfive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
WebDriver driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");

File src= ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./Screenshots//newScrennshot.png"));
	driver.close();
	}

}
