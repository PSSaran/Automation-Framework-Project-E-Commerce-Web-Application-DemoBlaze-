package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FinalCart_PlaceOrder {

    WebDriver driver;
    WebDriverWait wait;
    //constructor
    public FinalCart_PlaceOrder(WebDriver driver)
    {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    //Place_order
    public void PlaceOrder(String Name, String Country, String City, String Credit_card, String Month, String Year)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tbodyid\"]/tr[1]")));
        driver.findElement(By.xpath("//button[text() = 'Place Order']")).click();
        driver.findElement(By.xpath("//input[@id = 'name']")).sendKeys(Name);
        driver.findElement(By.xpath("//input[@id = 'country']")).sendKeys(Country);
        driver.findElement(By.xpath("//input[@id = 'city']")).sendKeys(City);
        driver.findElement(By.xpath("//input[@id = 'card']")).sendKeys(Credit_card);
        driver.findElement(By.xpath("//input[@id = 'month']")).sendKeys(Month);
        driver.findElement(By.xpath("//input[@id = 'year']")).sendKeys(Year);


    }

    //Purchase button
    public void purchase()
    {
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        driver.findElement(By.xpath("//div[@id = 'orderModal']/div/div/div[3]/button[1]")).click();
    }

    //Close button
    public void PlaceOrder_closeButton()
    {
        driver.findElement(By.xpath("//div[@id = 'orderModal']/div/div/div[3]/button[1]")).click();
    }
}
