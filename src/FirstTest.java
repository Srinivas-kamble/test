import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/srinivaskamble/eclipse-workspace/Selenium/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
