package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        WebElement a = driver.findElements(By.tagName("button")).get(0);
        a.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println( driver.findElement(By.id("result")).getText());

    }
}
