package packOne.Testfourproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlywaitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("txtPassword")).sendKeys(Keys.ENTER);
		
		
	By element=By.id("welcome");
	waitforElement(driver, element, 5).click();
		
		
		By element1=By.xpath("//a[normalize-space()='Logout']");
		waitforElement(driver, element1, 5).click();
		
		//WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Logout']")));
		//ele.click();
		
	}
	
	public static WebElement waitforElement(WebDriver driver,By Locator,int timeouts)
	{
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeouts));
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		
		return driver.findElement(Locator);
		
	}

}
