package Automation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class GetStartedScreen {
	
	private AndroidDriver driver;
	private WebElement getStartedButton;
    private WebElement MarhabaText;
    private WebElement ClaimText;
    
    // Expected values
    public static final String Extxt_MarhabaText= "Marhaba!";
    public static final String Extxt_ClaimText= "Claim points to play draws and earn cash prizes!";

    
    public GetStartedScreen(AndroidDriver driver) {
  
		super();
		this.driver=driver;
		this.MarhabaText =  (WebElement) driver.findElements(By.className("android.view.ViewGroup")).get(2); 
		this.ClaimText = (WebElement) driver.findElements(By.className("android.view.ViewGroup")).get(3);
		this.getStartedButton = (WebElement) driver.findElements(By.className("android.view.ViewGroup")).get(4);
	}
    
    public WebElement getClaimText() {
        return ClaimText;
    }

    public WebElement getGetStartedButton() {
        return getStartedButton;
    }
    
    public WebElement getMarhabaText() {
        return MarhabaText;
    }
}

