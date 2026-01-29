package Test;

import base.BaseClass;
import pages.Common_header;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Contact_test extends BaseClass {
    Common_header contact;

    //I want to run this before @test method
    @BeforeMethod
    public void driver_setup()
    {
        contact = new Common_header(driver);
    }

    @Test()
    public void Test()
    {
//        driver.get("https://demoblaze.com/");
        contact.Contact("saranselva@gmail.com" , "saran" , "SUCCESS");
        contact.Send_message();
        contact.alert_handling();
    }

}
