package controllers;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.awt.*;

public class BaseMethod extends WebDriverFactory {

    public String getUrlTitle() throws Exception {
        URL aURL = new URL(WebsiteURL);
        String WebName = aURL.getHost();
        String WebSiteName = WebName.toUpperCase();
        return WebSiteName;
    }

    public void hitEnter() throws Exception {
    	Robot re1 = new Robot();
       
        re.keyRelease(KeyEvent.VK_ENTER);
    }
}