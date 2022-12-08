package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sdhumalOneDrive\\OneDrive - Infinite Computing Systems\\Desktop\\Tools\\firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
	
		
		input1.sendKeys("Welcome to Selenium");
		
		
		Actions act= new Actions(driver);
		//ctrl+A
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//ctrl+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		//TAB
		act.sendKeys(Keys.TAB).perform();
		
		//ctrl+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		//compare text
		if(input1.getAttribute("value").equals(input2.getAttribute("value")))
				{
			System.out.println("Text Copied");
				}
			else {
				System.out.println("Text not Copied");
			}
				}
		
	}


