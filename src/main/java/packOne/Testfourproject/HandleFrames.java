package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[4]/a/span")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[5]")).click();
		driver.switchTo().defaultContent();
		
	}

}
