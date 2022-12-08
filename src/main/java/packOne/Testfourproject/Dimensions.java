package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
WebElement ele= driver.findElement(By.id("btnLogin"));


//Selenium3
Dimension d = ele.getSize();
System.out.println(d.getHeight());
System.out.println(d.getWidth());

Point p = ele.getLocation();
System.out.println(p.getX());
System.out.println(p.getY());
	
	System.out.println("--------------------Selenium 4----------------------------");
	//Selenium 4
Rectangle r = ele.getRect();
System.out.println(r.getHeight());
System.out.println(r.getWidth());
System.out.println(r.getX());
System.out.println(r.getY());
	
	}

}
