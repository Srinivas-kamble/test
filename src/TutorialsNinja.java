import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TutorialsNinja {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/srinivaskamble/eclipse-workspace/Selenium/Drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
		action.moveToElement(element).click().perform();
		
		Actions action1=new Actions(driver);
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a"));
		action1.moveToElement(element1).click().perform();
	
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
