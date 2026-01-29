package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


import java.io.*;

public class screen_shot {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        File one = driver.getScreenshotAs(OutputType.FILE);
        File paths = new File("D:/IDLE/Practise/Selenium-maven/src/main/java/org/example/sample");
        paths.mkdir();
        File path = new File("D:/IDLE/Practise/Selenium-maven/src/main/java/org/example/sample/img.png");
        try {
            FileHandler.copy(one, path);
        }
        catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println(path);


    }
}
