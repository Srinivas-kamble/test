

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAllScripts extends Setup {

	public Actions act;
	
	@Test(priority = 1)

	public void verfyWhatsyourSnumbercreen() {

		WhatsYourNumberScreen gts=new WhatsYourNumberScreen(driver);

		//Verify Whats your number field
		//Assert.assertEquals(gts.getScreenText(), gts.getWhatyourtext().getText());

		//Enter mobile number
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		gts.getNumberfield().sendKeys("1234567890");

		//Click on Check box
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act=new Actions(driver);
		act.doubleClick(gts.Checkbox).perform();

		//Click on Next button
		gts.getNextbutton().click();

	}

	
	@Test(priority = 2)
	public void verifySecreteCodeScreen() throws InterruptedException
	{
		SecreteCodeScreen sc=new SecreteCodeScreen(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sc.getEnterpinnumber().sendKeys("1234");
		
		sc.getClickOnSubmit().click();
		
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 3)
	public void verifyProfileScreen() {
		
	}
	
	
	@AfterTest
	public void closeBrowser() 
	{
		
		driver.quit();
	}

}
