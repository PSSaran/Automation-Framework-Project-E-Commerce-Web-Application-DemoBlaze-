package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class web_table {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:/IDLE/Practise/Selenium-maven/src/main/Driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement table1 = driver.findElement(By.id("table1"));
        List<WebElement> headers = table1.findElements(By.tagName("th"));

        List<WebElement> Allrows = table1.findElements(By.cssSelector("tbody tr"));
        System.out.println(Allrows.size());
        for (WebElement row : Allrows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String Last_name = cells.get(1).getText();
            System.out.println(Last_name);
            if (Last_name.equals("Jason"))
            {
                cells.get(5).findElement(By.linkText("edit")).click();
                break;
//            }
//            String name = table1.findElement(By.tagName("td")).getText();
//            System.out.println(name);

        }

    }
}}

