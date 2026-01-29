package Test;

import base.BaseClass;
import pages.Common_header;
import pages.FinalCart_PlaceOrder;
import pages.Home_page;
import pages.Products_PlaceOrder;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogInAndLogout_test extends BaseClass
{//1--
    Common_header login;
    Home_page HomePage;
    Products_PlaceOrder AddTocart;
    Common_header homeClick;
    WebDriverWait wait;
    FinalCart_PlaceOrder PlacingOrder;

    @BeforeMethod()
    public void Login_setup()
    {
        login = new Common_header(driver);
        HomePage = new Home_page(driver);
        AddTocart = new Products_PlaceOrder(driver);
        homeClick = new Common_header(driver);
        PlacingOrder = new FinalCart_PlaceOrder(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test()
    public void LogIn()
    {
//        driver.get("https://demoblaze.com/");
        login.LogIn("saran5577" , "saran@007");
//        login.logOut();

        HomePage.Laptops();
        AddTocart.AddToCart();
        homeClick.cart();
        PlacingOrder
                .PlaceOrder("saran","India","chennai","1234 1234",
                        "December", "2025");
        PlacingOrder.purchase();
        homeClick.Home();
        driver.quit();
    }
}
