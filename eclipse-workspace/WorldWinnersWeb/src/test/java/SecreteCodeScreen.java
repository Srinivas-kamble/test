import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecreteCodeScreen {


	// ------------------------------------------  Initialization ----------------------------------------------------------------//

	// WebElements
	@FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div[3]/input" )
	WebElement enterpinnumber;
	
	
	@FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[2]" )
	WebElement clickOnSubmit;





	// ------------------------------------------  Utilization ----------------------------------------------------------------//


	public WebElement getEnterpinnumber() {
		return enterpinnumber;
	}


	public WebElement getClickOnSubmit() {
		return clickOnSubmit;
	}



	public SecreteCodeScreen(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
