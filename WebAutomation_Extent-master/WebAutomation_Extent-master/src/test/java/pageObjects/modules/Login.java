/**
 * 
 */
package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;

public class Login extends PageFactoryInitializer
{
	@FindBy(xpath="//*[@name='username']")
	private WebElement user_textbox;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement submit_button;

	
	public Login enterLoginCredential(String user, String password) 
	{
		user_textbox.sendKeys(user);
		password_textbox.sendKeys(password);
		submit_button.click();
		return this;
	}


	public Login verifyPageTitle() throws Exception 
	{
		Assert.assertEquals(getWebDriver().getTitle(), "OrangeHRM");
		return this;
	}
	
	
	
}
