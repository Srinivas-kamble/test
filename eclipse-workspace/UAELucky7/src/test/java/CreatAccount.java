import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreatAccount extends Setup {
	
	@Test
	public void createAccountWithValiddata()
	
	{   
	
		//Tap on Country drop down
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#__next > div > div > div > div.css-1dbjc4n.r-kemksi.r-6koalj.r-1oknz3f > div > div.css-1dbjc4n.r-1awozwy.r-3pxcvb.r-qklmqi.r-1loqt21.r-18u37iz.r-1x35g6.r-1pi2tsx.r-1777fci.r-4wgw6l.r-mzo9nz.r-1otgn73.r-1i6wzkk.r-lrvibr.r-1qho19y > div.css-901oao.r-jwli3a.r-1x35g6.r-majxgm.r-zso239")).click();
		
		//Search country code
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/input")).sendKeys("ind");
		
		//Tap on india
		Actions action= new Actions(driver);
		WebElement element=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div"));
		action.moveToElement(element).click().perform();
		
	}

}
