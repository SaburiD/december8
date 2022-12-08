package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inneriframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
WebElement outerframe=		driver.findElement(By.xpath("/html/body/section/div/div"));
driver.switchTo().frame(outerframe);

WebElement innerframe=driver.findElement(By.xpath("This element is in iframe - //div[@class='row']"));
driver.switchTo().frame(innerframe);

	driver.findElement(By.xpath("This element is in iframe - //input[@type='text']")).sendKeys("Automation");
	}

}
