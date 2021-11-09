package Selenium.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DubaiWinners {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/srinivaskamble/eclipse-workspace/Test/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch website
		driver.get("https://lottery-dubai-o229b4zcz-lucky7.vercel.app/register");
		System.out.println(driver.getTitle());
		
		//Click on the country
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[1]/div[2]")).click();
	
		//Search for country
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/input")).sendKeys("ind");
		
		//Click on the country
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div"));
		action.moveToElement(element).click().perform();
		
		//Enter Mobile number
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/input")).sendKeys("7353692665");
				
		//Select Check box
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div[1]/div[1]/div/div")).click();
		
		//Click on the create account button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[4]")).click();
		
		
		Thread.sleep(5000);
		driver.quit();

	}


}
