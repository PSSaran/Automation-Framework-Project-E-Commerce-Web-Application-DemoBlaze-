package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.classfile.Attribute;

public class testing {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.findElement(By.xpath("//select[@id='dropdown']")).click();
//        driver.findElement(By.xpath("//select[@value='2']")).click();
       driver.findElements(By.tagName("option")).get(2).click();
    }
}
