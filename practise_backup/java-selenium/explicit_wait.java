package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicit_wait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.tagName("button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']"))).getText();
//        System.out.println(text);
        WebElement hello = driver.findElement(By.id("finish"));
        wait.until(ExpectedConditions.visibilityOf(hello));
        Boolean finals = hello.isDisplayed();
        if(finals){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

    }
}
