package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\sdhumalOneDrive\\OneDrive - Infinite Computing Systems\\Desktop\\Tools\\firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement ele=		driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("kocation of slider: "+ele.getLocation()); // (59, 250) x,y
		System.out.println("Size of the Slider: "+ele.getSize()); //(20,20) width,height

	
	Actions act= new Actions(driver);
	act.dragAndDropBy(ele, 100, 0).perform();
	System.out.println("kocation of slider: "+ele.getLocation()); // (59, 250) x,y
	System.out.println("Size of the Slider: "+ele.getSize()); //(20,20) width,height
	
WebElement ele2=	driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
	System.out.println(ele2.getLocation());
	System.out.println(ele2.getSize());
	
	act.dragAndDropBy(ele2, -100, 0).perform();
	
	System.out.println(ele2.getLocation());
	System.out.println(ele2.getSize());
	}

}
