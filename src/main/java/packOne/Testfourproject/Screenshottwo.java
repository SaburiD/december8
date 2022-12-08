package packOne.Testfourproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshottwo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");

WebElement Button=driver.findElement(By.id("btnLogin"));
WebElement txtfield=driver.findElement(By.id("txtUsername"));


	takeelementScreenshot(Button, "Loginbutton");
	takeelementScreenshot(txtfield, "useridelement");
	}
	
	public static void takeelementScreenshot(WebElement element,String Filename)
	{
		TakesScreenshot src=((TakesScreenshot)element);
		File scrren=src.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrren, new File("./Screenshots"+Filename+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
