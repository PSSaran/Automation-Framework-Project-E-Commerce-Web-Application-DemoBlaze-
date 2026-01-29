package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home_page {
    WebDriver driver;
    JavascriptExecutor js;
    WebDriverWait wait;
    //catagories
    //phones

    //constructor
    public Home_page(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void Phones()
    {
       driver.findElement(By.xpath("//div[@class='list-group']/a[2]")).click();
    }

    //Laptops
    public void Laptops()
    {

        js = (JavascriptExecutor) driver;
//        driver.findElement(By.xpath("//div[@class='list-group']/a[3]")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='logInModal']/div/div")));
        WebElement laptop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='tbodyid']/div[6]/div/a")));

//        js.executeScript("arguments[0].scrollIntoView()", laptop);
        laptop.click();

    }

    //Monitors
    public void Monitors()
    {
        driver.findElement(By.xpath("//div[@class='list-group']/a[4]")).click();

    }

}
