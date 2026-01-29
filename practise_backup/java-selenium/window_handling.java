package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class window_handling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" ,
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getCurrentUrl());
        Set<String> window = driver.getWindowHandles();
        List<String> windowHandles = new ArrayList<String>(window);
        System.out.println(windowHandles);
        driver.switchTo().window(windowHandles.get(1));
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(windowHandles.get(0));
        driver.close();
        driver.switchTo().window(windowHandles.get(1));
        System.out.println(driver.getCurrentUrl());
//        Thread.sleep(4000);
       driver.quit();
    }
}
