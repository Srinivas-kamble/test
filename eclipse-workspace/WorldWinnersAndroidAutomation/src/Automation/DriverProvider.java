package Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverProvider {


    private static AndroidDriver driver = null;
    private static Capabilities capabilities;

    public static AndroidDriver getDriver() {
        if (driver != null) {
            return driver;
        } else {
           
        	try {
        		 DesiredCapabilities cap=new DesiredCapabilities(); 
    		     cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
    		     cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
    		     cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
    		     cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi 8");
    		     cap.setCapability(MobileCapabilityType.APP, "/Users/srinivaskamble/Downloads/Appium Tools/WorldWinners.apk");
    		        
    		     URL url=new URL("http://127.0.0.1:4723/wd/hub");
    		     driver= new AndroidDriver<WebElement>(url, cap);
            
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
         return driver;
        	
        }
       
    }
}


