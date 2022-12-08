package packOne.Testfourproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DAtepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		String year="2022";
		String month="December";
		String Date="26";
		
		driver.findElement(By.id("onward_cal")).click();
		
		while(true)
		{
			String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		
			String arr[] = monthyear.split(" ");
		String mon= arr[0];
		String yr=arr[1];
		
		if(mon.equals(month) && yr.equals(year))
		break;
		else
			driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		
		
		
		
		
		
		}
	}

}
