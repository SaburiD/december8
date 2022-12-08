package packOne.Testfourproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturescreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sdhumalOneDrive\\OneDrive - Infinite Computing Systems\\Desktop\\Tools\\firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.opencart.com/");
		
		//Screenshot of section of portion
	/*WebElement capture=	driver.findElement(By.xpath("//div[@id='extension']//div[@class='container']"));
	File src= capture.getScreenshotAs(OutputType.FILE);
	File dest= new File(".\\Screenshots\\capture.png");
	FileUtils.copyFile(src, dest);*/
	
	//Screensot of particular webelement
			WebElement element  =driver.findElement(By.xpath("//h1[normalize-space()='The best FREE and open-source eCommerce platform']"));
			File srcs= element.getScreenshotAs(OutputType.FILE);
			File dest= new File(".\\Screenshots\\webelement.png");
			FileUtils.copyFile(srcs, dest);
	}

}
