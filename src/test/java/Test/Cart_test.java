package Test;

import base.BaseClass;
import pages.FinalCart_PlaceOrder;
import pages.Common_header;
import pages.Products_PlaceOrder;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Cart_test extends BaseClass
{//3--
    FinalCart_PlaceOrder cart;
    Common_header ClickCart;
    Products_PlaceOrder product;
    //setup

    @BeforeMethod
    public void setUp()
    {
        cart = new FinalCart_PlaceOrder(driver);
        ClickCart=new Common_header(driver);
        product =new Products_PlaceOrder(driver);
    }

    @Test
    public void Cart_Pagetest()
    {
        driver.get("https://demoblaze.com/");
        product.AddToCart();
        cart.PlaceOrder("saran","India","chennai","1234 1234", "December", "2025");
        cart.purchase();
        cart.PlaceOrder_closeButton();

    }
}
