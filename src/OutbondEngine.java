import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OutbondEngine {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/srinivaskamble/eclipse-workspace/Selenium/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.outboundengine.com/");
		System.out.println(driver.getTitle());
	
		//Tap on DEMO
		driver.findElement(By.xpath("//*[@id=\"et-main-area\"]/header/section/div[4]/div/ul/li[4]/a")).click();
		System.out.println(driver.getTitle());
	
		//Fill Details
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Srinivas");
		driver.findElement(By.id("LastName")).sendKeys("Kamble");
		driver.findElement(By.id("Email")).sendKeys("srini@gmail.com");
		driver.findElement(By.id("Phone")).sendKeys("1234567890");
		
		//Select industry
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select selectByValue=new Select(driver.findElement(By.cssSelector("#Industry")));
		selectByValue.selectByValue("Automotive");
		
		Thread.sleep(3000);		
		driver.quit();
	}

}
