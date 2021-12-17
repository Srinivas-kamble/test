package Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TestAllScreens {
	
	private AndroidDriver driver= DriverProvider.getDriver();
	
	//private GetStartedScreen getStartedScreen= new GetStartedScreen(driver);

	    @Test
	    public void clickonGetstartedButton() {
	    	if(driver == null) {
	    		System.out.println("No Driver found");
	    	}
	    	GetStartedScreen getStartedScreen= new GetStartedScreen(driver);
	    	getStartedScreen.getGetStartedButton().click();
	    	Assert.assertEquals(GetStartedScreen.Extxt_MarhabaText, getStartedScreen.getMarhabaText().getText());
	    }

}
