package Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WorldWinnersAppLaunch {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		        DesiredCapabilities cap=new DesiredCapabilities();
		        
		        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 8");
		        cap.setCapability(MobileCapabilityType.APP, "/Users/srinivaskamble/Downloads/Appium Tools/WorldWinners.apk");
		        
		        URL url=new URL("http://127.0.0.1:4723/wd/hub");
		        AndroidDriver<WebElement> driver= new AndroidDriver<WebElement>(url, cap);
		        //IOSDriver driver = new IOSDriver(url,cap);
		       
		     // driver.findElements(By.className("android.view.ViewGroup")).get(4).click();
		        driver.findElements(By.id("9fa45f56-0b33-4d49-a957-9ac5623358b3")).get(4).click();
		      // driver.findElements(By.id(null)).get(0)
		        
		       }
}
