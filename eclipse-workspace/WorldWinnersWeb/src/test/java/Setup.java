import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
		
 public WebDriver driver;

		@BeforeTest
		public void setUp()
		{
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 
		}
		
		@Test
		public void launchBrowser() throws InterruptedException
		{
		
			driver.get("https://lottery-dubai-staging.vercel.app/create-account");	
			Thread.sleep(3000);
	}

}
