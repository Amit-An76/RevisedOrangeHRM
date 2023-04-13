package pageObjects.modules;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import pageObjects.initializePageObjects.PageFactoryInitializer;


public class Dashbord extends PageFactoryInitializer
{
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement adminLink;
	
	@FindBy(xpath="//span[normalize-space()='Leave']")
	private WebElement Leave_link;

	@FindBy(xpath="//div[@class='orangehrm-header-container']/button")
	private WebElement add_button;
	
	//Add User
	
	

	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]")
	private WebElement UserRole;
	
	@FindBy(xpath="//div[@role='listbox']")
	private WebElement selectRole;
		
	
	@FindBy(xpath="(//div)[42]")
	private WebElement status_select;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement employeeName;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement userName;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement password;

	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveBTN;
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement searchUserName;
	
	@FindBy(xpath="//span[text()='(1) Record Found']")
	private WebElement recordFound;

	@FindBy(xpath="//i[@class='oxd-icon bi-trash']")
	private WebElement deleterecord;

	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[1]")
	private WebElement fromDate;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-mm-dd'])[2]")
	private WebElement toDate;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement empName;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement leaveSearchButton;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	private WebElement recordFoundMsg;
	
	

	
	public Dashbord adminLink() throws Exception
	{		
		adminLink.click();
		return this;		
	}
	
	public Dashbord clickadd() throws Exception
	{		
		add_button.click();
		return this;		
	}
	
	public Dashbord selectUseRole() throws Exception
	{		
		UserRole.click();
		Thread.sleep(2000);
		Actions ac = new Actions(getWebDriver());
		ac.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.TAB).perform();
		return this;		
	}
	
	public Dashbord selectStatus() throws Exception
	{		
		status_select.click();
		Thread.sleep(5000);
		Actions ac = new Actions(getWebDriver());
		ac.keyDown(Keys.ARROW_DOWN)
		.keyDown(Keys.TAB).perform();
		Thread.sleep(5000);
		return this;		
	}
	
	public Dashbord setEmployeeName(String name) throws Exception
	{		
		employeeName.sendKeys(name);
		return this;		
	}
	
	public Dashbord setUserName(String userNameVal) throws Exception
	{		
		userName.sendKeys(userNameVal);
		return this;		
	}
	
	public Dashbord setpassword(String pass) throws Exception
	{		
		password.sendKeys(pass);
		return this;		
	}

	public Dashbord confirmPassword(String Confpass) throws Exception
	{		
		confirmPassword.sendKeys(Confpass);
		return this;		
	}
	
	public Dashbord clickSaveButton() throws Exception
	{		
		saveBTN.click();
		return this;		
	}
	
	public Dashbord searchAddedUser(String userNameSearch) throws Exception
	{		
		searchUserName.sendKeys(userNameSearch);
		return this;		
	}
	
	public Dashbord assertRecord() throws Exception
	{		
		if(recordFound.isDisplayed()) {
			Assert.assertTrue(true, "Record Found");
		}
		return this;		
	}
	
	public Dashbord deleteRecord() throws Exception
	{		
		if(deleterecord.isDisplayed()) {
			deleterecord.click();
			getWebDriver().switchTo().alert().accept();
			Assert.assertTrue(true, "Record Deleted");
		}
		return this;		
	}

	
	public Dashbord verifyPageTitle() throws Exception 
	{
		Assert.assertEquals(getWebDriver().getTitle(), "");
		return this;
	}
	////

	public Dashbord clickLeaveButton() {
		Leave_link.click();
		return this;
	}
	
	public Dashbord setFromDate(String fromDate1) {
		fromDate.sendKeys(fromDate1);
		return this;
	}


	public Dashbord setToDate(String toDate1) {
		toDate.sendKeys(toDate1);
		return this;
	}



	public Dashbord setEmpName(String empName1) {
		empName.sendKeys(empName1);
		return this;
	}



	public Dashbord clickLeaveSearchButton() {
		leaveSearchButton.click();
		return this;
		
	}

	public String getRecordFoundMsg() {
		return recordFoundMsg.getText();
	}

	
	

}
