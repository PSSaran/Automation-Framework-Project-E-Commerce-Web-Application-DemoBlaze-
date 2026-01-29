package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Products_PlaceOrder
{
    WebDriver driver;
    WebDriverWait wait;
    Common_header goesToHome;
    //constructor
    public Products_PlaceOrder(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        goesToHome = new Common_header(driver);
    }

    //placeOrder button
    public void AddToCart()
    {

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='row']/div[2]/div[2]/div/a"))).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        goesToHome.Home();
//        WebElement Laptop = driver.findElement(By.xpath("//div[@class='row']/div[2]/div[2]/div/a"));

    }
}
