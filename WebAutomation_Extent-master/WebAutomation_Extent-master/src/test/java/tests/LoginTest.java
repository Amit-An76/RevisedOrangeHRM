package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.initializePageObjects.PageFactoryInitializer;

public class LoginTest extends PageFactoryInitializer {
   // @Test(dataProvider = "excelSheetNameAsMethodName", dataProviderClass = ExcelDataProvider.class)
	@Test
    public void loginHRM() throws Exception {
		//String user, String password
    	LoginPage().enterLoginCredential("Admin", "admin123");
    	LoginPage().verifyPageTitle();
    }
	
	@Test
    public void userManagment() throws Exception {
		loginHRM();
		//String user, String password
		DashbordPage().adminLink();
		DashbordPage().clickadd();
		DashbordPage().selectUseRole();
		DashbordPage().selectStatus();
		DashbordPage().setEmployeeName("Kiyara Hu");
		DashbordPage().setUserName("kkkkk");
		DashbordPage().setpassword("Singh@123");
		DashbordPage().confirmPassword("Singh@123");
		DashbordPage().clickSaveButton();	
    }
	
	@Test
    public void leaveManagment() throws Exception {
		loginHRM();
		//String user, String password
		DashbordPage().clickLeaveButton();
		DashbordPage().setFromDate("2020-01-01");
		DashbordPage().setEmpName("Anthony Nolan");
		DashbordPage().clickLeaveSearchButton();
		if(DashbordPage().getRecordFoundMsg().contains("Found")) {
			Assert.assertTrue(true, "pass");
		}
    }
}
