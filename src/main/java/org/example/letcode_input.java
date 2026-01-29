package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class letcode_input {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-extensions");
        options.addArguments("--blink-settings=imagesEnabled=false");
        options.addArguments("--disable-notifications");
//        options.addArguments("--headless=new"); // optional if you don’t need GUI
        ChromeDriver driver = new ChromeDriver(options);


        driver.get("https://letcode.in/");
        driver.findElement(By.xpath("//a[@href='/test' and text()='Explore Workspace']")).click();
        driver.findElement(By.xpath("//a[@href='/edit']")).click();

    }
}
