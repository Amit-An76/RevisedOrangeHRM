package pageObjects.initializePageObjects;

import controllers.BaseMethod;
import org.openqa.selenium.support.PageFactory;
import pageObjects.modules.Login;
import pageObjects.modules.Dashbord;


public class PageFactoryInitializer extends BaseMethod {
    public Dashbord DashbordPage() {
        return PageFactory.initElements(getWebDriver(), Dashbord.class);
    }

    public Login LoginPage() {
        return PageFactory.initElements(getWebDriver(), Login.class);
    }
}
