package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox_test {
    @Test
    public void firefox() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        WebElement a = driver.findElements(By.tagName("button")).get(0);
        a.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println( driver.findElement(By.id("result")).getText());
    }
}
