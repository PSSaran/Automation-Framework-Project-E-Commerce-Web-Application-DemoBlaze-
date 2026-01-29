package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class alerts {
    RemoteWebDriver driver;
    @Test
    @Parameters({"browser"})
    public  void alerts(String Browser) {
        System.setProperty("webdriver.chrome.driver" ,
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        if(Browser.equals("chrome")){
            driver = new ChromeDriver();

        }
        else if(Browser.equals("firefox")){
            driver = new FirefoxDriver();

        }
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        WebElement a = driver.findElements(By.tagName("button")).get(0);
        a.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println( driver.findElement(By.id("result")).getText());
//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");

    }
}
