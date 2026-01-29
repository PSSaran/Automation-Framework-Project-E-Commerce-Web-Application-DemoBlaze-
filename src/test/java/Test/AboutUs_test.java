package Test;

import base.BaseClass;
import pages.Common_header;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutUs_test extends BaseClass {
    Common_header About_us;

    @BeforeMethod()
    public void set_up()
    {
        About_us = new Common_header(driver);
    }

    @Test()
    public void Testing_aboutUs() throws InterruptedException {
//        driver.get("https://demoblaze.com/");
        About_us.click_about_us();
        About_us.PlayVideo();
        About_us.VideoFullscreen();
        Thread.sleep(6000);
        About_us.ExitFullscreen();

        About_us.AboutUs_closeButton();
    }
}
