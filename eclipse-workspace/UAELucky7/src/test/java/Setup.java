import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
		
 WebDriver driver;


		@BeforeTest
		public void setUp()
		{
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 
		}
		
		@Test
		public void launchBrowser()
		{
		
			 driver.get("https://lottery-dubai-lucky7.vercel.app/register");		
	}

}
