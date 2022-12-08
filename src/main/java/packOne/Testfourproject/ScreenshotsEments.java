package packOne.Testfourproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsEments {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");

	WebElement usid=driver.findElement(By.id("btnLogin"));
		File srcfile=usid.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("./Screenshots//elementscreenshot.png"));
				driver.close();


	}

}
