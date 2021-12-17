

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class WhatsYourNumberScreen {
	
	//Expected Values
	private  String screenText="What's your number?";

	// ------------------------------------------  Initialization ----------------------------------------------------------------//
	
	// WebElements
	@FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div[1]" )
	WebElement whatyourtext;

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/input") 
	WebElement numberfield;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/div")
	WebElement Checkbox;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]/div[2]")
	WebElement Nextbutton;


	// ------------------------------------------  Utilization ----------------------------------------------------------------//
	
	public WebElement getWhatyourtext() {
		return whatyourtext;
	}

	public WebElement getNumberfield() {
		return numberfield;
	}
	
	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getNextbutton() {
		return Nextbutton;
	}
	
	
	public WhatsYourNumberScreen(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
